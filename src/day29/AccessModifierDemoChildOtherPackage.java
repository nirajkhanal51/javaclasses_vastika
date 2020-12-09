package day29;

public class AccessModifierDemoChildOtherPackage extends AccessModifierDemoChild {
	
	public static void main(String[] args) {
		AccessModifierDemo ob = new AccessModifierDemo(5); 
//		ob.privateMethod();
//		ob.defaultMethod();
//		ob.protectedMethod();
		ob.publicMethod();
		AccessModifierDemoChildOtherPackage obj = new AccessModifierDemoChildOtherPackage(); 
		obj.protectedMethod(); 

}
	
	

}