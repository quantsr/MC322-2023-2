package library;

public class LivroFisico extends ItemMultimidia {
    private int numeroPaginas;
    private Boolean disponivel;

    public LivroFisico(int id, String nome, String genero, String autor, String ano, Boolean status, int numeroPaginas,
            Boolean disponivel) {
        super(id, nome, genero, autor, ano, status);
        this.numeroPaginas = numeroPaginas;
        this.disponivel = disponivel;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public Boolean getDisponivel() {
        return disponivel;
    }


    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }


   
   
    
    
}
