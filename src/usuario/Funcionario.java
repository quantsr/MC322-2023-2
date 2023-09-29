package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import library.Emprestimo;
import library.ItemMultimidia;
import library.Multa;

public class Funcionario extends Membro{

    public Funcionario(String nome, int id, String endereco, String contato, LocalDate dataRegistro,
            ArrayList<Multa> multas, List<Emprestimo> emprestimos) {
        super(nome, id, endereco, contato, dataRegistro, multas, emprestimos);
        
    }

    public boolean makeEmprestimo(ItemMultimidia item){
        //checar se limite de emprestimo foi atingido
        if(this.getEmprestimos().size() == 4){
            //throw exception
            System.out.println("Limite de emprestimo excedido.");
            return false;
        }
        //checar se item esta disponivel para emprestimo
        if(!item.isDisponivel()){
            //Throw exception in future
            System.out.println("Item de ID "+item.getId()+" nao se encontra disponivel.");
            return false;
        }
        //checar se tem multas pendentes
        for(Multa m : this.getMultas()){
            if(!m.isPago()){
                //throw exception
                System.out.println("O usuario possui uma ou mais multas pendentes.");
                return false;
            }
        }
        //realizar emprestimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(20);
        
        Emprestimo emprestimo = new Emprestimo(item, dataEmprestimo, dataDevolucao, this);
        this.getEmprestimos().add(emprestimo);
        return true;
        
    }
    
}
