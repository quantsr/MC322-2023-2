package library;

public class LivroFisico extends ItemMultimidia {
    private String Isbn;
    private int edicao;
    private int copias;
    private String local;
    private boolean conservado;

    public LivroFisico(int id, String titulo, String autor, String editora, int ano, String genero, String sinopse,
            String capa, boolean disponivel, String isbn, int edicao, int copias, String local, boolean conservado) {
        super(id, titulo, autor, editora, ano, genero, sinopse, capa, disponivel);
        Isbn = isbn;
        this.edicao = edicao;
        this.copias = copias;
        this.local = local;
        this.conservado = conservado;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isConservado() {
        return conservado;
    }

    public void setConservado(boolean conservado) {
        this.conservado = conservado;
    }
   
}
