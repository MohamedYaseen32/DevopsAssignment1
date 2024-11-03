package com.example.fileoperations;

import java.io.*;
import java.nio.file.*;

public class FileOperations {

    // Method to create a new file
    public void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Method to write to a file
    public void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public void readFile(String filename) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            System.out.println("File contents: \n" + content);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to delete a file
    public void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Main method to run the file operations
    public static void main(String[] args) {
        FileOperations fileOps = new FileOperations();

        // Example usage
        String filename = "example.txt";
        fileOps.createFile(filename); // Create a new file
        fileOps.writeFile(filename, "Hello, this is a test file!"); // Write to the file
        fileOps.readFile(filename); // Read from the file
        fileOps.deleteFile(filename); // Delete the file
    }
}
