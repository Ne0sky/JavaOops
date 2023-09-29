package Encapsulation;

public class Student {
	
	// The properties of the class student are protected within the class, and cannot be accessed outside the class -> encapsulation
	// We need to provide getters and setters to access and modify the properties
	
	private String name;
	private String ID;
	
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
}
