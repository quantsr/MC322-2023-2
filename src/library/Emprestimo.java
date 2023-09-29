package library;
import usuario.*;

import java.time.LocalDate;

public class Emprestimo {
    private ItemMultimidia item;
    private LocalDate dataEmprestimo; 
    private LocalDate dataDevolucao;  
    private Membro usuario; 

    public Emprestimo(ItemMultimidia item, LocalDate dataEmprestimo, LocalDate dataDevolucao, Membro usuario) {
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;

        
    }
    public ItemMultimidia getItem() {
        return item;
    }
    public void setItem(ItemMultimidia item) {
        this.item = item;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public Membro getUsuario() {
        return usuario;
    }
    public void setUsuario(Membro usuario) {
        this.usuario = usuario;
    }
}
