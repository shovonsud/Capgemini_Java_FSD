package com.cg.day3;

class Animal4 {

	// default or no-arg constructor of class Animal
	Animal4() {
		System.out.println("I am an animal");
	}
}

class Dog4 extends Animal4 {

	// default or no-arg constructor of class Dog
	Dog4() {

		// calling default constructor of the superclass
		super();

		System.out.println("I am a dog");
	}
}

public class SuperDemo3 {

	public static void main(String[] args) {
		Dog4 dog1 = new Dog4();

	}

}
