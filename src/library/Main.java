package library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import usuario.*;
import java.util.LinkedList;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		

		HashMap<Integer, ItemMultimidia> acervo = new HashMap<Integer, ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();
		HashSet<Emprestimo> emprestimos = new HashSet<Emprestimo>();
		LinkedList<Reserva> reservas = new LinkedList<Reserva>();
		HashSet<Categoria> categorias = new HashSet<Categoria>();
		
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", acervo, membros, emprestimos, reservas, categorias);
		LivroFisico livro1 = new LivroFisico(0, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro2 = new LivroFisico(1, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro3 = new LivroFisico(2, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro4 = new LivroFisico(3, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		Membro user1 = new Graduacao("Max", 241957, "Campinas-SP", "m241957@dac.unicamp.br", LocalDate.now(), new ArrayList<Multa>(), new LinkedList<Emprestimo>());
		Membro user2 = new Graduacao("Joao Pedro", 237668, "Campinas-SP", "j237668@dac.unicamp.br", LocalDate.now(), new ArrayList<Multa>(), new LinkedList<Emprestimo>());
		System.out.println("Situacao inicial:");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println();
		
		System.out.println("Testando excecao de limite de emprestimo.");
		System.out.println(user1);
		if(user1.makeEmprestimo(livro1, biblioteca)){
			livro1.setCopias(livro1.getCopias()-1);
		}
		System.out.println(user1);
		if(user1.makeEmprestimo(livro2, biblioteca)){
			livro1.setCopias(livro2.getCopias()-1);
		}
		System.out.println(user1);
		if(user1.makeEmprestimo(livro3, biblioteca)){
			livro1.setCopias(livro3.getCopias()-1);
		}
		System.out.println(user1);
		if(user1.makeEmprestimo(livro4, biblioteca)){
			livro1.setCopias(livro4.getCopias()-1);
		}
		System.out.println(user1);
		System.out.println();
		
		System.out.println("user2 faz emprestimo de livro1.");
		System.out.println(user2);
		if(user2.makeEmprestimo(livro1, biblioteca)){
			livro1.setCopias(livro1.getCopias()-1);
		}
		System.out.println(user2);
		System.out.println();

		
		Emprestimo emprestimo = user1.getEmprestimos().get(0);

		System.out.println("Adicionando multa para user2.");
		//criando lista de emprestimo com Emprestimo atrasado
		LocalDate dataAtrasada = LocalDate.now().minusDays(5);
		LinkedList<Emprestimo> emprestimoLista = new LinkedList<Emprestimo>();
		Emprestimo emprestimoAtrasado = new Emprestimo(livro4, dataAtrasada.minusDays(10), dataAtrasada, user1);
		emprestimoLista.add(emprestimoAtrasado);
		user2.setEmprestimos(emprestimoLista);
		biblioteca.addEmprestimo(emprestimoAtrasado);
		emprestimo = user2.getEmprestimos().get(0);
		user2.makeDevolucao(emprestimo, biblioteca);
		System.out.println(user2);
		System.out.println("user2 faz emprestimo de livro4.");
		if(user2.makeEmprestimo(livro4, biblioteca)){
			livro4.setCopias(livro4.getCopias()-1);
		}
		System.out.println(user2);
		System.out.println();

		System.out.println("Criando emprestimo inexistente");
		System.out.println(user1);
		user1.makeDevolucao(new Emprestimo(new LivroFisico(4, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true), dataAtrasada.minusDays(5), dataAtrasada, user1), biblioteca);
		System.out.println(user1);
		System.out.println();

		System.out.println("Devolucao de item danificado");
		System.out.println(user1);
		Emprestimo emprestimoDanificado = user1.getEmprestimos().getFirst();
		emprestimoDanificado.getItem().setConservado(false);
		user1.makeDevolucao(emprestimoDanificado, biblioteca);
		System.out.println(user1);
		System.out.println();
		
		
	
		}

}
