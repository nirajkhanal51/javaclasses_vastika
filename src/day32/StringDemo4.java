package day32;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "Good";
		System.out.println(s1);
		//s1 = s1.concat(" Morning!");  if you remove // it will make new object with Morning 
		//System.out.println(s1);  will printout new object with concat function and Morning
		
		
		String s2 = s1.concat(" Morning"); //another way to concat, more clear to understand new object created with Morning
		System.out.println(s2);

		

	}

}
