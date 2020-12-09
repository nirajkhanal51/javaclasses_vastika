package day39_exception;

public class ExceptionDemo_12 {

	public static void main(String[] args) {
		
		vote(9);
		System.out.println("end");

	}

	public static void vote(int age) {
		
		if(age >= 18) {
			
			System.out.println("You can vote");
		}
		
		else {
			
			throw new InvalidExceptionDemo("you cannot vote");
		}
		
	}
}
