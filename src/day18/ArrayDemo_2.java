package day18;

import java.util.Scanner;

public class ArrayDemo_2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter size of an array: ");
		
		int size = input.nextInt(); 
		
		int [] arr = new int[size];
		 
		
		for (int i = 0; i < arr.length ; i ++) { 
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();}
		
		input.close(); 
	
	for (int i = 0; i < arr.length ; i ++) { 
		System.out.println("The number " +(i+1)  +  " element of the array is: " +arr[i]  );
		
	}
		
	}

	}
