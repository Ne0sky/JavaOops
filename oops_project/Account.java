
package oops_project;
import java.util.HashMap;
import java.util.HashSet;
public class Account {
	
	 private HashMap<Integer, String> mp = new HashMap<>();
	
	protected String contact;
	protected String pw;
	public boolean log=false;
	public boolean reg = false;
	private char []ar= {'!','*','#'};
	 HashSet<Character> charSet = new HashSet<>();
	
	
	
	public Account(String contact, String pw) {
		this.contact = contact;
		this.pw =pw;
		 for (char c : ar) {
	           charSet.add(c);
	        }
	}
	
	private boolean is_strong(String pw) {
	    if (pw.length() < 6)
	        return false;
	    
	    boolean hasUpperCase = false;
	    boolean hasSpecialChar = false;

	    for (int i = 0; i < pw.length(); i++) {
	        char ch = pw.charAt(i);
	        if (Character.isUpperCase(ch)) {
	            hasUpperCase = true;
	        } else if (charSet.contains(ch)) {
	            hasSpecialChar = true;
	        }
	    }
	    

	    return hasUpperCase && hasSpecialChar;
	}
	
	
	
	protected void Register() {
		try {
		
		int contact_int = Integer.parseInt(contact);
		if(is_strong(pw)) {
		mp.put(contact_int,pw);
		System.out.println("Your account has been created");
		reg=!reg;
		}else System.out.println("Password is weak !");
		} catch(Exception e) {
			System.out.println("Contact info should only be numbers");
		}
	}
	
	protected void Login(String contact, String pw) {
		try {
		int contact_int = Integer.parseInt(contact);
		if(mp.containsKey(contact_int) && mp.get(contact_int).equals(pw)) {
		System.out.println("Logged in Successfully");
		log=!log;
		}
		else {
		System.out.println("Invalid credentials :/ Please try again");
		}} catch(Exception e) {
			System.out.println("Contact info should only be numbers");
		}
	}
	
	

}
