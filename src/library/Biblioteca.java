package library;
import usuario.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import exceptions.ExcecaoIdExistente;


public class Biblioteca {
    private String nome;
    private String fone;
    private String email;
    private String endereco;
    private String cnpj;
    private HashMap<Integer, ItemMultimidia> acervo;
    private ArrayList<Membro> membrosBiblioteca;
    private HashSet<Emprestimo> emprestimos; 
    private LinkedList<Reserva> reservas;
    private HashSet<Categoria> categorias;
    private ArrayList<Sala> salas;
    private ArrayList<ReservaSala> reservasSala; 
    
    
    
    public Biblioteca(String nome, String fone, String email, String endereco, String cnpj,
           HashMap<Integer, ItemMultimidia> acervo, ArrayList<Membro> membrosBiblioteca, HashSet<Emprestimo> emprestimos, LinkedList<Reserva> reservas, HashSet<Categoria> categorias, ArrayList<Sala> salas, ArrayList<ReservaSala> reservasSala) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.acervo = acervo;
        this.membrosBiblioteca = membrosBiblioteca;
        this.emprestimos = emprestimos;
        this.reservas = reservas;
        this.categorias = categorias;
        this.salas = salas;
        this.reservasSala = reservasSala;
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
    public HashSet<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(HashSet<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(LinkedList<Reserva> reservas) {
        this.reservas = reservas;
    }
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    public ArrayList<ReservaSala> getReservasSala() {
        return reservasSala;
    }
    public void setReservasSala(ArrayList<ReservaSala> reservasSala) {
        this.reservasSala = reservasSala;
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
        try {
            if(consulta != null){
                throw new ExcecaoIdExistente("Item de ID existente.");
            }else{
                Scanner input = new Scanner(System.in);

                System.out.println("ID:");
                int id = (input.nextInt());

                System.out.println("Titulo:");
                String titulo = (input.nextLine());

                System.out.println("Autor:");
                String autor = (input.nextLine());

                System.out.println("Editora:");
                String editora = (input.nextLine());

                System.out.println("Ano:");
                int ano = (input.nextInt());
                
                System.out.println("Genero:");
                String genero = (input.nextLine());

                System.out.println("Sinopse:");
                String sinopse = (input.nextLine());

                System.out.println("Disponivel Y/N:");
                boolean disponivel = false;
                if(input.nextLine() == "Y" || input.nextLine() == "y"){
                    disponivel = true;
                }else if(input.nextLine() == "N" || input.nextLine() == "n"){
                    disponivel = false;
                }

                System.out.println("1: Livro fisico\n2: Livro Digital\n3: CD de audio\n4: DVD de video\n5: Outro Recurso Multimidia");
                int itemTipo = input.nextInt();
                
                switch(itemTipo){
                    case 1:
                        System.out.println("ISBN: ");
                        String isbn = input.nextLine();

                        System.out.println("Edicao: ");
                        int edicao = input.nextInt();

                        System.out.println("Numero total de copias por edicao: ");
                        int copias = input.nextInt();
                        
                        System.out.println("Localizacao na biblioteca: ");
                        String local = input.nextLine();

                        System.out.println("Estado de Conservacao: ");
                        System.out.println("Disponivel Y/N:");
                        boolean conservado = false;
                        if(input.nextLine() == "Y" || input.nextLine() == "y"){
                            conservado = true;
                        }else if(input.nextLine() == "N" || input.nextLine() == "n"){
                            conservado = false;
                        }
                        ItemMultimidia item = new LivroFisico(id, titulo, autor, editora, ano, genero, sinopse, "", disponivel, isbn, edicao, copias, local, conservado);
                        this.acervo.put(id, item);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;    
                }
                
                acervo.put(ID, new ItemMultimidia(ID));
                System.out.println("Item de ID "+ID+" cadastrado com sucesso.");
                input.close();
                return true;
            }
        } catch (ExcecaoIdExistente e) {
            System.err.println("Erro ao cadastrar item:"+ e.getMessage());
            return false;
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
        if(reservas.removeIf(i -> i.compareTo(reserva) == 0)){
            return true;
        }
        else{
            System.out.println("Reserva nao se encontra cadastrada na lista de reservas.");
            return false;
        }
        // for (Reserva objReserva : reservas) {
        //     if (objReserva.compareTo(reserva) == 0)
        //     {
        //         reservas.remove(reserva);
        //         return true;
        //     }
        // }
        // System.out.println("Reserva nao se encontra cadastrada na lista de reservas.");
        // return false;
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
    public void addSala(Sala sala){
        this.salas.add(sala);
    }
    public boolean removeSala(int id){
        return salas.removeIf(i -> i.getId() == id);
    }
    public String listSala(){
        String str = "";
        for(Recursos sala: salas){
            str += "Id: " + sala.getId()+"\n";
        }
        return str;
    }
    public void addReservaSala(ReservaSala sala){
        this.reservasSala.add(sala);
    }
    public void removeReservaSala(ReservaSala sala){
        this.reservasSala.removeIf(i -> i.getId() == sala.getId());
    }

}
