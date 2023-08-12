package library;

public class Main {

	public static void main(String[] args) {
		
		//instanciando Editora
		Publisher editora = new Publisher("Editora Unicamp", "Rua blablabla");
		
		//instanciando Biblioteca
		Library library = new Library(10);
		
		//instanciando Livros
		Book livro1 = new Book(editora, "Tom Sawyer", "Infantil", "Mark Twain", 1973, true);
		Book livro2 = new Book(editora, "Tom Sawyer II: A ameaça Fantasma", "Infantil", "Mark Twain", 2023, true);
		Book livro3 = new Book();
	
		//adicionando livros na biblioteca
		library.addBook(livro1);
		library.addBook(livro2);
		library.addBook(livro3);
		
		//adicionando livro ja existente
		System.out.println("\nAdicionando livro ja existente na bilioteca:");
		library.addBook(livro1);		
		
		//listando livros
		System.out.println("\nListando livros presentes na biblioteca:");
		library.bookList();
		
		//removendo livro existente
		System.out.println("\nRemovendo livro de id " + livro1.getId() + ":");
		library.removeBook(livro1.getId());
		library.bookList();
		
		//removendo livro inexistente
		System.out.println("\nRemovendo livro de id 9001:");
		library.removeBook(9001);

	}

}
