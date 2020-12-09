package day23;

import java.util.Scanner;

public class User_1 {

	private  String username;
	private String password;
	
	
	public User_1(String u, String p) {
		
		username = u;
		password = p;
		
		
	}

	public void display() {
		
	System.out.println("Username is: " +username);
	System.out.println("Password is: " + password); 

   
	}
	
	public static void main(String [] args) {
		
				
		User user1 = new User("sunitatkhanal", "Tree@$35");
		user1.display();
		
		System.out.println("===============================");
		
		User user2 = new User("nirajkhanal", "Jango25");
		user2.display();
	}
	


//constructor: is a special method which has following properties: 
//1. It's name is same as class name
//2. It has no return type
//3. We cannot use even use void keyword 
//4. It can have any access modifier
//5. It is mainly used to initialize member's data
//6. It runs only once for each object

		
	
	}
	
	
