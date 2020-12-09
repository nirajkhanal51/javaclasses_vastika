package day14;

import java.util.Scanner; 

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		boolean flag = true;
		
		while (flag) {
			
			System.out.println("Enter name: "); 
			String name = input.next(); 
			
			if (name.equals("Santosh")) 
			{ flag = false;   }
			
			System.out.println("Name is: " +name); 
			input.close(); 
		}
		System.out.println("End");
	}

}
