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
    
}
