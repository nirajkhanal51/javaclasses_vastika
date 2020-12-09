package day38_exception;

import java.util.Scanner;

public class ExceptionDemo_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		
		// example of try and catch block for exception handling 
		try {
		System.out.println("try start");
		int result = divide(a,b); 
		System.out.println("division is: " + result);
		System.out.println("try ends");
		} catch(ArithmeticException e) {
			
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("This is inside finally block.");
			input.close();
		}
		System.out.println("end of program");
	}

		public static int divide(int a, int b) {
			return a / b;
		
		
}
}