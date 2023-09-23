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
        /*checar se o item ja se encontra reservado em itensReservados(checa pelo ID do item)
        *
        * to do
        *
        */
        //se nao
        this.itensReservados.add(item);
        this.numeroDeItensReservados++;
    }
    
    public void emprestarItem(T item){
        /* checar se o item ja se encontra emprestado itensEmprestados(checa pelo id do item)
        *
        * to do
        *
        */
        //se nao
        this.itensEmprestados.add(item);
        this.numeroDeItensEmprestados++;
    }

    public void devolverItem(T item){
        for(T i : this.itensEmprestados){
            if(i.getId() == item.getId()){
                int index = this.itensEmprestados.indexOf(i);
                this.itensEmprestados.remove(index);
                this.numeroDeItensEmprestados--;
            }
        }
    }

}
