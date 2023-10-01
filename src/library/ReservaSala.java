package library;
import java.time.LocalDate;

public class ReservaSala extends Recursos{
    private LocalDate dataReserva;
    private LocalDate horaInicio;
    private LocalDate horaFim;
    private Sala sala;
    

    private StatusReserva status; 

    enum StatusReserva{
        PENDENTE,
        CONFIRMADA,
        CANCELADA
    }
    public ReservaSala(LocalDate dataReserva, LocalDate horaInicio, LocalDate horaFim, int id) {
        super(id);
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }


    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDate horaFim) {
        this.horaFim = horaFim;
    }
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }
}
