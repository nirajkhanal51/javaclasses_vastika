package day29;

public class AccessModifierDemo {
	
	String defaultVar = "this is default variable";
	public String publicVar = "this is public variable"; 
	private String privateVar= "this is private variable"; 
	
	protected String protectedVar = "This is protected variable"; 
	
	void defaultMethod() {
		
		System.out.println("This is default method....");
			}
	
	public void publicMethod() {
		System.out.println("this is public method............");
	}

	private void privateMethod() {
		System.out.println("this is private method.....");
	}
	
	protected void protectedMethod() {
		
		System.out.println("Tbis is protected  Method");
		
	}
	
	public AccessModifierDemo() {
		
		System.out.println("This is public level access constructor");
	}
	
      AccessModifierDemo(int a) {
		
		System.out.println("This is default level access constructor");
	}
      
     protected AccessModifierDemo(String s) {
  		
  		System.out.println("This is protected level access constructor");
  	}
     
     private AccessModifierDemo(double a) {
 		
 		System.out.println("This is private level access constructor");
 	}
     
}












