package day18;

 public class ArrayDemo_1 {

	public static void main(String[] args) {
		
	/*if we have to declare multiple variable it is inefficient to do in the way below:	
		int n1 = 4; 
		int n2 = 5;
		int n3 = 6; 
		int sum = n1 + n2 + n3; 
		
		So lets see below what can we do with array:
	*/
		
//the syntax is as as below: 

//   <data type> [] <array name> = new <data type> [size of an array];
//   int [] arr = new int[3]; 
		
		int [] arr = new int[3]; //array declaration and initialization
		System.out.println( arr); // gives object ID
		System.out.println( arr.length);//gives size of array
		
		//below gives default value if not assigned
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 44; 
		arr[1] = 45;
		arr[2] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		
	}

}

// array is a group of elements having same data type and arranged in a sequential manner
// array is a set of elements with same data type stored in a same variable instead of declaring them separately