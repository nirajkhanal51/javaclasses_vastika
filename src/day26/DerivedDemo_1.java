package day26;

public class DerivedDemo_1 extends BaseDemo_1{
	//the compiler gives the following constructor automatically
	
	public DerivedDemo_1() {
		
		super(); //this line in constructor is given by compiler and which displays first but is overriden if the line below is given
		//super(5); //to call constructor returning value int then give some int value inside perenthesis
		System.out.println("Child's default constructor");
	}
	
	public DerivedDemo_1(int a) {
		
		System.out.println("child's arg constructor");
		
	}
	
	
	String name = "Child's name"; 
	
	public void greet()  {
			
			
		System.out.println(name);
		System.out.println(super.name); //to call hidden or overridden values we use the keyword super
		System.out.println("Hi good morning....");
		super.greet(); 
			
	} 

	}