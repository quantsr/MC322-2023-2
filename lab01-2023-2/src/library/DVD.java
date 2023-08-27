package library;

public class DVD extends ItemMultimidia{
    private String estudio;
    private Float tamanhoArquivo;
    private Boolean disponivel;

    
    public DVD(int id, String nome, String genero, String autor, String ano, Boolean status, String estudio,
            Float tamanhoArquivo, Boolean disponivel) {
        super(id, nome, genero, autor, ano, status);
        this.estudio = estudio;
        this.tamanhoArquivo = tamanhoArquivo;
        this.disponivel = disponivel;
    }
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public Float getTamanhoArquivo() {
        return tamanhoArquivo;
    }
    public void setTamanhoArquivo(Float tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    public Boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
