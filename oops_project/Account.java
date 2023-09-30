
package oops_project;
import java.util.HashMap;

public class Account {
	
	 private HashMap<Integer, String> mp = new HashMap<>();
	
	protected String contact;
	protected String pw;
	
	public Account(String contact, String pw) {
		this.contact = contact;
		this.pw =pw;
	}
	
	protected void Register() {
		try {
		int contact_int = Integer.parseInt(contact);
		mp.put(contact_int,pw);
		System.out.println("Your account has been created");
		} catch(Exception e) {
			System.out.println("Contact info should only be numbers");
		}
	}
	
	protected void Login(String contact, String pw) {
		try {
		int contact_int = Integer.parseInt(contact);
		if(mp.containsKey(contact_int))
		System.out.println("Logged in Successfully");
		else
		System.out.println("Invalid credentials");
		} catch(Exception e) {
			System.out.println("Contact info should only be numbers");
		}
	}
	
	

}
