package day17;

public class Demo1 {
	
	public String sayHello() { 
	
		return "Hello, "; 
		
	}
	
	public void greet() {
		
		String m = this.sayHello(); //or just write sayHello(). The compiler writes as this.sayHello()
		System.out.println(m + " Good Morning");
		
	}
	
	public static void display() {
		
	    Demo1 obj = new Demo1(); 
	    obj.greet(); }
	
	public static void main(String[] args) {
		
		display(); //not recommended way to call function
		Demo1.display(); //best way to call function
		
	}
		
	}
	
	
	


