package day27;

public class Triangle extends Shape{
	//we have to override method from abstract class for implementation
	public void draw() {
		
		System.out.println("Triangle is drawn.");
	}
	
	public Triangle() {
		
		System.out.println("triangle's constructor");
	}

}
