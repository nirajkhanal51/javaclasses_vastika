package day28;

public interface InterfaceDemo1 {

	// we cannot create constructor of interface
	void m1();
	public void m2(); 
	abstract void m3(); 
	public abstract void m4(); // by default
	
	int a = 5; // by default this variable in interface is constant; 
	
	int a1 = 5;
	public int a2 = 5; // rest is written by compiler because its final already
	static int a3 = 5;
	final int a4 = 5;
	public static int a5 = 5;
	static final int a6 = 5;
	public final int a7 = 5;
	public static final int a8 = 5; // by default an initialized variable is final and is given by compiler like this
}
