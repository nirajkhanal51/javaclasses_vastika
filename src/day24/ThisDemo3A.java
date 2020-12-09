package day24;

public class ThisDemo3A {

	//instance variable	
	int a = 5;
       
		public void show() {
    	   
    	System.out.println(a);
    	   
       }
		
       public static void main(String[] args) {	
		
    	   ThisDemo3 ob1 = new ThisDemo3();
    	   System.out.println("ob1 is: " + ob1);
    	   ob1.show();
	}

}

