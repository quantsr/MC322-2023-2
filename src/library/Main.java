package library;
import java.util.ArrayList;
import java.util.HashMap;
import usuario.*;
import java.util.LinkedList;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		

		HashMap<Integer, ItemMultimidia> items = new HashMap<Integer, ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();

		

		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", items, membros);
		
		Graduacao user1 = new Graduacao("Max", 241957, "Campinas-SP", "m241957@dac.unicamp.br", LocalDate.now(), new ArrayList<Multa>(), new LinkedList<Emprestimo>());

		System.out.println(user1);
		
		LivroFisico livro1 = new LivroFisico(0, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);

		user1.makeEmprestimo(livro1, biblioteca);
		livro1.setCopias(livro1.getCopias()-1);
		System.out.println(user1);
	}

}
