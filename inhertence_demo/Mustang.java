package inhertence_demo;

public class Mustang extends Car{
	
	String feature;
	
	public Mustang (String brand, int speed, String feature) {
		super(brand, speed);
		this.feature = feature;
	}
	
	protected void show_feature() {
		System.out.println("The cool feature of this car is "+feature);
	}
	
}
