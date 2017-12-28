package com.lessons.fileusage.customernames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CustomerNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File output = new File("files/customers.txt");
		String name;
		System.out.println("Enter customer: ");
		name = scan.nextLine();


		try {
			PrintWriter out = new PrintWriter(output);
			// TODO Auto-generated catch block

			while(name.equalsIgnoreCase("done") == false) {
				out.println(name);
				System.out.println("Enter next customer or type \"exit\" to quit:");
				name = scan.nextLine();

			}
			out.close();

		} catch (Exception e) {

			System.out.println(" Error encountered " + e.toString());
		}

	}
}
