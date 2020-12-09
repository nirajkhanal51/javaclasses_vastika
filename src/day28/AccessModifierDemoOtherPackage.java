package day28;

import day29.AccessModifierDemo;

public class AccessModifierDemoOtherPackage {
	
	 public static void main(String[] args) {
			AccessModifierDemo ob = new AccessModifierDemo(); 
	//		ob.privateMethod();
	//		ob.defaultMethod();
	//		ob.protectedMethod();
			ob.publicMethod();

}
}