package day32;

public class StringDemo7 {

	public static void main(String[] args) {


		String lines = "Hello, I am Santosh Lal Karna, I am Java Developer, I am working at dryice, Nepal, I also teach java parttime, I am parttime teacher of Vastika inc., USA"; 
			
		
		String [] words1 = lines.split(" "); 
		for(String w: words1) {
			System.out.println(w);
		}
		
		System.out.println("===============================");
		
		String [] words = lines.split(","); 
		for(String w: words) {
			System.out.println(w);
	}

	}
}