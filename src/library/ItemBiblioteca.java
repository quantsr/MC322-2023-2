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
        for(T i : this.itensEmprestados){
            if(i.getId() == item.getId()){
                int index = this.itensEmprestados.indexOf(i);
                this.itensEmprestados.remove(index);
                this.numeroDeItensEmprestados--;
            }
        }
    }

}
