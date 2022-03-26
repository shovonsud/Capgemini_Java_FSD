package com.cg.day4;

import java.io.File;

public class File3 {

	public static void main(String[] args) {
		// creates a file object
		File file = new File("C:\\Users\shovo\\Desktop\\");

		// returns an array of all files
		String[] fileList = file.list();

		for (String str : fileList) {
			System.out.println(str);
		}

	}

}
