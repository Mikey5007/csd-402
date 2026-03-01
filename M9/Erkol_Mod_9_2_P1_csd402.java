/**
 * CSD402-340A - Java for Programmers
 * Assignment 9.2 - Program 1
 * Mirach Erkol
 * 
 * ---------------------------------------------------------
 * Program 1 Requirements:
 * (1) Create an ArrayList filled with a minimum of 10 Strings.
 * (2) Use a for-each loop to print the ArrayList.
 * (3) Ask the user which element they would like to see again.
 * (4) Use try/catch to attempt to print the selected element.
 * (5) If invalid index is entered, display:
 *     "Exception thrown: Out of Bounds"
 * (6) Demonstrate Autoboxing/Auto-Unboxing.
 * ---------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Erkol_Mod_9_2_P1_csd402 {

    public static void main(String[] args) {

        // (1) Create ArrayList with minimum 10 Strings
        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Mango");
        items.add("Grapes");
        items.add("Peach");
        items.add("Pineapple");
        items.add("Strawberry");
        items.add("Blueberry");
        items.add("Watermelon");

        // (2) Print using for-each loop
        System.out.println("ArrayList Contents:");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the index number of the element you would like to see again (0-9):");

        // (6) Autoboxing example
        Integer userIndex = scanner.nextInt(); // int → Integer (autoboxing)

        try {
            // Auto-unboxing occurs when using userIndex as int
            System.out.println("You selected: " + items.get(userIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}