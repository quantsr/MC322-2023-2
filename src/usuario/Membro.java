package usuario;
import library.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

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

    public boolean makeDevolucao(Emprestimo emprestimo, Biblioteca library){
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