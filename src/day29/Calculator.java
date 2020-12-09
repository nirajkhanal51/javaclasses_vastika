package day29;
//this example is of compile time polymorphism, which is already decided to call by class object of Calculator and method sum
//called static binding polymorphism
//this type of polymorphis is obtained by method overloading
//passing appropriate value to match the data type in method parameters to execute exact method 
//where all the methods are created by same name but they are differentiated by data types, number of parameters, sequence of parameters

public class Calculator {

	
	public void sum() {
				
		int a = 5;
		int b = 6; 
		int add = a+b;
		System.out.println("sum is: " + add);
	}
	
	public void sum(int a, int b) {
		
		int add = a + b; 
		System.out.println("sum is: " + add);
	}
	
	
public void sum(double a, int b) {
		
		int add =(int)  a + b; 
		System.out.println("sum is: " + add);
	}

public void sum(int a, double b) {
	
	int add =  a + (int) b; 
	System.out.println("sum of a and b is: " + add);
}

	public void sum(double a, double b) {
		
		double add = a + b; 
		System.out.println("sum of a and b (duoble) is: " + add);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sum(4.5,5.6); //please give the value that matches with data type in above methods to execute exact method
	}
}
