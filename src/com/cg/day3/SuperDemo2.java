package com.cg.day3;

class Animal3 {
	protected String type = "animal";
}

class Dog3 extends Animal3 {
	public String type = "mammal";

	public void printType() {
		System.out.println("I am a " + type);
		System.out.println("I am an " + super.type);
	}
}

public class SuperDemo2 {

	public static void main(String[] args) {
		Dog3 dog1 = new Dog3();
		dog1.printType();

	}

}
