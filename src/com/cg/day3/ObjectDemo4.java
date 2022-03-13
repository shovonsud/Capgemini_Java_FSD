package com.cg.day3;

class Test1 {
	int val_a;
	int val_b;

	// Default constructor
	Test1() {
		val_a = 10;
		val_b = 20;
	}

	Test1 get() {
		return this;
	}

	void display() {
		System.out.println("val_a = " + val_a + " val_b = " + val_b);
	}
}

public class ObjectDemo4 {

	public static void main(String[] args) {
		Test1 object = new Test1();
		object.get().display();

	}

}
