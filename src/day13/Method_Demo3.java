package day13;

public class Method_Demo3 {
			
	//this is another type of method building
	// <access modifier> <return type> <method name>(any number of args)
		
	public static int findMax(int a, int b) {  
		
		int max = 0 ;
		if (a > b)
		{  max = a;}
		else 
		{ max = b; }
		
		return max; 
	}
		
				
	public static void main(String[] args) {
		
		int s = Method_Demo2.findSum();
		System.out.println("Sum is: " +s);
		
		int a = 5; 
		int b = 6;
		
		int m = Method_Demo3.findMax(a, b);
		System.out.println("The maximum value is: " + m);
		
	}

}