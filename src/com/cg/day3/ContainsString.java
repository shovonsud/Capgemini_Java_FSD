package com.cg.day3;

public class ContainsString {

	public static void main(String[] args) {
		String str1 = "Learn Java";
		String str2 = "Java";
		String str3 = "java";
		boolean result;

		// true because "Learn Java" contains "Java"
		if (str1.contains(str2)) {
			System.out.println(str1 + " contains " + str2);
		} else {
			System.out.println(str1 + " doesn't contains " + str2);
		}

		// contains() is case-sensitive
		// false because "Learn Java" doesn't contains "java"
		if (str1.contains(str3)) {
			System.out.println(str1 + " contains " + str3);
		} else {
			System.out.println(str1 + " doesn't contain " + str3);
		}
	}

}
