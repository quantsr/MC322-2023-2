package library;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class ReservaSala extends Recursos{
    private LocalDate dataReserva;
    private LocalDate horaInicio;
    private LocalDate horaFim; 

    public ReservaSala(LocalDate dataReserva, LocalDate horaInicio, LocalDate horaFim, int id) {
        super(id);
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    class SalaIndividual{
        boolean temComputador;
        int numeroSala;
    }
    class SalaGrupo{
        int capacidadeMaxima;
        boolean temRecurso;
    }
    class SalaSilenciosa{
        int numeroAssentos;
        boolean temCabines;
    }
    class SalaMultimidia{
        boolean gravadorAudio;
        boolean gravadorCD;
        boolean gravadorDVD;
        boolean editorAudio;
        boolean leitorCD;
        boolean leitorDVD;
    }

    enum StatusReserva{
        PENDENTE,
        CONFIRMADA,
        CANCELADA
    }
}
