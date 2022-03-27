package com.cg.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp {

	private String name;
	private int salary;
	private int age;

	public Emp(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "(" + getName() + ", " + getAge() + ", " + getSalary() + ")";
	}
}

/*
 * To create custom comparator class, implement Comparator interface and
 * implement compareTo method.
 */

/*
 * 1. this comparator will sort employee objects according to their age.
 */
class EmpAgeComparator implements Comparator<Emp> {

	public int compare(Emp e1, Emp e2) {
		return e1.getAge() - e2.getAge();
	}
}

/*
 * 2. this comparator will sort employee objects according to their salary.
 */
class EmpSalaryComparator implements Comparator<Emp> {

	public int compare(Emp e1, Emp e2) {
		return e1.getSalary() - e2.getSalary();
	}
}

public class CustomComparator1 {

	public static void main(String[] args) {
		// create some Emp objects
		ArrayList<Emp> listEmp = new ArrayList<Emp>();
		listEmp.add(new Emp("John", 98000, 40));
		listEmp.add(new Emp("Mark", 67000, 42));
		listEmp.add(new Emp("Oliver", 120000, 28));

		// list without sorting
		System.out.println("Emp list without sorting");
		System.out.println(listEmp);

		// sort the list using age comparator
		Collections.sort(listEmp, new EmpAgeComparator());

		System.out.println("Emp list after sorting by age");
		System.out.println(listEmp);

		// sort the list using salary comparator
		Collections.sort(listEmp, new EmpSalaryComparator());

		System.out.println("Emp list after sorting by salary");
		System.out.println(listEmp);

	}

}
