package library;

import java.util.ArrayList;
import java.util.LinkedList;

public class Administrador extends Funcionario{

    public Administrador(int id, String nome, String cpf, String phone, String email, String endereço,
            ArrayList<Multa> multas, LinkedList<Emprestimo> emprestimos) {
                super(id, nome, cpf, phone, email, endereço, multas, emprestimos);
            }
    
}
