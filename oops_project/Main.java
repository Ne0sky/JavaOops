package oops_project;

public class Main {

	public static void main(String[] args) {
		 try {
		        // Create an instance of the Account class
		        Account account = new Account("12345", "newpassword");

		        // Register a new account
		        account.Register();
		        account.Login("12345", "newpassword");
		        Playstation obj1 = new Playstation("Playstation", 590, 4);
			 	obj1.Order();
			 	
			 	 
			     	System.out.println("contact:"+account.contact);
			     	System.out.println("Product:"+obj1.getName());
			     	System.out.println("Price:"+obj1.getPrice());
			     
		        
		        
		    } catch (Exception e) {
		        // Handle exceptions here
		        System.err.println("An error occurred: " + e.getMessage());
		    }
		 
		 	
	}

}
