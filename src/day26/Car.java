package day26;

// example of composition  demonstrating has a relationship
//

public class Car {
	
	Engine engine; 
	
	public Car() {
		
		engine = new Engine(); 
	}
	
	
	public void drive() { 
				
	    engine.move(); 
		System.out.println("car started");
	}

}
