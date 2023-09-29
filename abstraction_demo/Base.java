package abstraction_demo;

public abstract class Base {
	String name;
	
	public Base(String name) {
		this.name = name;
	}
	abstract void show_name(); //virtual function
	
}
