package library;

public class Publisher {
	private String name;
	private String address;
	
	//Construtor
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}

	//getters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
