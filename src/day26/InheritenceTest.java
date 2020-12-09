package day26;

public class InheritenceTest {

	public static void main(String[] args) {
		
		
		Sub ob = new Sub();
		System.out.println(ob.name);
		ob.greet(); 
		ob.int_learning();
		
	}

}

//three methods cannot be overriden
// private
//static
//final

//There are three things that cannot be inherited
//private members (or data)
//hidden variables
//overriden methods