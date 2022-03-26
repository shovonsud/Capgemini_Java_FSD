package com.cg.day3;

class FinalDemo {
	// create a final method
	public final void display() {
		System.out.println("This is a final method.");
	}
}

public class FinalDemo3 extends FinalDemo {

	// try to override final method
	public final void display() {
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		FinalDemo3 objDemo3 = new FinalDemo3();
		objDemo3.display();

	}

}
