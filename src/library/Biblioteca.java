package library;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String fone;
    private String email;
    private String endereco;
    private String cnpj;
    private ArrayList<ItemMultimidia> acervo; //Agregação
    
    public Biblioteca(String nome, String fone, String email, String endereco, String cnpj,
            ArrayList<ItemMultimidia> acervo) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.acervo = acervo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
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
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public ArrayList<ItemMultimidia> getAcervo() {
        return acervo;
    }
    public void setAcervo(ArrayList<ItemMultimidia> acervo) {
        this.acervo = acervo;
    }

}
