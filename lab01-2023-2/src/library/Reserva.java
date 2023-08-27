package library;

import java.time.LocalDate;

public class Reserva {
    private ItemMultimidia item; //associação
    private Membro donoReserva; //associação
    private LocalDate diaRetirada; //composição

    
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
