package day9;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
// conditional statements
//1. simple if or nested if
//2. if else
//3. nested if else
//4. else if
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number x: ");
		double x = input.nextDouble(); 
		System.out.println("Enter your second number y: ");
		double y = input.nextDouble(); 
		
		if (x < y) {
			System.out.println("The first number x is lesser than the second number y."); }
	/*  if (x > y) {
	 *      System.out.println("The first number x is greater than the second number y."); }*/

	}

}
