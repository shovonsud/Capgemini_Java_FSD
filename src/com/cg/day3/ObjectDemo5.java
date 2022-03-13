package com.cg.day3;

class Static_A {
	Static_B obj;

	Static_A(Static_B obj) {
		this.obj = obj;
		obj.display();
	}
}

class Static_B {
	int x = 10;

	Static_B() {
		Static_A obj = new Static_A(this);
	}

	void display() {
		System.out.println("B::x = " + x);
	}
}

public class ObjectDemo5 {

	public static void main(String[] args) {
		Static_B obj = new Static_B();

	}

}
