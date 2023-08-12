package library;

public class Book {
	private final int id;
	private static int nextId = 0;

	private Publisher publisher;
	private String name;
	private String subject;
	private String author;
	private int year;
	private boolean isAvailable = true;

	
	//Constructor
	public Book(Publisher publisher, String name, String subject, String author, int year, boolean isAvailable) {
		id = nextId++;
		this.publisher = publisher;
		this.name = name;
		this.subject = subject;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
	} 
	//No parameters Constructor (Just in case. To be removed if unnecessary)
	public Book() {
		id = nextId++;
		this.publisher = new Publisher("_","_");
		this.name = "_";
		this.subject = "_";
		this.author = "_";
		this.year = 0;
		this.isAvailable = true;
	}

	//Getters
	public int getId() {
		return id;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public String getName() {
		return name;
	}	
	public String getSubject() {
		return subject;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public int getYear() {
		return year;
	}
	
	//Setters
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}