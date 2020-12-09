package day31;

//string class is final class and so cannot be extended
//object is immutable


public class StringDemo1 {

	public static void main(String[] args) {
		
		
		//implicit object creation
		String s1 = "Nepal";
		System.out.println(s1);
		
		////explicit object creation
		String s2 = new String();
		System.out.println(s2);
		
		String s3 = new String("Nepal");
		System.out.println(s3);
		
		char [] ch = {'N','e', 'p', 'a', 'l' } ;
		String s4 = new String(ch); 		
		System.out.println(s4);
		
		byte []  bb = {78, 101, 112, 97, 108}; 
		String s5 = new String (bb); 
		System.out.println(s5);

	}

}
