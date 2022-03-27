package com.cg.day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataTimeFormatter1 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "14/10/2020";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println("parsed local date: " + localDate);
		System.out.println("formatted local date: " + formatter.format(localDate));
	}

}
