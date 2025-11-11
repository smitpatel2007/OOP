// 5.	Write a program that shows the use of throws keyword.

import java.io.*;

public class pr6_5 {

    // Method that declares to throw an IOException
    static void checkFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program executed successfully.");
    }
}
