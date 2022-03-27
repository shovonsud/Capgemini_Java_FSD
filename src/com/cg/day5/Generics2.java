package com.cg.day5;

class DemoClass {

	// create a generic method
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data Passed: " + data);
	}
}

public class Generics2 {

	public static void main(String[] args) {
		// initialize the class with Integer data
		DemoClass demo = new DemoClass();

		// generic method working with String
		demo.<String>genericsMethod("Java Programming");

		// generic method working with integer
		demo.<Integer>genericsMethod(25);

	}

}
