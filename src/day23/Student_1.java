package day23;

public class Student_1 {
	
	String name;
	int roll;
	
	//Student_1 method is a constructor below:
	public Student_1(String n, int r) {
		
		name = n;
		roll = r;
		
	}

	public void displayInfo() {
		
		System.out.println("Name is: " +name);
		System.out.println("Roll is: " + roll);
		
	}
	
	public static void main(String [] args) {
		Student_1 obj1 = new Student_1("Ram", 32); 
		
		obj1.displayInfo();
		
		System.out.println("===========================");
		
		Student_1 obj2 = new Student_1("shyam", 33);
		obj1.displayInfo();
		
	}
	
}

//constructor: is a special method which has following properties: 
//1. it has name as class
//2. it has no return type
//3. we cannot use even use void keyword 
//4. it can have any access modifier
//5. it is mainly used to initialize member's data
//6. It runs only once for each object
