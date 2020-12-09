package day37_exception;

import java.util.Scanner;

public class ExceptionDemo_x {

	public static void main(String[] args) {
		
								
				ExceptionDemo_x obj = null;
				
						
				Scanner input = new Scanner(System.in);
				System.out.println("Enter a: ");
				int a = input.nextInt();
				
				System.out.println("Enter b: ");
				int b = input.nextInt();
				
				int div = obj.divide(a, b);
				System.out.println("division of a and b is: " + div);
			
				
			}
			
			public int divide(int a, int b) {
				
				int div = a / b; 
				return div; 
			}


	}


