package day17;

public class ContinueDemo {

	public static void main(String[] args) {
		
for (int i = 1; i <= 5; i++) {
			
			if (i == 3) {
				
				continue;
				
				// or you can try
				// i =1; // this gives infinite loop printing 1 and 2
			}
			
			System.out.println(i);
			
			}
		System.out.println("end");
		
		}

	}
