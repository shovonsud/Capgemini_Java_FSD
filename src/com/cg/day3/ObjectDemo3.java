package com.cg.day3;

class Test_this {
	void print() {
		// calling function show()
		this.show();
		System.out.println("Test_this:: print");
	}

	void show() {
		System.out.println("Test_this::show");
	}
}

public class ObjectDemo3 {

	public static void main(String[] args) {
		Test_this obj = new Test_this();
		obj.print();

	}

}
