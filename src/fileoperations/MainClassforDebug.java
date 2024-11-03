package com.example.fileoperations;

public class MainClassforDebug {
	 public static void main(String[] args) {
	        FileOperations fileOps = new FileOperations();

	        // Test the file operations
	        String filename = "example.txt";
	        fileOps.createFile(filename);
	        fileOps.writeFile(filename, "Hello, Mohamed Yaseen from ECE is Here.");
	        fileOps.readFile(filename);
	        fileOps.deleteFile(filename);
	    }
}
