package day32;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s1 = "Good Evening"; 
		
		System.out.println(s1);
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('d'));
		System.out.println(s1.charAt(6));
		
		
		char [] ch = s1.toCharArray();
		System.out.println(ch[5]);
		
		System.out.println(s1.contains("Good"));
		System.out.println(s1.contains("x"));
		System.out.println(s1.replace("Evening", "Morning"));
		System.out.println(s1.replace("o","a"));
		System.out.println(s1.replaceFirst("a","o"));
		System.out.println(s1.concat("Hello, ".concat(s1)));
		System.out.println(s1.concat("! How are you?"));

		String s2 = " Santosh Lal Karna ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		byte [] bb = s1.getBytes(); 
		System.out.println(bb.toString());
		
		
		System.out.println(s1.length());
		
		
		
		
		
		
		
		
		
		
		

	}

}
