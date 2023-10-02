package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

import library.Emprestimo;
import library.Multa;

public class Atendente extends Funcionario{

    public Atendente(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
        
    }

    public void addItem(ItemMultimidia item, Biblioteca library){
    //checar se Biblioteca ja possui item com mesmo ID
    for(Map.Entry<Integer,ItemMultimidia> set : library.getAcervo().entrySet()){
        try {
            if(set.getValue().getId() == item.getId()){
                throw new ExcecaoIdExistente("Item de id: "+ item.getId()+ ", ja se encontra cadastrado no acervo.");
            }
        } catch (ExcecaoIdExistente e) {
                System.err.println("Erro ao cadastrar item: "+ e.getMessage());
        }
    }
        
}
    
}
