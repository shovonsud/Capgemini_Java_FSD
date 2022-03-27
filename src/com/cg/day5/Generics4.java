package com.cg.day5;

public class Generics4<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Generics4<String> type = new Generics4<>();
		type.set("String");

		Generics4<Integer> type1 = new Generics4<>();
		type1.set(100);

		/*
		 * Integer integer = (Integer) type.get(); // compiler error
		 * System.out.println(integer);
		 */

	}

}
