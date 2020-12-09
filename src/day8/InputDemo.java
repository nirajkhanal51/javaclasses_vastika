package day8;

import java.util.Scanner; 

public class InputDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter your number a: " );
		float a = input.nextFloat();
		
		System.out.println("Enter your character c: " );
		char c = input.next().charAt(0);
		
		System.out.println("Enter your byte b: " );
		byte b = input.nextByte();
		
		System.out.println("Enter your short number: ");
		short s = input.nextShort();
		
		System.out.println("Enter your long number: ");
		long l = input.nextLong(); 
		
		System.out.println("Enter your boolean value: ");
		boolean bb = input.nextBoolean();
		
		input.close();
		
		System.out.println("Your float number is;  " + a );
		System.out.println("Your character is;  " + c );
		System.out.println("Your byte number is;  " + b);
		System.out.println("Your short number is;  " + s );
		System.out.println("Your long number is;  " + l );
		System.out.println("Your boolean value is;  " + bb );

	}

}
