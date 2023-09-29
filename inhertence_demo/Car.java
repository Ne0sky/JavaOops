package inhertence_demo;

public class Car {

	protected String brand;  // protected -> can be used by subclasses
	protected int speed;
	
	// constructor
	
	public Car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void start_car() {
		System.out.println("The "+brand+" has started");
	}
	
	public void run() {
		System.out.println("The "+brand+" is running at speed "+speed+" km/hr");
	}
	
	public void stop_car() {
		for(double i=speed; i>0;i-=20) {
			
			
			System.out.println("The speed of the "+brand+" car is "+i+" km/hr at the moment");
		}
		
		System.out.println("The "+brand+" car has now stopped");
	}

}
