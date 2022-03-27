package com.cg.day5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparable1 implements Comparable<ArrayListComparable1> {
	String firstName;
	String lastName;
	String bookName;

	ArrayListComparable1(String first, String last, String book) {
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
	}

	@Override
	/*
	 * This is where we write the logic to sort. This method sort automatically by
	 * the first name in case that the last name is the same.
	 */
	public int compareTo(ArrayListComparable1 au) {
		/*
		 * Sorting by last name. compareTo should return < 0 if this(keyword) is
		 * supposed to be less than au, > 0 if this is supposed to be greater than
		 * object au and 0 if they are supposed to be equal.
		 */
		int last = this.lastName.compareTo(au.lastName);
		// Sorting by first name if last name is same d
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	}

	public static void main(String[] args) {
		// List of objects of ArrayListComparable1 class
		ArrayList<ArrayListComparable1> al = new ArrayList<ArrayListComparable1>();
		al.add(new ArrayListComparable1("Henry", "Miller", "Tropic of Cancer"));
		al.add(new ArrayListComparable1("Nalo", "Hopkinson", "Brown Girl in the Ring"));
		al.add(new ArrayListComparable1("Frank", "Miller", "300"));
		al.add(new ArrayListComparable1("Deborah", "Hopkinson", "Sky Boys"));
		al.add(new ArrayListComparable1("George R. R.", "Martin", "Song of Ice and Fire"));

		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class ArrayListComparable1
		 */
		Collections.sort(al);
		for (ArrayListComparable1 str : al) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName);
		}

	}

}
