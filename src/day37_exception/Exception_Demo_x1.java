package day37_exception;
import java.util.Scanner;


public class Exception_Demo_x1 {

	public static void main(String[] args) {
		
	
					    Exception_Demo_x1 obj = new Exception_Demo_x1();
						
								
						Scanner input = new Scanner(System.in);
						System.out.println("Enter a: ");
						int a = input.nextInt();
						
						System.out.println("Enter b: ");
						int b = input.nextInt();
						
						int div = obj.divide(a, b);
						System.out.println("division of a and b is: " + div);
						
						
						int [] arr = new int[2]; 
						
						for (int i = 0; i <= arr.length; i ++) { 
	// program codes above line seems fine but in runtime throws exception because being longer than array length, so "=" sign is
	// added by mistake
							System.out.println("Enter: ");
							
							arr[i] = input.nextInt(); 
						}
						
					System.out.println("=========================");
						for (int i = 0; i < arr.length; i ++) {
							
							System.out.println(arr[i]);
						} 
					}
					
					public int divide(int a, int b) {
						
						int div = a / b; 
						return div; 
					}


			}


