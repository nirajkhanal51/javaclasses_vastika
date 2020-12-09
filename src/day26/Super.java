package day26;

public class Super {
	
// if public changed to private in the following two lines it cannot be inherited from Sub class to InteritenceTest. Please try:
	//
	public String name = "parent's name" ; //this name variable is hidden by the name variable in Sub class
	
	//this greet method is overridden in child class
	public void greet() {
	
		System.out.println("Hello, good evening......");
	}
		
	public int int_learning() {
		
		System.out.println("Learning while puttting int as return method.");
		
		return 5; 
			
	}
		
			}
	

	

