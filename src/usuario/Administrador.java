package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import library.Biblioteca;
import library.Emprestimo;
import library.ItemMultimidia;
import library.Multa;
import exceptions.*;

public class Administrador extends Funcionario{

    public Administrador(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
        
    }
    
    public void addItem(ItemMultimidia item, Biblioteca library){
        //checar se Biblioteca ja possui item com mesmo ID
        
        try {
            if(library.getAcervo().get(item.getId()) != null){
                throw new ExcecaoIdExistente("Item de id: "+ item.getId()+ ", ja se encontra cadastrado no acervo.");
            }else{
                library.addItem(item.getId());        
            }
        } catch (ExcecaoIdExistente e) {
            System.err.println("Erro ao cadastrar item: "+ e.getMessage());
        }
        
    }
    
    
}