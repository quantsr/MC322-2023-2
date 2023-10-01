package library;

public class SalaSilenciosa extends Sala {
    int numeroAssentos;
    boolean temCabines;
    public SalaSilenciosa(int id, int numeroAssentos, boolean temCabines) {
        super(id, numeroAssentos);
        this.numeroAssentos = numeroAssentos;
        this.temCabines = temCabines;
    }
    public int getNumeroAssentos() {
        return numeroAssentos;
    }
    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }
    public boolean isTemCabines() {
        return temCabines;
    }
    public void setTemCabines(boolean temCabines) {
        this.temCabines = temCabines;
    }
}
