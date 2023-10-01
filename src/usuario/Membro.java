package usuario;
import library.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

import exceptions.ExcecaoCapacidadeExcedida;
import exceptions.ExcecaoItemDanificado;
import exceptions.ExcecaoSalaReservada;

public class Membro {
    private String nome;
    private int id;
    private String endereco;
    private String contato;
    private LocalDate dataRegistro; 

    private ArrayList<Multa> multas; 
    private LinkedList<Emprestimo> emprestimos;

    //Constructor
    public Membro(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;        
        this.contato = contato;
        this.dataRegistro = dataRegistro;
        this.multas = multas;
        this.emprestimos = emprestimos;
    }

    public Membro(int ID){
        this.nome = this.endereco = this.contato = "";
        this.dataRegistro = LocalDate.now();
        this.multas = new ArrayList<>();
        this.emprestimos = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public ArrayList<Multa> getMultas() {
        return multas;
    }
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
    public LinkedList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(LinkedList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public boolean makeEmprestimo(ItemMultimidia item, Biblioteca library){
        return true;
    }

    public boolean makeReserva(ItemMultimidia item, Biblioteca library){
        return true;
    }

    public boolean makeReserva(ReservaSala sala, int qtdPessoas, Biblioteca library){
        boolean hasReserva = false;
        for(ReservaSala s : library.getReservasSala()){
            if(s.getId() == sala.getId()){
                hasReserva = true;
                //throw exception
                System.out.println("Reserva ja se encontra cadastrada");
                return false;
            }    
        }
        if(!hasReserva){
            //checa se inicio das reservas infringe ReservaSala sala
            boolean conflitoHorario = false;
            for(ReservaSala i : library.getReservasSala()){
                if(i.getHoraInicio().compareTo(sala.getHoraInicio())== 1 && i.getHoraInicio().compareTo(sala.getHoraFim())== -1){
                    conflitoHorario = true;
                }
                //checa se final das reservas infringe ReservaSala sala
                if(i.getHoraFim().compareTo(sala.getHoraInicio())== 1 && i.getHoraFim().compareTo(sala.getHoraFim())== -1){
                    conflitoHorario = true;
                }
            }
            try{
                if(conflitoHorario){
                    throw new ExcecaoSalaReservada("Sala ja se encontra reservada neste horario.");
                }else{
                    //checa limite de sala
                    try{
                        if(qtdPessoas > sala.getSala().getCapacidadeMax()){
                            throw new ExcecaoCapacidadeExcedida("Capacidade maxima ultrapassada.");
                        }else{
                            library.addReservaSala(sala);
                            return true;
                        }
                    }catch (ExcecaoCapacidadeExcedida e){
                        System.err.println("Erro ao reservar sala: "+ e.getMessage());
                        return false;
                    }
                    
                }
            }catch (ExcecaoSalaReservada e){
                System.err.println("Erro ao reservar sala: "+ e.getMessage());
                return false;
            }

        }else{
            //throw exception
            System.out.println("Reserva ja se encontra cadastrada.");
            return false;
        }
    }
    
    public boolean makeDevolucao(Emprestimo emprestimo, Biblioteca library) throws ExcecaoItemDanificado{
        return true;
    }

    public void addMulta(Multa m){
        this.multas.add(m);
    }

    public boolean Renovacao(Emprestimo emprestimo, Biblioteca library){
        //to be implemented in child classes. DO NOT FORGET FUTURE-MAX
        return true;
    }

    public String toString(){
        int multaPaga = 0;
        for(Multa e : this.getMultas()){
            if(e.isPago()){
                multaPaga++;
            }
        }
        return getId()+" - "+getNome()+" - Multas pagas: "+multaPaga+"/"+getMultas().size()+" - Emprestimos: "+getEmprestimos().size();
    }
}