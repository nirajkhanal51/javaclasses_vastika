package day27;

public abstract class Shape {

	abstract void draw(); 
	
	//abstract class can have a body like below but cannot be override, only abstract class can be override
	public void paint() {
		
		System.out.println("shape is painted");
	}
	
	public Shape() {
		
		System.out.println("shape's constructor");
	}
}
