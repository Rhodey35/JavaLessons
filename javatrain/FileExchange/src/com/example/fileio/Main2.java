package com.example.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * 
 * APACHE COMMONS == this is a great resource for file transfer and such for 
 * server management. 
 * 
 */

public class Main2 {

	public static void main(String[] args) {
	
		Path sourceFile = Paths.get("src", "loremipsum.txt");
		Path targetFile = Paths.get("files", "target5.txt");
		
		try {
			Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Your file has been processed. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
