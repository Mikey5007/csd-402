/**
 * CSD402-340A - Java for Programmers
 * Assignment 9.2 - Program 2
 * Mirach Erkol
 *
 * ---------------------------------------------------------
 * Program 2 Requirements:
 * (1) Create a file titled "data.file" if it does not exist.
 * (2) Write 10 randomly generated integers to the file.
 * (3) If file exists, append 10 more integers.
 * (4) Each integer separated by a space.
 * (5) Close the file.
 * (6) Reopen the file.
 * (7) Read and display the file contents.
 * ---------------------------------------------------------
 */

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Erkol_Mod_9_2_P2_csd402 {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            // (1) Create file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data.");
            }

            // (2 & 3) Write or append 10 random numbers
            FileWriter fileWriter = new FileWriter(file, true); // true = append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // random number 0-99
                printWriter.print(number + " ");
            }

            printWriter.close(); // (5) Close file after writing

            System.out.println("10 random numbers written to file.\n");

            // (6 & 7) Reopen file and read contents
            Scanner fileScanner = new Scanner(file);

            System.out.println("File Contents:");

            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }

            fileScanner.close();

        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }
}