package library;
import java.time.LocalDate;
import java.util.ArrayList;

public class EventosBiblioteca {
    class Palestra{
        String palestrante;
        String topico;
        LocalDate horario;
        String local;
    }
    class Workshop{
        String instrutor;
        String topico;
        ArrayList<String> materialNecessario = new ArrayList<String>();
        LocalDate data;
        LocalDate horario;
        String local;
    }
    class Exposição{
        String tema;
        ArrayList<String> expositor = new ArrayList<String>();
        String duracao;
        String local;
    }
    enum TipoDeEvento{
        PALESTRA,
        WORKSHOP,
        EXPOSIÇÃO
    }
}
