package com.lessons.fileusage.fortuneteller;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {

	 /**
     * @param args the command line arguments
     */
	
	public static void main(String[] args) {
		File inputFile = new File("files/answers.txt");
		ArrayList<String> answers = new ArrayList<String>();
		String answer, response = "yes";
		Random rand = new Random();
		
		
		try {
			Scanner input = new Scanner(inputFile);
		
		while(input.hasNextLine()) {
			answer = input.nextLine();
			answers.add(answer);
			
		}

	} catch(Exception e) {
		System.out.println(" The input file \"answers.txt\" was not found ");
		System.out.println(e.toString());
		
	}
	Scanner scan = new Scanner(System.in);
	while(response.equalsIgnoreCase("yes")) {
		System.out.println("The fortune teller is ready for you\n" 
				+ "Please think about your question in your mind \n"
				+ "and hit enter for your reply. ");
		scan.nextLine();
		System.out.println("The fortune teller says: \"" + 
				answers.get(rand.nextInt(answers.size())) + "\"\n");
		System.out.println("Do you have another question? (yes/no)");
		response = scan.nextLine();
	}

}
}
