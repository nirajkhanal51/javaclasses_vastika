package day7;

public class TypeCastingDemo1 {

	public static void main(String[] args) {

		//the below code is for implicit(internally) type conversion of data done by java compiler	
		byte b1 = 127;
			int i1 = b1;
			System.out.println(i1);
			System.out.println(b1);
			
			// below lines of code are example of explicit data conversion conducted by java programmer
			int i2 = 127;
			byte b2  = (byte) i2;
			System.out.println(i2);
			System.out.println(b2);
			
			//lets see below example by forcefully converting data it loses value which may turn in lot of inaccuracies. 
			
			double d1 = 300.56;
			  int  i3 = (int) d1; 
			// when you run the codes above the result shows 0.56 is lost which may give heavy loss in transactions. 
			 
			  System.out.println(i3);
			  //there is not typecasting of boolean because of the nature of data(i.e. it is just 0 and 1)
			  //remove the forward slash to the below two lines of codes and see
			  //boolean bb = true;
			  //int i = (int) bb;
			  
			  //implicit
			  
			  byte b = 127;
			  short s = b;
			  int i = s;
			  long l = i;
			  float f = l;
			  double d = f;
			  System.out.println("Starts implicit example results below: =======================");
			  System.out.println(b);
			  System.out.println(s);
			  System.out.println(i);
			  System.out.println(l);
			  System.out.println(f);
			  System.out.println(d);
			
			  //explicit
			  double d2 =  99009.55;
			  float  f2=  (float) d2;
			  long   l3 = (long) f2;
			  int    i4 = (int)  l3;
			  short  s4 = (short) i4;
			  byte   b4 = (byte)  s4;
			  
			  System.out.println("Starts explicit example results below: =====================");
			  System.out.println(d2);
			  System.out.println(f2);
			  System.out.println(l3);
			  System.out.println(i4);
			  System.out.println(s4);
			  System.out.println(b4);
			  
			  
		 }

}
