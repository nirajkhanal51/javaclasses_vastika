package day23;

public class Student_2 {

	private String name;
	private int roll;
	
	
	public void assignValue(String n, int r) {
		
		name = n;
		roll = r;
		
	}

	public void displayInfo() {
		
		System.out.println("Name is: " +name);
		System.out.println("Roll is: " + roll);
		
	}
	
	public static void main(String [] args) {
		Student_2 obj1 = new Student_2(); 
		
		obj1.assignValue("Ram", 23);
		obj1.displayInfo(); 
		
		System.out.println("===========================");
		
		Student_2 obj2 = new Student_2();
		obj2.assignValue("Shyam", 45);
		obj2.displayInfo();
		
	}
	
}

//constructor: is a special method which has following properties: 
//1. it has name as class
//2. it has no return type
//3. we cannot use even use void keyword 
//4. it can have any access modifier
//5. it is mainly used to initialize member's data
//6. It runs only once for each object
