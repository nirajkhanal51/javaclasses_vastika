package day24;

public class ThisDemo1A {

	//instance variable
	private String name;
	private int age;
	
	//changing n to name, and a to age from ThisDemo1
	//this keyword can be used only in non-static method
	public void assignValue(String name, int age) {  //variables inside parentheses is local variable
		this.name = name; //without using this before name in this line gives null value
		this.age = age;  // without using this before age in this line gives 0 value
		
		// this keyword before variable is used to if the local and instance variable name are same. The keyword this 
		//gives separates the local variable from instance variable. 
		
}

	public void display() {
		
		System.out.println("name is: " +name);
		System.out.println("age is: " + age);
		
	}
	
public static void main(String[] args) {
	
	ThisDemo1A obj1 = new ThisDemo1A(); 
	obj1.assignValue("ram", 22);
	
	obj1.display();
}

}
