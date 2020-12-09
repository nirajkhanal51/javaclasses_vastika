package day27;


// we cannot inherit final class 
public /*final*/ class FinalClassDemo { // if we give final keyword as in this line then it cannot be inherited 

	 
	//if we use final on variable, it becomse constant, we cannot override it 
	/*final*/ int a = 5; 
	// we cannot override final method
	
	public /*final*/ void greet() {
		
		System.out.println("Hello, good morning......");
	}
	
	// we cannot use final keyword on constructor
	public FinalClassDemo() { 
		System.out.println("dd");
	}
	}
	
	

