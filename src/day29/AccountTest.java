package day29;
//this is example of runtime polymorphism or dynamic binding polymorphism, decided by user input
//this is achieved by overriding of methods
import java.util.Scanner;

public class AccountTest {
	
	public static void open(Account account) {
		
		account.openAccount();
	}

	public static void main(String[] args) {
		Account account = null;
		
		
			
		Scanner input = new Scanner(System.in);
		System.out.println("Which account do you want to open?");
		
		String choice = input.next();
		
		switch (choice) {
		
		case "saving":
			account = new SavingAccount(); 
			break;
			
		case "current":
			account = new CurrentAccounts(); 
			break; 
			
			default:
				System.out.println("wrong choice");
				break;
		
		}
		
		if (account!=null) {
			AccountTest.open(account);
			
		}

	}

}
