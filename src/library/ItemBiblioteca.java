package library;

import java.util.ArrayList;


public class ItemBiblioteca<T extends ItemMultimidia> {
    private  ArrayList<T> itensReservados;
    private  ArrayList<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;
    
    public ItemBiblioteca(){
        this.itensReservados = new ArrayList<T>();
        this.itensEmprestados = new ArrayList<T>();
        this.numeroDeItensEmprestados = this.numeroDeItensReservados = 0;
    }
    public ItemBiblioteca( ArrayList<T> itensReservados,  ArrayList<T> itensEmprestados){
        this.itensReservados = itensReservados;
        this.itensEmprestados = itensEmprestados;
        this.numeroDeItensEmprestados = itensEmprestados.size(); 
        this.numeroDeItensReservados = itensReservados.size();
    }

    public void reservarItem(T item){
        //checar se o item ja se encontra reservado em itensReservados(checa pelo ID do item)
        boolean reservado = false;
        for(T i : this.itensReservados){
            if(i.getId() == item.getId()){
                //throw exception later
                reservado = true;
                System.out.println("O item de ID "+ item.getId() +" ja se encontra reservado.  Operacao abortada" );
            }
        }
        if(!reservado){
            this.itensReservados.add(item);
            this.numeroDeItensReservados++;
        }
    }
    
    public void emprestarItem(T item){
        // checar se o item ja se encontra emprestado itensEmprestados(checa pelo id do item)
        boolean emprestado = false;
        for(T i : this.itensEmprestados){
            if(i.getId() == item.getId()){
                //throw exception later
                emprestado = true;
                System.out.println("O item de ID "+ item.getId() +" ja se encontra emprestado.  Operacao abortada" );
            }
        }
        if(!emprestado){       
            this.itensEmprestados.add(item);
            this.numeroDeItensEmprestados++;
        }
    }

    public void devolverItem(T item){
        if(this.itensEmprestados.removeIf(i -> i.getId() == item.getId())){
            this.numeroDeItensEmprestados--;
        }
        else{
            System.out.println("Item de ID "+item.getId()+ " nao se encontra na lista de emprestados no momento.");
        }
    }
    public ArrayList<T> getItensReservados() {
        return itensReservados;
    }
    public void setItensReservados(ArrayList<T> itensReservados) {
        this.itensReservados = itensReservados;
    }
    public ArrayList<T> getItensEmprestados() {
        return itensEmprestados;
    }
    public void setItensEmprestados(ArrayList<T> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }
    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }
    public void setNumeroDeItensEmprestados(int numeroDeItensEmprestados) {
        this.numeroDeItensEmprestados = numeroDeItensEmprestados;
    }
    public int getNumeroDeItensReservados() {
        return numeroDeItensReservados;
    }
    public void setNumeroDeItensReservados(int numeroDeItensReservados) {
        this.numeroDeItensReservados = numeroDeItensReservados;
    }

}
