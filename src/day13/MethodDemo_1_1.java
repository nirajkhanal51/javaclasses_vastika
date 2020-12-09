package day13;



//learning about how to create methods with syntaxes

public class MethodDemo_1_1 {
	
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
	  
	  
	  //added data are hard coded below, without taking input from data entry
     String n = "ram";  // this string variable can be given any name try and run such as n, name, r, t, etc.
        int a = 22;   // this int variable can be given any name as in above string variable
     String add = "Kathmandu"; // this string variable can take any name as above
     obj.printInfo(n, a, add); // the variable names passed inside bracket here should match with variable name given above 3 lines 
     obj.printInfo("shyam", 34, "pokhara");
     
  
     
 }
 }
 
