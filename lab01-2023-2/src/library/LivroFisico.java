package library;

public class LivroFisico extends ItemMultimidia {
    private int numeroPaginas;

    public LivroFisico(int id, String nome, String genero, String autor, String ano, boolean disponivel, int numeroPaginas) {
        super(id, nome, genero, autor, ano, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }    
}
