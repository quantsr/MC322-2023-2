package library;

import java.util.ArrayList;


public class ListaEmprestimos<T extends Recursos> {
    private ArrayList<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    //Getter ItensEmprestados
    public ArrayList<T> getItensEmprestados() {
        return itensEmprestados;
    }
    
    //Setter ItensEmprestados
    public void setItensEmprestados(ArrayList<T> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    
    
    public ListaEmprestimos(ArrayList<T> itensEmprestados){
        this.itensEmprestados = new ArrayList<T>();
        this.numeroDeItensEmprestados = 0;
    }
    
    //Adciona um emprestimo a lista
    public void adiconarEmprestimo(T item){
        // Checa se o item já está na lista de empréstimos
        boolean emprestado = false;
        for(T i : this.itensEmprestados){
            if(i.getId() == item.getId()){
                //throw exception later
                emprestado = true;
                System.out.println("Não foi possível adicionar o item de id "+ item.getId() +" na lista de empreśtimos, pois já está emṕrestado" );
            }
        }
        if(!emprestado){       
            this.itensEmprestados.add(item);
            this.numeroDeItensEmprestados++;
        }
    }

    //Remove um emprestimo da lista
    public void retirarEmprestimo(T item){
        if(this.itensEmprestados.removeIf(i -> i.getId() == item.getId())){
            this.numeroDeItensEmprestados--;
        }
    }
}