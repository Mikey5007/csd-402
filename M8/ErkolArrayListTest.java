import java.util.ArrayList;
import java.util.Scanner;

/**
 * CSD402-340A - Java for Programmers
 * Assignment 8.2
 * Mirach Erkol
 * 02/21/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 *
 * ---------------------------------------------------------
 * ASSIGNMENT INSTRUCTIONS:
 *
 * 1. Create a class [yourName]ArrayListTest.
 * 2. A method that receives an ArrayList populated with an Integer data type
 *    holding the integers received from user input.
 * 3. The user input is to accept Integers that are then assigned to the ArrayList
 *    until a value of 0 is entered, which is also assigned to the ArrayList.
 * 4. The ArrayList is then to be sent to the method.
 * 5. The method is then to return the largest value in the ArrayList.
 * 6. If the ArrayList is sent in empty, the method will then return 0.
 * 7. The method signature is to be public static Integer max (ArrayList list).
 * 8. Write additional code for testing your method.
 * 9. The method will return the largest value that is displayed to the user.
 */

public class ErkolArrayListTest {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList populated with an Integer data type
        ArrayList<Integer> list = new ArrayList<>();

        // The user input is to accept Integers that are then assigned to the ArrayList
        // until a value of 0 is entered, which is also assigned to the ArrayList.
        System.out.println("Enter integers (enter 0 to stop):");

        Integer input;

        do {
            input = scanner.nextInt();

            // Assign the integer to the ArrayList (including 0)
            list.add(input);

        } while (input != 0);

        // The ArrayList is then to be sent to the method.
        Integer largest = max(list);

        // The method will return the largest value that is displayed to the user.
        System.out.println("\nThe numbers entered are: " + list);
        System.out.println("The largest value is: " + largest);

        scanner.close();
    }

    /**
     * A method that receives an ArrayList populated with an Integer data type
     * holding the integers received from user input.
     *
     * The method signature is:
     * public static Integer max (ArrayList list)
     *
     * The method is then to return the largest value in the ArrayList.
     *
     * If the ArrayList is sent in empty, the method will then return 0.
     */
    public static Integer max(ArrayList list) {

        // If the ArrayList is sent in empty, the method will then return 0.
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Initialize the first value as the current largest value
        Integer maxValue = (Integer) list.get(0);

        // Loop through the ArrayList to determine the largest value
        for (Object obj : list) {

            Integer value = (Integer) obj;

            if (value > maxValue) {
                maxValue = value;
            }
        }

        // The method is then to return the largest value in the ArrayList.
        return maxValue;
    }
}