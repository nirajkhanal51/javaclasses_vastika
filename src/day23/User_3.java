package day23;

import java.util.Scanner;

public class User_3 {


			private  String username;
			private String password;
			
			
			public User_3(String u, String p) {
				
				username = u;
				password = p;
				System.out.println("arg contructor called");
				
			}
			
			public User_3() {
				
				System.out.println("default constructor called");
				
				//creating more than one constructor is called constructor overloading
			}
			
			public User_3(String username) {
				
				this.username = username;
				System.out.println("default constructor called");
			}
			
			public User_3(int u, String p) {
				
				System.out.println("trying constructor overloading");
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
				
				User_3 user1 = new User_3(username, password);
				user1.display();
				
				System.out.println("=============================");
				
				User_3 user2 = new User_3();
				
				
			}
			
			
			
}
