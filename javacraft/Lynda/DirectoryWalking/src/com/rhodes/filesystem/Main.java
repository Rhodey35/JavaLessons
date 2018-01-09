package com.rhodes.filesystem;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
	
		Path fileDir = Paths.get("files");
		TraveringFilesFileVisitor visitor = new TraveringFilesFileVisitor();
		Files.walkFileTree(fileDir, visitor);
		
	}
	
	
}
