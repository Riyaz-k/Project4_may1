package org.sample;


public abstract class RBIBank {
	
	//abstract method
	public abstract void saving();
	
	
	public abstract void deposit();
	
	//non-abstract method
	public void fixed( ) {
		System.out.println("8%");
	}

	//default methods are allowed only in interfaces
	
	//Static method
	public static void m1() {
	System.out.println("Static method");
	}
	
}

// interface class example

//	public interface RBIBank {
//	
//	//abstract method
//	public abstract void saving();
//	
//	void saving1();
//	
//	public abstract void deposit();
//	
//	//abstract method
//	public abstract void fixed();
//	
//	//default method
//	default void method1() {
//	System.out.println("Default method");
//	}
//	
//	public static void m1() {
//	System.out.println("Static method");
//	}
//}		
