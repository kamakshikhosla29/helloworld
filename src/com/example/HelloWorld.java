package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {
	public void filehandling() throws FileNotFoundException {
		File file = new File("C:\\Users\\kamakshikhosla\\Desktop\\appiumimp.txt");
		try {
			FileInputStream f1 = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void arrayoutexcep() {
		String ar1 = "VIBGYOR";
		char ar2[] = ar1.toCharArray();
		System.out.println("Element at 4th position is::" + ar2[4]);
		try {
			System.out.println("Element at 8th position is::" + ar2[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown is::" + e);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// System.out.println("new branch sample");
		HelloWorld h1 = new HelloWorld();
		h1.arrayoutexcep();
		h1.filehandling();
	}
}
