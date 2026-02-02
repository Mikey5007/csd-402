/**
 * CSD402-340A - Java for Programmers
 * Assignment 4.2
 * Mirach Erkol
 * 02/01/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 */
public class Erkol_Mod_4_2_csd402 {

    /*
     * OVERLOADED METHOD #1
     * Calculates the average from a short array
     * (A short array stores small whole numbers between -32,768 and 32,767)
     */
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    /*
     * OVERLOADED METHOD #2
     * Calculates the average from an int array
     * (An int array stores whole numbers without decimals — most common number type in Java)
     */
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    /*
     * OVERLOADED METHOD #3
     * Calculates the average from a long array
     * (A long array stores very large whole numbers — bigger than int can hold)
     */
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /*
     * OVERLOADED METHOD #4
     * Calculates the average from a double array
     * (A double array stores numbers with decimals — used for more precise values)
     */
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /*
     * Method to print arrays in a readable way
     */
    public static void printArray(String label, Object array) {
        System.out.print(label + ": [ ");

        if (array instanceof short[]) {
            for (short num : (short[]) array) System.out.print(num + " ");
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) System.out.print(num + " ");
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) System.out.print(num + " ");
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) System.out.print(num + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        // Each array represents the number of moons orbiting different celestial bodies.
        // NOTE: All arrays are DIFFERENT SIZES (assignment requirement)

        short[] innerPlanetsMoons = {0, 0, 1, 2};
        // Size = 4 (Mercury, Venus, Earth, Mars)

        int[] gasGiantMoons = {95, 146, 83, 27, 14, 2, 1};
        // Size = 7 (Expanded list for assignment requirement)

        long[] dwarfPlanetMoons = {5L, 1L, 2L, 1L, 0L};
        // Size = 5 (Pluto, Eris, Haumea, Makemake, Ceres)

        double[] averageDiscoveryPerDecade = {2.5, 4.2, 6.8, 10.1, 15.6, 20.3};
        // Size = 6 (Example averages of moon discoveries per decade)

        System.out.println("==== Solar System Moon Averages ====\n");

        printArray("Inner Planets Moon Count", innerPlanetsMoons);
        System.out.println("Average Moons (short): " + average(innerPlanetsMoons) + "\n");

        printArray("Gas Giants Moon Count", gasGiantMoons);
        System.out.println("Average Moons (int): " + average(gasGiantMoons) + "\n");

        printArray("Dwarf Planets Moon Count", dwarfPlanetMoons);
        System.out.println("Average Moons (long): " + average(dwarfPlanetMoons) + "\n");

        printArray("Avg Moon Discoveries Per Decade", averageDiscoveryPerDecade);
        System.out.println("Average Discoveries (double): " + average(averageDiscoveryPerDecade));
    }
}
