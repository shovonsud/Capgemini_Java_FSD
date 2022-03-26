package com.cg.day3;

class Animal5 {

	// default or no-arg constructor
	Animal5() {
		System.out.println("I am an animal");
	}

	// parameterized constructor
	Animal5(String type) {
		System.out.println("Type: " + type);
	}
}

class Dog5 extends Animal5 {

	// default constructor
	Dog5() {

		// calling parameterized constructor of the superclass
		super("Animal");

		System.out.println("I am a dog");
	}
}

public class SuperDemo4 {

	public static void main(String[] args) {
		Dog5 dog1 = new Dog5();

	}

}
