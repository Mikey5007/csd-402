/**
 * CSD402-340A - Java for Programmers
 * Assignment 7.2 - UseFans
 * Mirach Erkol
 * 02/14/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 *
 * ---------------------------------------------------------
 * Assignment Requirements:
 * (1) Create a collection of Fan instances.
 * (2) Create a method that takes a collection of Fan objects
 *     and displays them WITHOUT using toString().
 * (3) Create a method that takes a single Fan object
 *     and displays it WITHOUT using toString().
 * (4) Use the 'this' reference throughout the Fan class
 *     where allowed.
 * (5) Write test code demonstrating functionality.
 * ---------------------------------------------------------
 */

import java.util.ArrayList;

public class Erkol_Mod_7_2_csd402 {

    public static void main(String[] args) {

        // (1) Create a collection of Fan instances
        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(new Fan()); // Default fan
        fans.add(new Fan(Fan.FAST, true, 10, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 8, "black"));
        fans.add(new Fan(Fan.SLOW, false, 12, "red"));

        // (5) Test displaying all fans
        System.out.println("===== DISPLAYING ALL FANS =====");
        displayFans(fans);

        // (5) Test displaying a single fan
        System.out.println("\n===== DISPLAYING SINGLE FAN =====");
        displayFan(fans.get(1));
    }

    // (2) Method that takes a collection of Fan objects (NO toString used)
    public static void displayFans(ArrayList<Fan> fanList) {
        for (Fan fan : fanList) {
            displayFan(fan);
            System.out.println("----------------------------------");
        }
    }

    // (3) Method that takes a single Fan object (NO toString used)
    public static void displayFan(Fan fan) {

        System.out.println("Fan Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
}

/**
 * Fan class definition
 */
class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters (using this reference)

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
