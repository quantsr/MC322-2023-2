package library;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class ReservaSala {
    private LocalDate dataReserva;
    private LocalDate horaInicio;
    private LocalDate horaFim; 

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
