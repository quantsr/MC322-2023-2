package library;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class ReservaSala {
    private LocalDate dataReserva;
    private LocalDate horaInicio;
    private LocalDate horaFim;

    public static void listaReservasSala (String[] args) {
        List<String> reservasSala = new LinkedList<>();

        // Adicionando reservas
        reservasSala.add("20/09, 12:00, 14:00");
        reservasSala.add("20/09, 14:30, 18:00");
        reservasSala.add("21/09, 8:00, 16:00");

        // Acessando reservas por posições
        String reservasSala = reservasSala.get(1); //"Primeira reserva"
        String reservasSala = reservasSala.get(2); //"Segunda reserva"
        String reservasSala = reservasSala.get(3); //"Terceira reserva"

        //Iterando pela lista
        for (String ReservaSala : reservasSala) {
            System.out.println(reservaSala);
        }
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
