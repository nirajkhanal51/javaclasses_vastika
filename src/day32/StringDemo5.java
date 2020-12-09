package day32;

public class StringDemo5 {
	
	public static void main(String[] args) {
		//to change the value of String variable then use StringBuilder
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		
		
		sb.insert(0, "Hello, ");
		System.out.println(sb);
		
		sb.delete(4,7); 
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
