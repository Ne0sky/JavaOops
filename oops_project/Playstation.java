package oops_project;

public class Playstation extends Product {
	
	
    public Playstation(String name, int price, int rating) {
    	super(name, price, rating);
    }
    
    public void Order() {
		System.out.println("Your order for "+super.getName() +" has been placed");
	}
    
   
}
