package usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;

import exceptions.*;
import library.*;


public class Funcionario extends Universidade{

    public Funcionario(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
        
    }

    @Override
    public boolean makeEmprestimo(ItemMultimidia item, Biblioteca library){
        try {
            //checa se item esta reservado por outra pessoa
            boolean reservado = false;
            for(Reserva r : library.getReservas()){
                if(r.getItem().getId() == item.getId() && r.getDonoReserva().getId() != this.getId()){
                    reservado = true;
                }
            }
            if(reservado){
                System.out.println("Item se encontra reservado para outra pessoa no momento.");
                return false;
            }
            //checar se limite de emprestimo foi atingido
            if(this.getEmprestimos().size() == 4){
                throw new ExcecaoLimiteEmprestimoExcedido("Limite de emprestimo excedido.");
            }
            //checar se item esta disponivel para emprestimo
            if(!item.isDisponivel()){
                throw new ExcecaoItemNaoDisponivel("Item de id: "+item.getId()+", "+item.getTitulo()+", nao se encontra disponivel.");
                
            }
            //checar se tem multas pendentes
            for(Multa m : this.getMultas()){
                if(!m.isPago()){
                    throw new ExcecaoMultaPendente("O usuario possui uma ou mais multas pendentes.");
                }
            }
            //realizar emprestimo
            LocalDate dataEmprestimo = LocalDate.now();
            LocalDate dataDevolucao = dataEmprestimo.plusDays(20);
            
            Emprestimo emprestimo = new Emprestimo(item, dataEmprestimo, dataDevolucao, this);
            this.getEmprestimos().add(emprestimo);
            item.setDisponivel(false);
            return library.addEmprestimo(emprestimo);
            
        } catch (ExcecaoLimiteEmprestimoExcedido e) {
            System.err.println("Erro ao fazer emprestimo: "+ e.getMessage());
            return false;
        } catch (ExcecaoItemNaoDisponivel e){
            System.err.println("Erro ao fazer emprestimo: "+ e.getMessage());
            return false;
        } catch (ExcecaoMultaPendente e){
            System.err.println("Erro ao fazer emprestimo: "+ e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean makeReserva(ItemMultimidia item, Biblioteca library){
        if(item.isDisponivel()){
            //throw exception
            System.out.println("Item se encontra disponivel no momento.");
            return false;
        }
        else{
            //data de retirada
            LocalDate dataRetirada = null;
            for(Emprestimo e : library.getEmprestimos()){
                if(e.getItem().getId() == item.getId()){
                    dataRetirada = e.getDataDevolucao().plusDays(20);
                }
            }
            if(dataRetirada == null){
                //throw exception
                System.out.println("Item nao se encontra na lista de emprestimo da biblioteca");
                return false;
            }
            else{
                Reserva reserva = new Reserva(item, this, dataRetirada);
                return library.addReserva(reserva);              
            }
        }
    }

    @Override
    public boolean makeDevolucao(Emprestimo emprestimo, Biblioteca library){
        try {
            boolean hasEmprestimoMembro = false;
            boolean hasEmprestimoBiblioteca = false;
            for(Emprestimo e : this.getEmprestimos()){
                if(e.getItem().getId() == emprestimo.getItem().getId()){
                    hasEmprestimoMembro = true;
                }
            }
            for(Emprestimo e : library.getEmprestimos()){
                if(e.getItem().getId() == emprestimo.getItem().getId()){
                    hasEmprestimoBiblioteca = true;
                }
            }
            if(!hasEmprestimoMembro || !hasEmprestimoBiblioteca){
                throw new ExcecaoItemNaoEmprestado("Item de ID: "+ emprestimo.getItem().getId()+", "+emprestimo.getItem().getTitulo()+", nao consta como emprestado pelo usuario.");
            }
            if(!emprestimo.getItem().isConservado()){
                throw new ExcecaoItemDanificado("Item a ser devolvido se encontra danificado ou precisa de manutencao");
            }
            else{
                //calcula multa
                LocalDate datadevolucao = emprestimo.getDataDevolucao();
                LocalDate dataAtual = LocalDate.now();
                Period periodo = Period.between(datadevolucao, dataAtual);
                //negativo(antes do tempo), positivo(multa) ou zero(no limite do prazo)
                if(periodo.getDays() > 0){
                    this.addMulta(new Multa(this, emprestimo,false, (float)(periodo.getDays()*0.75)));
                }
                this.getEmprestimos().remove(emprestimo);
                library.getEmprestimos().remove(emprestimo);
                emprestimo.getItem().setDisponivel(true);
                return true;
            }
            
        } catch (ExcecaoItemNaoEmprestado e) {
            System.err.println("Erro ao fazer devolucao: "+e.getMessage());
            return false;
        } catch (ExcecaoItemDanificado e) {
            System.err.println("Erro ao fazer devolucao: "+e.getMessage());
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString()+" - Funcionario";
    }
    
}
