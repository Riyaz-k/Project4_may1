package org.sample;

//Abstract method call
public class GreenBank extends RBIBank {
	
	public void saving() {
		System.out.println("5%");
	}
	
	public void deposit() {
		System.out.println("3%");
	}
	
public static void main(String[] args) {
	RBIBank bank = new GreenBank();
	//GreenBank bank = new GreenBank(); also possible
	
	bank.saving();
	bank.deposit();
	bank.fixed();
	m1();
	}
}	

//interface call
//
//public class GreenBank implements RBIBank{
//
////@override
//public void saving() {
//	System.out.println("5%");
//}
//
//@Override
//public void saving1() {
//	System.out.println("saving");
//	
//}
//
//public void deposit() {
//	System.out.println("3%");
//}
//public void fixed() {
//	System.out.println("8%");
//}
//
//
//public static void main(String[] args) {
//	RBIBank bank = new GreenBank();
//	//GreenBank bank = new GreenBank(); also possible
//	
//	bank.saving();
//	bank.deposit();
//	bank.fixed();
//	bank.method1();
//	RBIBank.m1();
//	}
//}

