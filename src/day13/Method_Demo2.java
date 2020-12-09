package day13;

public class Method_Demo2 {

	  /* lets learn return type method
	 the syntax is as below:
	 <access modifier> <return type> <method name> () 
	 lets build a program below on this syntax. */
		
		public static int findSum() {
			int a = 5;
			int b = 6;
			//int sum = a + b; 
			
			//values can be returned in different ways
			// such as 
			//return sum; 
			
			//or 
			return a + b;
			
			// or 
			//return 11;
			
			//should be returned only one value
			//you cannot write any code after return in a program
			
			}
		public static void main(String[] args) {
			
			int s = Method_Demo2.findSum();
			System.out.println("Sum is: " +s);
			
		}

	}


