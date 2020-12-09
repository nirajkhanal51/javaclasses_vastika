package day24;

public class ThisDemo3 {
	
	int a = 5;  // this is instance variable
	
	//shadowing is the concept of hiding instance variable by local variable of 
	//non-static method or constructor of a class
	
	public void show() {
		
		System.out.println("This is: " + this);
		System.out.println(this.a);
		
		//the variable a = 6 below is called local variable
		
		int a = 6;
		System.out.println(a);
		System.out.println(this.a);
		int sum = a + this.a;
		
		System.out.println("sum is: " +sum);
		
			
	}

	public static void main(String[] args) {
		
		ThisDemo3 obj1 = new ThisDemo3(); 
		System.out.println("ob1 is: " +obj1);
		obj1.show();
		
		ThisDemo3 obj2 = new ThisDemo3(); 
		System.out.println("ob2 is: " +obj2);
		obj2.show();

	}

}
