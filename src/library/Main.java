package library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.reflect.*;
import usuario.*;
import java.util.LinkedList;


import exceptions.ExcecaoItemDanificado;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Main {

	public static void main(String[] args) {
		HashMap<Integer, ItemMultimidia> acervo = new HashMap<Integer, ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();
		HashSet<Emprestimo> emprestimos = new HashSet<Emprestimo>();
		LinkedList<Reserva> reservas = new LinkedList<Reserva>();
		HashSet<Categoria> categorias = new HashSet<Categoria>();
		ArrayList<Sala> salas = new ArrayList<Sala>();
		ArrayList<ReservaSala> reservasSala = new ArrayList<ReservaSala>();
		
		LivroFisico livro1 = new LivroFisico(0, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro2 = new LivroFisico(1, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro3 = new LivroFisico(2, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		LivroFisico livro4 = new LivroFisico(3, "Java for Dummies", "Oracle", "Oracle", 1993, "Fantasia", null, null, true, "978-85-333-0227-3", 1, 10, "A5", true);
		Membro user1 = new Graduacao("Max", 241957, "Campinas-SP", "m241957@dac.unicamp.br", LocalDate.now(), new ArrayList<Multa>(), new LinkedList<Emprestimo>());
		Membro user2 = new Membro("Joao Pedro", 237668, "Campinas-SP", "j237668@dac.unicamp.br", LocalDate.now(), new ArrayList<Multa>(), new LinkedList<Emprestimo>());
		membros.add(user1);
		membros.add(user2);
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", acervo, membros, emprestimos, reservas, categorias,salas, reservasSala);
		
		
		System.out.println("Listando metodos de ItemMultimidia: \n");
		CReflection.listaMetodosClasse(livro1);
		System.out.println("\nListando metodos de Membro: \n");
		CReflection.listaMetodosClasse(user1);
		System.out.println("\nListando Atributos de ItemMultimidia: \n");
		CReflection.listaAttClasse(livro4);
		System.out.println("\nListando informacoes de uma lista ItemMultimidia: \n");
		ArrayList<ItemMultimidia> itens = new ArrayList<ItemMultimidia>();
		itens.add(livro1);
		itens.add(livro2);
		itens.add(livro3);
		itens.add(livro4);
		CReflection.listaInfo_new(itens);
		System.out.println("\nListando informacoes de uma lista membro: \n");
		CReflection.listaInfo_new(membros);
		}

}
