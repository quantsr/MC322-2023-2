package library;



public class SalaGrupo extends Sala {
    int capacidadeMaxima;
    boolean temRecurso;
    
    public SalaGrupo(int id, int capacidadeMaxima, boolean temRecurso) {
        super(id, capacidadeMaxima);
        this.temRecurso = temRecurso;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public boolean isTemRecurso() {
        return temRecurso;
    }
    public void setTemRecurso(boolean temRecurso) {
        this.temRecurso = temRecurso;
    }
}

