package library;

public class ItemMultimidia {
    private int id;
    private String nome;
    private String genero;
    private String autor;
    private String ano;
    private Boolean status;

    public ItemMultimidia(int id, String nome, String genero, String autor, String ano, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}