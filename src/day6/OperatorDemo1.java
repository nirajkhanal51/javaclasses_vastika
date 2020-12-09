package day6;

//Learning Operators
public class OperatorDemo1 {

	public static void main(String[] args) {
		
		//1. Arithmetic Operators + - / * %
		//% is called modulus in programming which gives remainder after division
		// for division / is used, let's see below what happens
		
	     System.out.println( (double) 7 / 2);
	     System.out.println(7 % 2);
	     
	     //for the multiple operators used in an expression, compilers computes according to precedence(priority) which is as below:
	     //+ - has low priority and / * % has high priority
	     //associativity (or it computes operators) starting from left to right according to priority set in programming language
	     int a = 4 + 5 - 4 / 2 - 7 % 2 + 3 * 2;
	     
	     System.out.println(a);
	     
	     //2. Assignment(also called shorthand operators) operators  =    
	     //   Compound or shorthand assignment operators +=   -=  /=  *=  %=
	     // Associativity: Right to left
	     
	     int x = 5;
	     System.out.println(x);
	     
	     x += 2; // this expression gives same value as x = x + 2 
	     
	     System.out.println(x);
	     
		     }

}
