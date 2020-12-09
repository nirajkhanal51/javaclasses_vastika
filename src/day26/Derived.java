package day26;

public class Derived extends Base {
	
	String name = "Child's name"; 
	
public void greet()  {
		
		
	System.out.println(name);
	System.out.println(super.name); //to call hidden or overridden values we use the keyword super
	System.out.println("Hi good morning....");
	super.greet(); 
		
} 

}