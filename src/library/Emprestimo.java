package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Emprestimo {
    private ItemMultimidia item; //associação
    private LocalDate dataEmprestimo; //composição
    private LocalDate dataDevolucao;  //composição
    private Membro usuario; //associação

    public Emprestimo(ItemMultimidia item, LocalDate dataEmprestimo, LocalDate dataDevolucao, Membro usuario) {
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;

        public static void historicoEmprestimo (String[] args) {
            List<String> historicoEmprestimo = new LinkedList<>();

            // Adicionando historicoEmprestimo
            historicoEmprestimo.add("O Hobbit, João Pedro Melo, 20/09");
            historicoEmprestimo.add("Uma breve historia do tempo, Max Arruda, 21/09");
            historicoEmprestimo.add("Introdução a algoritmos, Miguel Vargas, 22/09");

            // Acessando o historico por posições
            String historicoEmprestimo = historicoEmprestimo.get(1); //"O Hobbit"
            String historicoEmprestimo = historicoEmprestimo.get(2); //"Uma breve historia do tempo"
            String historicoEmprestimo = historicoEmprestimo.get(3); //"Introduçao a algoritmos"

            //Iterando pela lista
            for (String historico : historicoEmprestimo) {
                System.out.println(historico);
            }
        }

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
