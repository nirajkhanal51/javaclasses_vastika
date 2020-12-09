package day13;

public class Demo_1 {
	
	
	String nonStaticVar = "This is non static variable.";
	static String staticVar = "This is a static variable.";
	
	
	//non-static method
	public void sayHello() {
		System.out.println("Hello from Nepal."); }
	
    //static method
	public static void sayHI() {
		System.out.println("Hi from USA."); }

	public static void main(String[] args) {
		
		//non-static method can be called as below: you can give any object name: 
		Demo_1 tt = new Demo_1();
		tt.sayHello();
		
		//this is how you print variable unlikely than a method
		System.out.println(tt.nonStaticVar); 
		
		//static method can be called in two different ways:
		
		sayHI(); //This is not a recommended practice. However method from other non static class needs to make object. 
		
		Demo_1.sayHI(); //Calling static method in this way is regarded as the best practices, which indicates class name as well. 
		System.out.println(Demo_1.staticVar);//Always do this way, which clearly shows original method. 
	}
	
	}

