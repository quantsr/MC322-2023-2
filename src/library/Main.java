package library;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		

		HashMap<Integer, ItemMultimidia> items = new HashMap<Integer, ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();

		for(int i = 0; i<10; i++){
			membros.add(new Membro(i+100, null, null, null, null, null, null, null));
		}

		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", items, membros);
		
		//testando Membros collection

		biblioteca.addMembro(110);
		biblioteca.addMembro(111);
		biblioteca.addMembro(111);
		biblioteca.removeMembro(110);
		biblioteca.removeMembro(110);
		System.out.println(biblioteca.hasMembro(110));
		System.out.println(biblioteca.hasMembro(111));

		//testando acervo collection

		biblioteca.addItem(0);
		biblioteca.addItem(0);
		System.out.println(biblioteca.removeItem(0));
		System.out.println(biblioteca.removeItem(0));
		

		
	}

}
