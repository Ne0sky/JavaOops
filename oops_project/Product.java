package oops_project;

public class Product {
	
	private int price;
	private String name;
	private int rating;
	
	public Product(String name, int price, int rating) {
		this.price = price;
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void Order() {
		System.out.println("Your order for "+name+" has been placed");
	}
	
	

}
