package library;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Membro {
    private int id;
    private String nome;
    private String cpf;
    private String phone;
    private String email;
    private String endereco;
    private ArrayList<Multa> multas;  //composição
    private List<Emprestimo> emprestimos = new LinkedList<>();

    
    public Membro(int id, String nome, String cpf, String phone, String email, String endereco,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.endereco = endereco;
        this.multas = multas;
        this.emprestimos = emprestimos;
    }
    public Membro(int ID){
        this.id = ID;
        this.nome = this.cpf = this.phone = this.email = this.endereco = "";
        this.multas = new ArrayList<Multa>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Multa> getMultas() {
        return multas;
    }
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
