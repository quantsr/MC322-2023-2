package library;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		

		ArrayList<ItemMultimidia> items = new ArrayList<ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();

		for(int i = 0; i<10; i++){
			//variedade de items
			int choice = new Random().nextInt(4);
			//0:LivroFisico, 1:LivroDigital, 2:CD, 3:DVD
			switch(choice){
				case 0:
					items.add(new LivroFisico(i, null, null, null, null, true, i+500));
					break;
				case 1:
					items.add(new LivroDigital(i, null, null, null, null, true, i+500, 1000+i));
					break;
				case 2:
					items.add(new CD(i, null, null, null, null, true, null, (float)(2.5) ));
					break;
				case 3:
					items.add(new DVD(i, null, null, null, null, true, null, (float)4.5));
					break;
			}

			membros.add(new Membro(i+100, null, null, null, null, null, null));
		}

		//relação de agregação com Biblioteca e a coleção de ItemMultimidia.
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", items);
		
		//Relação de composição com a Emprestimo e LocalDate. 
		//LocalDate não faz sentido existir sem um objeto Emprestimo associado a ele.
		Emprestimo emprestimo1 = new Emprestimo(items.get(0), LocalDate.now(), LocalDate.now().plusDays(5), membros.get(0));

		//A mesma classe Emprestimo se utiliza de relação de associação
		// ao associar um objeto ItemMultimidia como um de seus atributos
		Emprestimo emprestimo2 = new Emprestimo(items.get(1), LocalDate.now(), LocalDate.now().plusDays(5), membros.get(1));

	}

}
