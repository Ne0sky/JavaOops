package oops_project;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 try {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Welcome to E-Kart");
			 System.out.println("Register :");
			 System.out.println("Enter you phone number :");
			 String contact = sc.next();
			 System.out.println("Enter the password :");
			 String pw = sc.next();
		       
		     Account account = new Account(contact, pw);
		  
		     account.Register();
		     
		     
		     
		     Playstation obj1 = null;
		     Skateboard obj2 = null;
		     
		     
		       
		        
		        
		        
		        if(account.reg) {
		        System.out.println("Login to continue");
		        
		        System.out.println("Enter you phone number :");
				 String login_contact = sc.next();
				 System.out.println("Enter the password :");
				 String login_pw = sc.next();
		        
				
				
				account.Login(login_contact, login_pw);
		        }
					
					
		        if(account.log) {
		        
		        System.out.println("WELCOME TO HOME PAGE\n------------------");
		        System.out.println("Press 1 for Playstation");
		        System.out.println("Press 2 for Skateboard");
		        
		        
		        int ch = sc.nextInt();
		        
		        switch(ch) {
		        case 1:
		        	obj1 = new Playstation("Playstation", 590, 4);
		        	System.out.println("Name:"+obj1.getName());
		        	System.out.println("Price:"+obj1.getPrice());
		        	System.out.println("Rating:"+obj1.getRating());
		        	 if(account.log) {
		 			 	obj1.Order();
		        	 	obj1.get_Receit();
		        	 }
		 		        else
		 		        System.out.println("You need to be logged in to order.");
		        	break;
		        case 2:
		        	obj2 = new Skateboard("Tony Hawk Edition", 800, 5);
		        	System.out.println("Name:"+obj2.getName());
		        	System.out.println("Price:"+obj2.getPrice());
		        	System.out.println("Rating:"+obj2.getRating());
		        	 if(account.log) {
		 			 	obj2.Order();
		        	 	obj2.get_Receit();
		        	 }
		 		        else
		 		        System.out.println("You need to be logged in to order.");
		        	break;
		        default:
		        	System.out.println("Invalid input");
		        }
		        }
		        
		        sc.close();
		        
		        
		    } catch (Exception e) {
		        // Handle exceptions here
		        System.err.println("An error occurred: " + e.getMessage());
		    }
		 
		 
		 	
	}
	

}
