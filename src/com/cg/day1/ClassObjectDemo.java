package com.cg.day1;

public class ClassObjectDemo {
	static int x = 1;
	private int y = 3;

	public void method(int x) {
		ClassObjectDemo t = new ClassObjectDemo();
		t.x = 3;
		y = 4;
		System.out.println("ObjectVariables.x: " + t.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String[] args) {
		ClassObjectDemo t = new ClassObjectDemo();
		t.method(5);
	}

}
