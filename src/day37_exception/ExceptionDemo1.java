package day37_exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		int div = a/b;
		System.out.println("division of a and b is: " + div);
	
		// when user input data/ datatype is not in accordance with the programming code to be executed then it is called exception
		//for example if user enters 4 as a and 0 as b, then its exception error. 

	}
	
	public int divide(int a, int b) {
		
		int div = a / b; 
		return div; 
	}

}
