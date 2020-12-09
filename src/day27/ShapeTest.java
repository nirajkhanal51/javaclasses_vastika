package day27;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape = new Triangle(); // we can create  reference variable like this keeping child's object, called implicit object casting
		shape.draw();
		
		shape = new Circle();
		shape.draw(); 
	}

}
