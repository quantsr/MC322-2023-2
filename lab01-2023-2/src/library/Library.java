package library;
import java.util.ArrayList;

public class Library {
	private String name;
	private String phone;
	private String email;
	private String address;
	private String cnpj;
	
	private int max_capacity = 30;
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	
	//Construtor
	public Library(String name, String phone, String email, String address, String cnpj, int max_capacity) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.cnpj = cnpj;
		this.max_capacity = max_capacity;
	}
	public Library(int max_capacity) {
		this.name = "_";
		this.phone = "_";
		this.email = "_";
		this.address = "_";
		this.cnpj = "_";
		this.max_capacity = max_capacity;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getCNPJ() {
		return cnpj;
	}
	public int getMaxCapacity() {
		return max_capacity;
	}
	//public ArrayList<Book> getBooks()
	/*
	 * TO DO
	 */
	//public ArrayList<Employee> getEmployees()
	/*
	 * TO DO
	 */

	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setMaxCapacity(int max_capacity) {
		this.max_capacity = max_capacity;
	}
	
	//Add Book objects in library
	public void addBook(Book book) {
		//Check if list is empty
		if(books.size() >= max_capacity) {
			System.out.println("Biblioteca se encontra cheia no momento. Operação abortada.");
			return;
		}
		else {
			//search for id
			for(Book b : books){
				//check if book is already inside the list
				if(b.getId() == book.getId()){
					 System.out.println("O livro de ID " + b.getId() + " ja se encontra cadastrado no sistema. Operação abortada.");
					 return;
				}
			}
			//add book to the list
			books.add(book);
			
			System.out.println("Livro adicionado com sucesso. A biblioteca ainda tem espaço para mais " + (max_capacity - books.size()) + " livros.");
		}
	}
	
	//remove books by ID
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
			System.out.println("Não foi possivel encontrar livro de id " + id + " na biblioteca. operação Abortada");
			return;
		}
	}
	
	//list all books in library
	public void bookList() {
		System.out.println("Livros na biblioteca:");
		for(Book b : books) {
			if (b != null) {
				System.out.println(b.getName() + ", " + b.getAuthor() + ", " + b.getPublisher().getName() + ", " + b.getYear() + 
						", " + b.getSubject() + ", ID: "+ b.getId() + ". Disponibilidade: " + (b.isAvailable()?"Disponivel" : "Indisponível"));
			}			
		}
	}
	
	//add employee to library
	public void addEmployee(Employee employee){
		//search for id
		for(Employee e : employees){
			//check if employee is already inside the list
			if(e.getId() == employee.getId()){
				System.out.println("O servidor de ID " + e.getId() + " ja se encontra cadastrado no sistema. Operação abortada.");
				return;
			}
		}
		//add book to the list
		employees.add(employee);
	}

	//remove employee
	/*
	 * TO DO
	 */

	
}
