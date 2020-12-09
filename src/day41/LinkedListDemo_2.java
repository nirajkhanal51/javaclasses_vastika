package day41;

import java.util.Iterator;
//Import the LinkedList class
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedListDemo_2 {

	public static void main(String[] args) {
		
	
		System.out.println("Running loop to get elements from LinkedList");
		
		List<Integer> al = new LinkedList<Integer>(); 
		
		al.add(10);
		al.add(20);
		al.add(30); 
				
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i)+ " ");
		}
		
		// to distinguish the display below couple of lines of codes
		System.out.println("");
		System.out.println("============================");
		
		//to get individual element from LinkedList giving its corresponding index		
		System.out.print(al.get(0) + " ");
		System.out.print(al.get(1) + " ") ;
		System.out.println(al.get(2) + " ");
		
		System.out.println("==========================");
		
		for (int a: al ) {
			System.out.print(a + " ");
		}
		
		System.out.println("");
		System.out.println("============================");
		
		// using iterator to get display the data
		System.out.println("Using Iterator functionality: ");
		
		Iterator <Integer> it = al.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
			
		ListIterator<Integer> lit = al.listIterator(); 
		while(lit.hasNext()) {
			System.out.println(it.next() + " ");
			
		while(lit.hasPrevious()) {
			System.out.println(lit.previous() + " ");
		}
		
		}}}
		}
		
	
	