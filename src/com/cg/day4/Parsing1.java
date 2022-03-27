package com.cg.day4;

public class Parsing1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = Integer.parseInt("12");
		double c = Double.parseDouble("12");
		int b = Integer.parseInt("100", 2);

		System.out.println(Integer.parseInt("12"));
		System.out.println(Double.parseDouble("12"));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("101", 8));

	}

}
