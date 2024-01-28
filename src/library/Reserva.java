package library;
import usuario.*;

import java.time.LocalDate;

public class Reserva implements Comparable<Reserva>{
    private ItemMultimidia item; 
    private Membro donoReserva; 
    private LocalDate diaRetirada; 
    
    public Reserva(ItemMultimidia item, Membro donoReserva, LocalDate diaRetirada) {
        this.item = item;
        this.donoReserva = donoReserva;
        this.diaRetirada = diaRetirada;
    }

    //getters and setters
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

    @Override
    public int compareTo(Reserva o) {
        // TODO Auto-generated method stub
        if(this.getItem().getId() == o.getItem().getId() && this.getDiaRetirada().isEqual(o.getDiaRetirada()) && this.getDonoReserva().getId() == o.getDonoReserva().getId()){
            return 0;
        }
        if(this.getItem().getId() == o.getItem().getId() && this.getDiaRetirada().isAfter(o.getDiaRetirada()) && this.getDonoReserva().getId() == o.getDonoReserva().getId()){
            return 1;
        }
        if(this.getItem().getId() == o.getItem().getId() && this.getDiaRetirada().isBefore(o.getDiaRetirada()) && this.getDonoReserva().getId() == o.getDonoReserva().getId()){
            return -1;
        }
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    
        
    }
}
