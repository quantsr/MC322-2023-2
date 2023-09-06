package library;

public class LivroDigital extends ItemMultimidia{
    private int numeroPaginas;
    private int downloads;


    public LivroDigital(int id, String nome, String genero, String autor, String ano, boolean disponivel, int numeroPaginas,
            int downloads) {
        super(id, nome, genero, autor, ano, disponivel);
        this.numeroPaginas = numeroPaginas;
        this.downloads = downloads;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public int getDownloads() {
        return downloads;
    }
    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
}
