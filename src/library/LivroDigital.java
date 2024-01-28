package library;
import java.time.LocalDate;

public class LivroDigital extends ItemMultimidia{
    private String formato;
    private int qtdLicencas;
    private String url;
    private String requisito;
    private LocalDate disponibilidade;
    
    public LivroDigital(int id, String titulo, String autor, String editora, int ano, String genero, String sinopse,
            String capa, boolean disponivel, boolean conservado, String formato, int qtdLicencas, String url, String requisito,
            LocalDate disponibilidade) {
        super(id, titulo, autor, editora, ano, genero, sinopse, capa, disponivel, conservado);
        this.formato = formato;
        this.qtdLicencas = qtdLicencas;
        this.url = url;
        this.requisito = requisito;
        this.disponibilidade = disponibilidade;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getQtdLicencas() {
        return qtdLicencas;
    }

    public void setQtdLicencas(int qtdLicencas) {
        this.qtdLicencas = qtdLicencas;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public LocalDate getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(LocalDate disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
   


   
    
}
