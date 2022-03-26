package com.cg.day4;

public class TryCatch1 {

	public static void main(String[] args) {
		try {

			// code that generate exception
			@SuppressWarnings("unused")
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

}
