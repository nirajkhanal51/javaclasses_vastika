package day23;

import java.util.Scanner;

public class User {
	
	private  String username;
	private String password;
	
	
	public User(String u, String p) {
		
		username = u;
		password = p;
		
		
	}

	public void display() {
		
	System.out.println("Username is: " +username);
	System.out.println("Password is: " + password); 

   
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: "); 
		String username = input.next();
		System.out.println("Enter password: ");
		String password = input.next(); 
		
		User user1 = new User(username, password);
		user1.display();
	}
	


//constructor: is a special method which has following properties: 
//1. It's name is same as class name
//2. It has no return type
//3. We cannot use even use void keyword 
//4. It can have any access modifier
//5. It is mainly used to initialize member's data
//6. It runs only once for each object

		
	
	}
	
	

