package library;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private String address;
    private boolean rent;
    private ArrayList<Book> books = new ArrayList<Book>();


    public User(String name, String email, int id, String phone, String cpf, String address, boolean rent) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phone = phone;
        this.cpf = cpf;
        this.address = address;
        this.rent = rent;
    }

    //getters
    public String getName () {
        return name;
    }
    public String getEmail () {
        return email;
    }
    public int getId () {
        return id;
    }
    public String getPhone () {
        return phone;
    }
    public String getCpf () {
        return cpf;
    }
    public String getAddress () {
        return address;
    }
    public boolean getRent () {
        return rent;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setRent(boolean rent) {
        this.rent = rent;
    }

	//add book to user books
	public void addBook(Book book){
		//search for id
		for(Book b : books){
			//check if book is already inside the list
			if(b.getId() == book.getId()){
				 System.out.println("O livro de ID " + b.getId() + " ja se encontra emprestado pelo usuário. Operação abortada.");
				 return;
			}
		}
		//add book to the list
		books.add(book);
	}
	
	public void removeBook(int id) {
		//check if list is empty
		if(books.isEmpty()) {
			System.out.println("A lista de livros se encontra vazia no momento.");
			return;
		}
		else {
			for(Book b : books) {
				//search book in list with id
				if(b.getId() == id) {
					books.remove(books.indexOf(b));
					return;
				}
			}
			System.out.println("Não foi possivel encontrar livro de id " + id + " emprestado pelo usuario. Operação Abortada");
			return;
		}
	}
}