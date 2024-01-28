package library;

public class RecursoMultimidia extends ItemMultimidia {
    private String tipoRecurso;
    private String formato;
    private int copias;
    private int copiasDisponiveis;
    private String local;
    private boolean conservado;
    
    public RecursoMultimidia(int id, String titulo, String autor, String editora, int ano, String genero,
            String sinopse, String capa, boolean disponivel, String tipoRecurso, String formato, int copias,
            int copiasDisponiveis, String local, boolean conservado) {
        super(id, titulo, autor, editora, ano, genero, sinopse, capa, disponivel, conservado);
        this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        this.copias = copias;
        this.copiasDisponiveis = copiasDisponiveis;
        this.local = local;
        this.conservado = conservado;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
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
