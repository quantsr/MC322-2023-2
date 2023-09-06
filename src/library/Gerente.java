package library;

import java.util.ArrayList;

public class Gerente extends Funcionario{

    public Gerente(int id, String nome, String cpf, String phone, String email, String endereço,
            ArrayList<Multa> multas) {
        super(id, nome, cpf, phone, email, endereço, multas);
    }
    
}
