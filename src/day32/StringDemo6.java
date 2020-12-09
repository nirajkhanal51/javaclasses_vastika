package day32;

public class StringDemo6 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("Good");
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
