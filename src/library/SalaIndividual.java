package library;

public class SalaIndividual extends Sala {
    boolean temComputador;
    int numeroSala;
    
    public SalaIndividual(int id, boolean temComputador, int numeroSala) {
        super(id, 1);
        this.temComputador = temComputador;
        this.numeroSala = numeroSala;
    }
    public boolean isTemComputador() {
        return temComputador;
    }
    public void setTemComputador(boolean temComputador) {
        this.temComputador = temComputador;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

}

