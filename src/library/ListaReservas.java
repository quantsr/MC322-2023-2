package library;

import java.util.ArrayList;


public class ListaReservas<T extends Recursos> {
    private ArrayList<T> itensReservados;
    private int numeroDeItensReservados;
    
    public ListaReservas(ArrayList<T> itensReservados){
        this.itensReservados = itensReservados;
        this.numeroDeItensReservados = 0;
    }

    public void adicionarReserva(T item){
        //adiciona reserva a lista
        boolean reservado = false;
        for(T i : this.itensReservados){
            if(i.getId() == item.getId()){
                //throw exception later
                reservado = true;
                System.out.println("Não foi possível adicionar o item de id "+ item.getId() +" na lista de reservas, pois já está reservado" );
            }
        }
        if(!reservado){
            this.itensReservados.add(item);
            this.numeroDeItensReservados++;
        }
    }

    public void retirarReserva(T item){
        if(this.itensReservados.removeIf(i -> i.getId() == item.getId())){
            this.numeroDeItensReservados--;
        }
    }

}