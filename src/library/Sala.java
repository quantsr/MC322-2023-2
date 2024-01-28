package library;

public class Sala extends Recursos{
    private int capacidadeMax;
    
    public Sala(int id, int capacidadeMax) {
        super(id);
        this.capacidadeMax = capacidadeMax;
    }
    
    public int getCapacidadeMax() {
        return capacidadeMax;
    }
    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
}
