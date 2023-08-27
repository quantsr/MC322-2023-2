package library;

public class Multa {
    private Membro usuario;  //composição
    private Emprestimo emprestimoRelacionado; //associação
    private boolean situaçãoMulta;
    private Float valor;

    
    public Multa(Membro usuario, Emprestimo emprestimoRelacionado, boolean situaçãoMulta, Float valor) {
        this.usuario = usuario;
        this.emprestimoRelacionado = emprestimoRelacionado;
        this.situaçãoMulta = situaçãoMulta;
        this.valor = valor;
    }
    public Membro getUsuario() {
        return usuario;
    }
    public void setUsuario(Membro usuario) {
        this.usuario = usuario;
    }
    public Emprestimo getEmprestimoRelacionado() {
        return emprestimoRelacionado;
    }
    public void setEmprestimoRelacionado(Emprestimo emprestimoRelacionado) {
        this.emprestimoRelacionado = emprestimoRelacionado;
    }
    public boolean isSituaçãoMulta() {
        return situaçãoMulta;
    }
    public void setSituaçãoMulta(boolean situaçãoMulta) {
        this.situaçãoMulta = situaçãoMulta;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
}
