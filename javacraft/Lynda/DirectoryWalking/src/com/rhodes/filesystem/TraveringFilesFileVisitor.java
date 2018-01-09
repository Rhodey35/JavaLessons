package com.rhodes.filesystem;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TraveringFilesFileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Just checked directory " + dir);
		return FileVisitResult.CONTINUE;
		// default code: return super.postVisitDirectory(arg0, arg1);
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("About to check directory: " + dir);
		return FileVisitResult.CONTINUE;
		// default code: return super.preVisitDirectory(arg0, arg1);
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (attrs.isRegularFile()) {
			System.out.println("Regular File: ");
		}
		System.out.println(file);
		return FileVisitResult.CONTINUE;
		// default code: return super.visitFile(arg0, arg1);
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.err.println(exc.getMessage());
		return super.visitFileFailed(file, exc);
		// default code: return super.visitFileFailed(arg0, arg1);
	}

}
