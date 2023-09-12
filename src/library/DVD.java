package library;
import java.util.ArrayList;

public class DVD extends ItemMultimidia{
    private ArrayList<String> elenco;
    private int duracao;
    private int copias;
    private int copiasDisponiveis;
    private ArrayList<String> legendas_audios;
    private boolean conservado;
    
    public DVD(int id, String titulo, String autor, String editora, int ano, String genero, String sinopse, String capa,
            boolean disponivel, ArrayList<String> elenco, int duracao, int copias, int copiasDisponiveis,
            ArrayList<String> legendas_audios, boolean conservado) {
        super(id, titulo, autor, editora, ano, genero, sinopse, capa, disponivel);
        this.elenco = elenco;
        this.duracao = duracao;
        this.copias = copias;
        this.copiasDisponiveis = copiasDisponiveis;
        this.legendas_audios = legendas_audios;
        this.conservado = conservado;
    }

    public ArrayList<String> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
        this.elenco = elenco;
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

    public ArrayList<String> getLegendas_audios() {
        return legendas_audios;
    }

    public void setLegendas_audios(ArrayList<String> legendas_audios) {
        this.legendas_audios = legendas_audios;
    }

    public boolean isConservado() {
        return conservado;
    }

    public void setConservado(boolean conservado) {
        this.conservado = conservado;
    }
}
