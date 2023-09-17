package library;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class EventosBiblioteca {
    
    public static void membrosEVentos (String[] args) {
        
        List<List<String>> eventos; //cria a lista de eventos
        //adiciona um novo evento
        eventoUm = new ArrayList<List<String>>();
        //adiciona uma pessoa ao eventoUm
        eventoUm.get(0).add(new String("João Melo"));
        eventoUm.get(1).add(new String("Max Arruda"));
        eventoUm.get(2).add(new String("Miguel Vargas"));

        // Acessando membros por posições
        String eventos = eventos.get(1);
        for (String i = 0; i < eventos.size(); i++){
            eventos.get(i, membros.get(i));
        } 

        // Iterando pela lista
        for (String evento : eventos) {
            for (String membro : membros) {
                System.out.println(evento, membro);
            }
        }
    }

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
    class Exposicao{
        String tema;
        ArrayList<String> expositor = new ArrayList<String>();
        String duracao;
        String local;
    }
    enum TipoDeEvento{
        PALESTRA,
        WORKSHOP,
        EXPOSICAO
    }
}
