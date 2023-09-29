package abstraction_demo;

public class Name extends Base {
	int age;
	public Name(String name, int age) {
		super(name);
		this.age = age;
	}
	void show_name() {
		System.out.println("The name is "+name);
	}
	
	void show_age() {
		System.out.println("The age is "+age);
	}
}
