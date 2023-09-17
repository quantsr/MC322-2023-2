package library;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class Reserva {
    private ItemMultimidia item; //associação
    private Membro donoReserva; //associação
    private LocalDate diaRetirada; //composição

    public static void listaReservas (String[] args) {
        List<String> reservas = new LinkedList<>();

        // Adicionando reservas
        reservas.add("O Hobbit, João Pedro Melo, 20/09");
        reservas.add("Uma breve historia do tempo, Max Arruda, 21/09");
        reservas.add("Introdução a algoritmos, Miguel Vargas, 22/09");

        // Acessando reservas por posições
        String reservas = reservas.get(1); //"O Hobbit"
        String reservas = reservas.get(2); //"Uma breve historia do tempo"
        String reservas = reservas.get(3); //"Introdução a algoritimos"

        //Iterando pela lista
        for (String reserva : reservas) {
            System.out.println(reserva);
        }
    }   
    
    public Reserva(ItemMultimidia item, Membro donoReserva, LocalDate diaRetirada) {
        this.item = item;
        this.donoReserva = donoReserva;
        this.diaRetirada = diaRetirada;
    }
    public ItemMultimidia getItem() {
        return item;
    }
    public void setItem(ItemMultimidia item) {
        this.item = item;
    }
    public Membro getDonoReserva() {
        return donoReserva;
    }
    public void setDonoReserva(Membro donoReserva) {
        this.donoReserva = donoReserva;
    }
    public LocalDate getDiaRetirada() {
        return diaRetirada;
    }
    public void setDiaRetirada(LocalDate diaRetirada) {
        this.diaRetirada = diaRetirada;
    }
}
