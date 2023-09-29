package library;

public class Renovacao {
    private Emprestimo emprestimo; 

    
    public Renovacao(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
