package library;

import java.util.ArrayList;

public class Atendente extends Funcionario{

    public Atendente(int id, String nome, String cpf, String phone, String email, String endereço,
            ArrayList<Multa> multas) {
        super(id, nome, cpf, phone, email, endereço, multas);
    }
    
}
