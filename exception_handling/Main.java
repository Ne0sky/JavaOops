package exception_handling;

public class Main  {

	public static void main(String[] args) {
		
		Base obj = new Base();
		
		try {
			obj.getInt();
		}catch(Exception e){
			System.out.println("The word does not have numbers");
		}finally {
			System.out.println("Finally block");
		}
	}

	}


