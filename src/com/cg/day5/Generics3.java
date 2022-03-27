package com.cg.day5;

class GenericsClass2<T extends Number> {

	public void display() {
		System.out.println("This is a bounded type generics class.");
	}
}

public class Generics3 {

	public static void main(String[] args) {
		// create an object of GenericsClass
		@SuppressWarnings("unused")
		GenericsClass2<Number> obj = new GenericsClass2<>();
		obj.display();

	}

}
