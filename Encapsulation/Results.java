package Encapsulation;

public class Results {

	public static void main(String[] args) {
		
		Student Akash = new Student("Akash", "A12");
		System.out.println("Grade of "+Akash.getName()+ " with ID "+Akash.getID() +" is A+");
		
		// this initialized ID is wrong
		Akash.setID("A123");;
		System.out.println("The new ID of Akash is "+Akash.getID());

	}

}
