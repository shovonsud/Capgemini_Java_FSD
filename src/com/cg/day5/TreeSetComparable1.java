package com.cg.day5;

import java.util.TreeSet;

public class TreeSetComparable1 implements Comparable<TreeSetComparable1> {
	private int rollNo;
	private String name;
	private int age;

	public TreeSetComparable1(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(TreeSetComparable1 o) {
		if (this.rollNo > o.rollNo) {
			return 1;
		} else if (this.rollNo == o.rollNo) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "RollNo-" + this.rollNo + ", Name-" + this.name + ", Age-" + this.age;
	}

	public static void main(String[] args) {
		TreeSet<TreeSetComparable1> TreeSetComparable1s = new TreeSet<>();
		TreeSetComparable1 TreeSetComparable1 = new TreeSetComparable1(3, "Raj", 20);
		TreeSetComparable1 TreeSetComparable2 = new TreeSetComparable1(5, "Shyam", 18);
		TreeSetComparable1 TreeSetComparable3 = new TreeSetComparable1(1, "Ram", 19);
		TreeSetComparable1 TreeSetComparable4 = new TreeSetComparable1(4, "Sunil", 25);
		TreeSetComparable1 TreeSetComparable5 = new TreeSetComparable1(2, "Ajay", 26);
		TreeSetComparable1s.add(TreeSetComparable1);
		TreeSetComparable1s.add(TreeSetComparable2);
		TreeSetComparable1s.add(TreeSetComparable3);
		TreeSetComparable1s.add(TreeSetComparable4);
		TreeSetComparable1s.add(TreeSetComparable5);
		for (TreeSetComparable1 e : TreeSetComparable1s) {
			System.out.println(e);
		}

	}

}
