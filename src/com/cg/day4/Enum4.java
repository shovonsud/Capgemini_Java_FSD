package com.cg.day4;

public class Enum4 {

	enum Position {

		Reema("Panda"), Himanshu("Bhardwaj"), Geetanjali("Sharma");

		String lName;

		Position(String s) {

			lName = s;
		}

		String showPosition() {

			return lName;
		}
	}

	public static void main(String[] args) {

		for (Position pos : Position.values()) {

			int val = pos.ordinal() + 1;

			System.out.println(
					"First name = " + pos + "\nLast name = " + pos.showPosition() + "\nPosition in class = " + val);

			System.out.println();
		}

	}

}
