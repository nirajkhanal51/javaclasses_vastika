package day23;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: "); 
		String username = input.next();
		System.out.println("Enter password: ");
		String password = input.next(); 
		
		User user1 = new User(username, password);
		user1.display();
		
		User user2 = new User(username, password);
		user2.display(); 
	}
	
}