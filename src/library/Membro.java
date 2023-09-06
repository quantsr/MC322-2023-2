package library;

import java.util.ArrayList;

public class Membro {
    private int id;
    private String nome;
    private String cpf;
    private String phone;
    private String email;
    private String endereço;
    private ArrayList<Multa> multas;  //composição

    
    public Membro(int id, String nome, String cpf, String phone, String email, String endereço,
            ArrayList<Multa> multas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.endereço = endereço;
        this.multas = multas;
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
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public ArrayList<Multa> getMultas() {
        return multas;
    }
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
}
