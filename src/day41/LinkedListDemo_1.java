package day41;

import java.util.ArrayList;
//Import the LinkedList class
import java.util.LinkedList;
import java.util.List;
		
public class LinkedListDemo_1 {

	public static void main(String[] args) {
		
int [] arr = new int[3];
		
		arr[0] = 40;
		arr[1] = 45;
		arr[2] = 565676; 
		 
		
		for (int i = 0; i < arr.length; i++) {
		  System.out.println(arr[i]);
		}
		
	/*	
	 	ArrayList al = new ArrayList(); 
		
		al.add(10);
		al.add("hello");
		al.add(3.5); 
		
		We are able to store and print different data types from arraylist. 
		System.out.println(al); */
		
		List <Integer> al = new LinkedList(); 
		
		al.add(10);
		al.add(20);
		al.add(30); 
		
		System.out.println(al); 
		
		al.add(40); 
		al.add(1,15);
		al.remove(2);
		System.out.println(al);
		
		al.set(3,25); 
		//notice arraylist length is now 4 and can be work on index 3
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.indexOf(15));
		System.out.println(al.contains(20));
		System.out.println(al.isEmpty());
		//al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		//System.out.println(al.get(3));
		
		System.out.println(al + "this is after isEmpty");
		
		List<Integer> al1 = new LinkedList<>(); 
		al1.add(42); 
		System.out.println(al1);
		al1.addAll(al); 
		System.out.println(al1);
		al1.addAll(0,al1);
		System.out.println(al1);
	//  al1.removeAl1(al);
		System.out.println("=======break_1===========");
		System.out.println(al1.containsAll(al));
		al1.retainAll(al); 
	
		System.out.println(al1);
		
		
		
		

		

	}

}


		
		    
	


