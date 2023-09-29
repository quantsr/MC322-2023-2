package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import library.Emprestimo;
import library.ItemMultimidia;
import library.Multa;

public class Graduacao extends Universidade {

    public Graduacao(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, List<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
    }

    public void makeEmprestimo(ItemMultimidia item){
        if(item.isDisponivel()){
            LocalDate dataEmprestimo = LocalDate.now();
            LocalDate dataDevolucao = dataEmprestimo.plusDays(15);
            //criando objeto de Emprestimo
            Emprestimo emprestimo = new Emprestimo(item, dataEmprestimo, dataDevolucao, this);
            this.getEmprestimos().add(emprestimo);
        }
        else{
            //Throw exception in future
            System.out.println("Item de ID "+item.getId()+" nao se encontra disponivel.");
        }
    }
    
}
