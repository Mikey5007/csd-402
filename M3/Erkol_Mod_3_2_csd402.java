/**
 * CSD402-340A - Java for Programmers
 * Assignment 3.2
 * Mirach Erkol
 * 1/25/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 */

public class Erkol_Mod_3_2_csd402 {

    public static void main(String[] args) {

        int rows = 7;

        // Build the last row first so we know the max width to align everything (including @)
        String lastRow = buildRow(rows - 1);
        int maxWidth = lastRow.length();   // width of the numbers portion
        int atColumnWidth = maxWidth + 1;  // one space before @ (like the example)

        for (int i = 0; i < rows; i++) {
            String row = buildRow(i);

            // Center row based on last row width (this matches the screenshot)
            int leftPad = (maxWidth - row.length()) / 2;

            // Print left padding
            for (int s = 0; s < leftPad; s++) {
                System.out.print(" ");
            }

            // Print the row numbers
            System.out.print(row);

            // Right padding so @ is in a vertical
            int printedSoFar = leftPad + row.length();
            for (int s = printedSoFar; s < atColumnWidth; s++) {
                System.out.print(" ");
            }

            // Print the @ at the same column every line
            System.out.println("@");
        }
    }

    // Builds one row like: "1 2 4 2 1" with single spaces (no extra trailing spaces)
    private static String buildRow(int i) {
        StringBuilder sb = new StringBuilder();

        int num = 1;

        // Increasing side
        for (int j = 0; j <= i; j++) {
            sb.append(num);
            if (j < i) sb.append(" ");
            num *= 2;
        }

        // Decreasing side
        num /= 4;
        for (int j = 0; j < i; j++) {
            sb.append(" ").append(num);
            num /= 2;
        }

        return sb.toString();
    }
}
