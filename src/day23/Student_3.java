package day23;

public class Student_3 {
	
	private String name;
    private int roll;


public Student_3(String n, int r) {
	
	name = n;
	roll = r;
	
	System.out.println("Constructor Called");
	
}

public void displayInfo() {
	
	System.out.println("Name is: " +name);
	System.out.println("Roll is: " + roll);
	
}

public static void main(String [] args) {
	Student_3 obj1 = new Student_3("Ram", 32); 
	
	obj1.displayInfo(); 
	
	System.out.println("===========================");
	
	Student_3 obj2 = new Student_3("Shyam", 45);
	
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



