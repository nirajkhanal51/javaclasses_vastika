package day18;

import java.util.Scanner;

public class ArrayDemo_3 {

	public static void main(String[] args) {
		
			
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter size of an array: ");
			
			int size = input.nextInt(); 
			
			int [] arr = new int[size];
			
			 
			
			for (int i = 0; i < arr.length ; i ++) { 
				System.out.println("Enter element: ");
				arr[i] = input.nextInt(); 
				input.close();
				
			}
			int sum = 0; 
			
			for (int i = 0; i < arr.length ; i ++) { 
				 
				
				sum = sum + arr[i];}
			
				
				System.out.println("The sum of the array is: " +sum );
	}

}