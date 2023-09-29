package library;
import usuario.Membro;


public class Multa {
    private Membro usuario;  
    private Emprestimo emprestimoRelacionado; 
    private boolean pago;
    private float valor;

    
    public Multa(Membro usuario, Emprestimo emprestimoRelacionado, boolean pago, float valor) {
        this.usuario = usuario;
        this.emprestimoRelacionado = emprestimoRelacionado;
        this.pago = pago;
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
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
