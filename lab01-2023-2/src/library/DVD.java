package library;

public class DVD extends ItemMultimidia{
    private String estudio;
    private float tamanhoArquivo;
    

    
    public DVD(int id, String nome, String genero, String autor, String ano, boolean disponivel, String estudio,
            float tamanhoArquivo) {
        super(id, nome, genero, autor, ano, disponivel);
        this.estudio = estudio;
        this.tamanhoArquivo = tamanhoArquivo;
    }
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public float getTamanhoArquivo() {
        return tamanhoArquivo;
    }
    public void setTamanhoArquivo(float tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
