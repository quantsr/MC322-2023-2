package library;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventosBiblioteca {
    
    private ArrayList<Membro> membrosBiblioteca;

    public boolean addMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                System.out.println("O membro de ID "+ID+" ja se encontra cadastrado. Operacao abortada.");
                return false;
            }
        }
        Membro membro = new Membro(ID);
        membrosBiblioteca.add(membro);
        System.out.println("Membro de ID "+ID+" adicionado com sucesso.");
        return true;
    }
    public boolean removeMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                int index = membrosBiblioteca.indexOf(m);
                membrosBiblioteca.remove(index);
                System.out.println("Membro de ID "+ID+" removido com sucesso.");
                return true;
            }
        }
        System.out.println("Nao foi possivel remover o membro de ID "+ID+". Operacao abortada.");
        return false;
    }
    public boolean hasMembro(int ID){
        for(Membro m : membrosBiblioteca){
            if(m.getId() == ID){
                return true;
            }
        }
        return false;
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
