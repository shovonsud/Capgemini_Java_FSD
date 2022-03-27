package com.cg.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student {
	String season, studentNo, classNo, marks;

	public Student(String season, String studentNo, String classNo, Integer n) {
		this.season = season;
		this.studentNo = studentNo;
	}
}

public class HashToTreeMap {

	public static void main(String[] args) {
		/*
		 * create a new HashMap to store student's total marks and Student mapping
		 */
		HashMap<Integer, Student> hMapStudentMarks = new HashMap<Integer, Student>();

		// add Student objects
		// add Student objects
		hMapStudentMarks.put(76, new Student("S01", "Student1", "12th", 76));
		hMapStudentMarks.put(57, new Student("S01", "Student1", "12th", 57));
		hMapStudentMarks.put(88, new Student("S01", "Student1", "12th", 88));
		hMapStudentMarks.put(65, new Student("S01", "Student1", "12th", 65));
		hMapStudentMarks.put(46, new Student("S01", "Student1", "12th", 46));

		System.out.println("HashMap Keys and Values");
		for (Map.Entry<Integer, Student> entry : hMapStudentMarks.entrySet()) {
			System.out.println(entry.getKey() + " => " + ": " + entry.getValue());
		}

		// blank line
		System.out.println("");

		/*
		 * Use the TreeMap constructor which accepts an existing Map object
		 */

		TreeMap<Integer, Student> tMapStudentMarks = new TreeMap<Integer, Student>(hMapStudentMarks);

		System.out.println("TreeMap Keys and Values");
		for (Map.Entry<Integer, Student> entry : tMapStudentMarks.entrySet()) {
			System.out.println(entry.getKey() + " => " + ": " + entry.getValue());
		}

	}

}
