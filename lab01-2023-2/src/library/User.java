package library;

public class User {
	private int id;     
	private String name;   
	private String email;  
	private String phone;
	private String cpf;
	private String address;
	
	
	public User(String name, String email, int id, String phone, String cpf, String address) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.phone = phone;
		this.cpf = cpf;
		this.address = address;
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
}