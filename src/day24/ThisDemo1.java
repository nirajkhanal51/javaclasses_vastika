package day24;

public class ThisDemo1 {

		private String name;
		private int age;
		
		public void assignValue(String n, int a) {
			name = n;
			age = a;
			
	}

		public void display() {
			
			System.out.println("name is: " +name);
			System.out.println("age is: " + age);
			
		}
		
	public static void main(String[] args) {
		
		ThisDemo1 obj1 = new ThisDemo1(); 
		obj1.assignValue("ram", 22);
		
		obj1.display();
	}
	
}
