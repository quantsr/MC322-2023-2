package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import library.Emprestimo;
import library.Multa;

public class PosGraduacao extends Universidade{

    public PosGraduacao(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, List<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
    }
    
}
