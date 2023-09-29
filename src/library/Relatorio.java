package library;

import java.util.ArrayList;

public class Relatorio {
    private ArrayList<Emprestimo> emprestimos; 
    private ArrayList<ItemMultimidia> acervo; 
    private ArrayList<Multa> multas; 

    
    public Relatorio(ArrayList<Emprestimo> emprestimos, ArrayList<ItemMultimidia> acervo, ArrayList<Multa> multas) {
        this.emprestimos = emprestimos;
        this.acervo = acervo;
        this.multas = multas;
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    public ArrayList<ItemMultimidia> getAcervo() {
        return acervo;
    }
    public void setAcervo(ArrayList<ItemMultimidia> acervo) {
        this.acervo = acervo;
    }
    public ArrayList<Multa> getMultas() {
        return multas;
    }
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
}
