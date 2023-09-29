package library;
import usuario.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Biblioteca {
    private String nome;
    private String fone;
    private String email;
    private String endereco;
    private String cnpj;
    private HashMap<Integer, ItemMultimidia> acervo;
    private ArrayList<Membro> membrosBiblioteca;
    private HashSet<Emprestimo> emprestimos; 
    private List<Reserva> reservas = new LinkedList<>();
    private HashSet<Categoria> categorias; 
    
    public Biblioteca(String nome, String fone, String email, String endereco, String cnpj,
           HashMap<Integer, ItemMultimidia> acervo, ArrayList<Membro> membrosBiblioteca) {
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
    public HashMap<Integer, ItemMultimidia> getAcervo() {
        return acervo;
    }
    public void setAcervo(HashMap<Integer, ItemMultimidia> acervo) {
        this.acervo = acervo;
    }
    public ArrayList<Membro> getMembros() {
        return membrosBiblioteca;
    }
    public void setMembros(ArrayList<Membro> membrosBiblioteca) {
        this.membrosBiblioteca = membrosBiblioteca;
    }
    public boolean addMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                System.out.println("O membro de ID "+ID+" ja se encontra cadastrado. Operacao abortada.");
                return false;
            }
        }
        Membro membro = new Membro(ID);
        membrosBiblioteca.add(membro);
        System.out.println("Membro de ID "+ID+" adicionado com sucesso.");
        return true;
    }
    public boolean removeMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                int index = membrosBiblioteca.indexOf(m);
                membrosBiblioteca.remove(index);
                System.out.println("Membro de ID "+ID+" removido com sucesso.");
                return true;
            }
        }
        System.out.println("Nao foi possivel remover o membro de ID "+ID+". Operacao abortada.");
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

    public boolean addItem(int ID){
        ItemMultimidia consulta = acervo.get(ID);
        if(consulta != null){
            System.out.println("O livro de ID "+ID+" ja se encontra no acervo. operacao abortada.");
            return false;
        }else{
            acervo.put(ID, new ItemMultimidia(ID));
            System.out.println("Item de ID "+ID+" cadastrado com sucesso.");
            return true;
        }
    }
    public boolean removeItem(int ID){
        ItemMultimidia consulta = acervo.remove(ID);
        if(consulta == null){
            return false;
        }else{
            return true;
        }
    }
    public boolean addEmprestimo(Emprestimo emprestimo){
        return emprestimos.add(emprestimo);
    }
    public boolean removeEmprestimo(Emprestimo emprestimo){
        return emprestimos.remove(emprestimo);
    }
    public boolean hasEmprestimo(Emprestimo emprestimo){
        return emprestimos.contains(emprestimo);
    }
    public boolean addReserva(Reserva reserva){
        for (Reserva objReserva : reservas) {
            if (objReserva.compareTo(reserva) == 0)
            {
                System.out.println("A reserva ja se encontra na lista de reservas. Abortando operacao.");
                return false;
            } 
        }
        reservas.add(reserva);
        return true;
    }

    public boolean removeReserva(Reserva reserva){
        for (Reserva objReserva : reservas) {
            if (objReserva.compareTo(reserva) == 0)
            {
                reservas.remove(reserva);
                return true;
            }
        }
        System.out.println("Reserva nao se encontra cadastrada na lista de reservas.");
        return false;
    }

    public boolean hasReserva(Reserva reserva){
        for (Reserva objReserva : reservas) {
            if (objReserva.compareTo(reserva) == 0)
            {
                System.out.println("A reserva ja se encontra na lista de reservas. Abortando operacao.");
                return true;
            } 
        }
        System.out.println("Reserva nao se encontra cadastrada na lista de reservas.");
        return false;

    }
    public boolean addCategoria(Categoria categoria){
        return categorias.add(categoria);
    }
    public boolean removeCategoria(Categoria categoria){
        return categorias.remove(categoria);
    }
    public boolean hasCategoria(Categoria categoria){
        return categorias.contains(categoria);
    }
}
