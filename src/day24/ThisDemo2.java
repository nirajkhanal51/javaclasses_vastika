package day24;

// this is a keyword and is an implicit reference variable of current type 
//and current object and is available inside non-static method and constructor of a class

public class ThisDemo2 {

		private String name;
		private int age;
		
		//constructor
		public ThisDemo2(String name, int age) {
			this.name = name;
			this.age = age;
			
	}

		public void display() {
			
			System.out.println("name is: " +name);
			System.out.println("age is: " + age);
			
		}
		
	public static void main(String[] args) {
		
		ThisDemo2 obj1 = new ThisDemo2("Shyam", 33); 
		obj1.display();
	}
	
}