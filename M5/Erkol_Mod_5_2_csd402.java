/**
 * CSD402-340A - Java for Programmers
 * Assignment 5.2
 * Mirach Erkol
 * 02/08/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 *
 * ---------------------------------------------------------
 * Assignment 5.2: Locate Largest/Smallest in a 2D Array
 * - Overloaded methods for int[][] and double[][]
 * - Each method returns a 1D int[] containing {row, col}
 * - Includes test code in main() to prove it works
 * ---------------------------------------------------------
 */
public class Erkol_Mod_5_2_csd402 {

    public static void main(String[] args) {

        // ----------------------------
        // TEST DATA (int 2D array)
        // ----------------------------
        int[][] intGrid = {
                {  3,  9,  4 },
                {  7,  2, 10 },
                { -5,  6,  1 }
        };

        // ----------------------------
        // TEST DATA (double 2D array)
        // ----------------------------
        double[][] doubleGrid = {
                {  1.5,  2.2,  3.1 },
                { -4.8,  9.9,  0.0 },
                {  7.7,  6.6, -1.1 }
        };

        // Call each method and store the returned location {row, col}
        int[] intLargestLoc = locateLargest(intGrid);
        int[] intSmallestLoc = locateSmallest(intGrid);

        int[] doubleLargestLoc = locateLargest(doubleGrid);
        int[] doubleSmallestLoc = locateSmallest(doubleGrid);

        // ----------------------------
        // DISPLAY RESULTS
        // ----------------------------
        System.out.println("===== INT ARRAY RESULTS =====");
        System.out.println("Largest int location:  [row=" + intLargestLoc[0] + ", col=" + intLargestLoc[1] + "]"
                + "  value=" + intGrid[intLargestLoc[0]][intLargestLoc[1]]);
        System.out.println("Smallest int location: [row=" + intSmallestLoc[0] + ", col=" + intSmallestLoc[1] + "]"
                + "  value=" + intGrid[intSmallestLoc[0]][intSmallestLoc[1]]);

        System.out.println("\n===== DOUBLE ARRAY RESULTS =====");
        System.out.println("Largest double location:  [row=" + doubleLargestLoc[0] + ", col=" + doubleLargestLoc[1] + "]"
                + "  value=" + doubleGrid[doubleLargestLoc[0]][doubleLargestLoc[1]]);
        System.out.println("Smallest double location: [row=" + doubleSmallestLoc[0] + ", col=" + doubleSmallestLoc[1] + "]"
                + "  value=" + doubleGrid[doubleSmallestLoc[0]][doubleSmallestLoc[1]]);
    }

    // ---------------------------------------------------------
    // locateLargest(double[][])
    // Loops through the entire 2D double array and finds the largest value.
    // Returns its location as {row, col}.
    // ---------------------------------------------------------
    public static int[] locateLargest(double[][] arrayParam) {
        // Assume the first element is the largest until we find something bigger
        int bestRow = 0;
        int bestCol = 0;
        double largest = arrayParam[0][0];

        // Loop through every row...
        for (int r = 0; r < arrayParam.length; r++) {
            // ...and every column in the current row
            for (int c = 0; c < arrayParam[r].length; c++) {
                // If we find a bigger value, update largest and store its location
                if (arrayParam[r][c] > largest) {
                    largest = arrayParam[r][c];
                    bestRow = r;
                    bestCol = c;
                }
            }
        }

        // Return the row/col location in a one-dimensional array
        return new int[] { bestRow, bestCol };
    }

    // ---------------------------------------------------------
    // locateLargest(int[][])
    // ---------------------------------------------------------
    public static int[] locateLargest(int[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        int largest = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > largest) {
                    largest = arrayParam[r][c];
                    bestRow = r;
                    bestCol = c;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }

    // ---------------------------------------------------------
    // locateSmallest(double[][])
    // Loops through the entire 2D double array and finds the smallest value.
    // Returns its location as {row, col}.
    // ---------------------------------------------------------
    public static int[] locateSmallest(double[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        double smallest = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallest) {
                    smallest = arrayParam[r][c];
                    bestRow = r;
                    bestCol = c;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }

    // ---------------------------------------------------------
    // locateSmallest(int[][])
    // ---------------------------------------------------------
    public static int[] locateSmallest(int[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        int smallest = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallest) {
                    smallest = arrayParam[r][c];
                    bestRow = r;
                    bestCol = c;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }
}
