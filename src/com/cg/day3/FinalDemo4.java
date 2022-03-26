package com.cg.day3;

final class FinalClass {
	public void display() {
		System.out.println("This is a final method.");
	}
}

public class FinalDemo4 extends FinalClass {

	public void display() {
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		FinalDemo4 obj = new FinalDemo4();
		obj.display();

	}

}
