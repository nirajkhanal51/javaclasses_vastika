package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo_8 {

		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
					
			// example of try and catch block for exception handling 
			try {
			
			System.out.println("Enter a: ");
			int a = input.nextInt();
				
			System.out.println("Enter b: ");
			int b = input.nextInt();
			System.out.println("try start");
			int result = divide(a,b); 
			System.out.println("division is: " + result);
					} 
			//from java 7, there is feature that we can keep multiple exceptions in catch
			//remember that Exception is class and that would work instead using other specific exception
			//that means should be child of runtime exception class
			catch(ArithmeticException | InputMismatchException ae) {
				
				System.out.println(ae);
				
					}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
			
			System.out.println("end of program");
			
		}

			public static int divide(int a, int b) {
				return a / b;
			
			
	}
	

	}


