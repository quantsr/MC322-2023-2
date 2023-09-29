package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import library.Biblioteca;
import library.Emprestimo;
import library.ItemMultimidia;
import library.Multa;
import library.Reserva;

public class Graduacao extends Universidade {

    public Graduacao(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
    }

    @Override
    public boolean makeEmprestimo(ItemMultimidia item, Biblioteca library){
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
        if(this.getEmprestimos().size() == 3){
            //throw exception
            System.out.println("Limite de emprestimo excedido.");
            return false;
        }
        //checar se item esta disponivel para emprestimo
        if(!item.isDisponivel()){
            //Throw exception in future
            System.out.println("Item de ID "+item.getId()+" nao se encontra disponivel.");
            return false;
        }
        //checar se tem multas pendentes
        for(Multa m : this.getMultas()){
            if(!m.isPago()){
                //throw exception
                System.out.println("O usuario possui uma ou mais multas pendentes.");
                return false;
            }
        }
        //realizar emprestimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(15);
        
        Emprestimo emprestimo = new Emprestimo(item, dataEmprestimo, dataDevolucao, this);
        this.getEmprestimos().add(emprestimo);
        item.setDisponivel(false);
        return library.addEmprestimo(emprestimo);
    }
    
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
                    //data retirada nao pode ser a mesma que a data de devolucao para evitar conflitos
                    dataRetirada = e.getDataDevolucao().plusDays(1);
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
        if(!this.getEmprestimos().removeIf(i -> i.getItem().getId() == emprestimo.getItem().getId())){
            System.out.println("Nao foi possivel realizar a devolucao do emprestimo.");
            return false;
        }
        else if(!library.getEmprestimos().removeIf(i -> i.getItem().getId() == emprestimo.getItem().getId())){
            System.out.println("Nao foi possivel realizar a devolucao do emprestimo.");
            return false;
        }
        else{
            return true;
        }
    }

}
