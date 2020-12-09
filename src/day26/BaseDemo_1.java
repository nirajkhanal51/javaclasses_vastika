package day26;

//working with constructor

public class BaseDemo_1 {
	
	//creating constructor below
	public BaseDemo_1() {
		
		System.out.println("parent's default constructor ...........");
	}
	// lets see with argumented constructor
	public BaseDemo_1(int a) {
		
		System.out.println("parent's arg constructor ...........");
	}
	
	
	String name = "parent's name"; 
	
	public void greet()  {
		
		System.out.println("Hello good morning....");
		
	}
	
	//to see the original object class used in the program lets see 
	
	public static void main(String[] args) {
		
		BaseDemo_1 obj = new BaseDemo_1(4); //calling argument constructor giving 4 as data type
		System.out.println(obj.getClass());
		
		BaseDemo_1 obj1 = new BaseDemo_1(); //calling constructor without argument giving no parameters
		System.out.println(obj1.getClass());
		
	}

}






