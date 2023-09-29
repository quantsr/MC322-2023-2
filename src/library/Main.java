package library;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		

		HashMap<Integer, ItemMultimidia> items = new HashMap<Integer, ItemMultimidia>();
		ArrayList<Membro> membros = new ArrayList<Membro>();

		for(int i = 0; i<10; i++){
			membros.add(new Membro(i+100));
		}

		Biblioteca biblioteca = new Biblioteca("Biblioteca Central Zila Mamede", "(84) 3342-2260", "secretaria@bczm.ufrn.br", "CEP 59078-900, Natal RN", "63.942.522/0001-22", items, membros);
		
		CD item0 = new CD(0, null, null, null, 0, null, null, null, false, 0, 0, 0, 0, false);
		CD item1 = new CD(1, null, null, null, 0, null, null, null, false, 0, 0, 0, 0, false);
		ItemBiblioteca<CD> i = new ItemBiblioteca<CD>();

		i.emprestarItem(item0);
		//testing duplicate exception
		i.emprestarItem(item0);
		i.emprestarItem(item1);
		i.reservarItem(item0);
		//testing duplicate exception
		i.reservarItem(item0);
		for(CD item : i.getItensEmprestados()){
			System.out.println("Lista antes de devolverItem => id:" + item.getId());
		}
		i.devolverItem(item0);
		for(CD item : i.getItensEmprestados()){
			System.out.println("Lista depois de devolverItem => id:" + item.getId());
		}
		i.devolverItem(item0);
		
	}

}
