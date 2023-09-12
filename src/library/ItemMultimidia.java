package library;

public class ItemMultimidia {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private String genero;
    private String sinopse;
    private String capa;
    private boolean disponivel;

    
    public ItemMultimidia(int id, String titulo, String autor, String editora, int ano, String genero, String sinopse,
            String capa, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.genero = genero;
        this.sinopse = sinopse;
        this.capa = capa;
        this.disponivel = disponivel;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getEditora() {
        return editora;
    }


    public void setEditora(String editora) {
        this.editora = editora;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getSinopse() {
        return sinopse;
    }


    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


    public String getCapa() {
        return capa;
    }


    public void setCapa(String capa) {
        this.capa = capa;
    }


    public boolean isDisponivel() {
        return disponivel;
    }


    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
}
