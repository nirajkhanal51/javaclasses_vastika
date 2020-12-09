package day26;

public class Sub extends Super {
	
	//the name below is a hiding variable 
	String name = "Child's name" ; 
	
	// the greet method below is called overriding method
	public void greet() {
			
		System.out.println("Hello, from Kathmandu......");
		}
	
	public int int_learning() {  // return type of method should be same for overriding such as void for void, int for int
		
			
			System.out.println("Learning int type is fun.");
			return 5;
		}
	}
	


