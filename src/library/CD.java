package library;

public class CD extends ItemMultimidia{
    private int faixas;
    private int duracao; //segundos
    private int copias;
    private int copiasDisponiveis;
    private boolean conservado;
    
    public CD(int id, String titulo, String autor, String editora, int ano, String genero, String sinopse, String capa,
            boolean disponivel, boolean conservado, int faixas, int duracao, int copias, int copiasDisponiveis) {
        super(id, titulo, autor, editora, ano, genero, sinopse, capa, disponivel, conservado);
        this.faixas = faixas;
        this.duracao = duracao;
        this.copias = copias;
        this.copiasDisponiveis = copiasDisponiveis;
        this.conservado = conservado;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
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

    public boolean isConservado() {
        return conservado;
    }

    public void setConservado(boolean conservado) {
        this.conservado = conservado;
    }

    
    
}
