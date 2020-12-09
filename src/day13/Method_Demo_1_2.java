package day13;

import java.util.Scanner;

//learning about how to create methods with syntaxes

public class Method_Demo_1_2 {
	
	//Type1: <access modifier> void <method name>() {
	
	
 public void sayHello() {
	 System.out.println("Say hello from Kathmandu.");}
 
   //Type2: <access modifier> void <method name>(any number of arguments) { 
 
 public void printInfo(String name, int age, String address) {
    
	
	System.out.println("Name is:" +name);
    System.out.println("Age is:" +age);
    System.out.println("Address is: " +address)  ;
 }
 public static void main(String [] args) {
     MethodDemo_1_1 obj = new MethodDemo_1_1(); 
	  obj.sayHello();   
	  
	  //lets try with scanner input from method_demo1
	  Scanner input = new Scanner(System.in); 
	     System.out.println("Enter name: ");
	     String n = input.next(); 
	     System.out.println("Enter age: ");
	     int a = input.nextInt(); 
	     System.out.println("Enter address: "); 
	     String add = input.next(); 
	     
	     input.close();
	     
	        
 }
 }
