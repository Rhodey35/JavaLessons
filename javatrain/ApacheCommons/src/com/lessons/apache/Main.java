package com.lessons.apache;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		File sourceFile = new File("files/loremipsum.txt");
		File targetFile = new File("files/targetfile.txt");
		
		try {
			FileUtils.copyFile(sourceFile, targetFile);
			System.out.println("Your file has processed. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
