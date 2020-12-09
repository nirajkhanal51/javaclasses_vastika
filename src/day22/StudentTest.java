package day22;

public class StudentTest {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setName("ram");// setting the value
		obj1.setRoll(20); // setting the value
		System.out.println(obj1.getName()); //getting the value
		System.out.println(obj1.getRoll()); //getting the value
		
		System.out.println("===============================");
		Student obj2 = new Student();
		obj2.setName("shyam");
		obj2.setRoll(30); 
		System.out.println(obj2.getName()); 
		System.out.println(obj2.getRoll());
	}

}
