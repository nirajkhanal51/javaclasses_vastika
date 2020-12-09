package day22;

public class UserTest {

	public static void main(String[] args) {


		User user1 = new User(); 
		user1.setUsername("user1"); 
		user1.setPassword("pass1");
		
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		
		System.out.println("=====================");
		
		User user2 = new User();
		user2.setUsername("user2");
		user2.setPassword("pass2");

		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
	}

}
