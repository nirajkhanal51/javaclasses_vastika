package day26;

//example of composition
public class Engine {

	public void move() {
		System.out.println("engine moves");
	}
	
		
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}
}
