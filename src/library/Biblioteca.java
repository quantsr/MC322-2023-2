package library;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String fone;
    private String email;
    private String endereco;
    private String cnpj;
    private ArrayList<ItemMultimidia> acervo; //Agregação
    private ArrayList<Membro> membrosBiblioteca;
    
    public Biblioteca(String nome, String fone, String email, String endereco, String cnpj,
            ArrayList<ItemMultimidia> acervo, ArrayList<Membro> membrosBiblioteca) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.acervo = acervo;
        this.membrosBiblioteca = membrosBiblioteca;
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
    public ArrayList<Membro> getMembros() {
        return membrosBiblioteca;
    }
    public void setMembros(ArrayList<Membro> membrosBiblioteca) {
        this.membrosBiblioteca = membrosBiblioteca;
    }
    public boolean addMembro(Membro membro){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == membro.getId()){
                System.out.println("O membro de ID "+membro.getId()+" ja se encontra cadastrado.");
                return false;
            }
        }
        membrosBiblioteca.add(membro);
        return true;
    }
    public boolean removeMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                int index = membrosBiblioteca.indexOf(m);
                membrosBiblioteca.remove(index);
                return true;
            }
        }
        System.out.println("Nao foi possivel remover o membro de ID "+ID);
        return false;
    }
    public boolean hasMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                return true;
            }
        }
        return false;
    }

}
