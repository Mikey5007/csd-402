/**
 * CSD402-340A - Java for Programmers
 * Assignment 6.2
 * Mirach Erkol
 * 02/08/2026
 * GitHub: https://github.com/Mikey5007/csd-402
 *
 * ---------------------------------------------------------
 * Assignment 6.2: Fan Class
 *
 * (1) Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3, respectively.
 * (2) A private field named speed that holds one of the constant values, with the default being STOPPED.
 * (3) A private Boolean field titled on that specifies whether the fan is on or off.
 * (4) A private field named radius that holds the radius of the fan with a default value of 6.
 * (5) A String field that holds the color, with the default being white.
 * (6) Setter and getter methods for all mutable fields.
 * (7) A no-argument constructor that sets all fields to a default value.
 * (8) A constructor takes arguments and sets values.
 * (9) Write a toString() method that returns a description of the Fans' state.
 * (10) Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor. Write code that displays the functionality of the Fan class methods.
 * ---------------------------------------------------------
 */
public class Erkol_Mod_6_2_csd402 {

    public static void main(String[] args) {

        // (10) Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor.
        Fan fan1 = new Fan();                          // default constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue"); // argument constructor

        // (10) Write code that displays the functionality of the Fan class methods.
        System.out.println("===== FAN #1 (DEFAULT CONSTRUCTOR) =====");
        System.out.println(fan1.toString());

        System.out.println("\n===== FAN #2 (ARGUMENT CONSTRUCTOR) =====");
        System.out.println(fan2.toString());

        // (10) Write code that displays the functionality of the Fan class methods.
        System.out.println("\n===== UPDATING FAN #1 USING SETTERS =====");
        fan1.setOn(true);            // (6) Setter and getter methods for all mutable fields.
        fan1.setSpeed(Fan.MEDIUM);   // (6) Setter and getter methods for all mutable fields.
        fan1.setRadius(8);           // (6) Setter and getter methods for all mutable fields.
        fan1.setColor("black");      // (6) Setter and getter methods for all mutable fields.

        System.out.println(fan1.toString()); // (9) Write a toString() method that returns a description of the Fans' state.

        // (10) Write code that displays the functionality of the Fan class methods.
        System.out.println("\n===== FAN #2 GETTER CHECK =====");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("Is On?: " + fan2.isOn()); 
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}

/**
 * Fan class definition.
 * This class holds the fan's data (fields) and behaviors (methods).
 */
class Fan {

    // (1) Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3, respectively.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // (2) A private field named speed that holds one of the constant value, with the default being STOPPED.
    private int speed = STOPPED;

    // (3) A private Boolean field titled on that specifies whether the fan is on or off.
    private boolean on = false;

    // (4) A private field named radius that holds the radius of the fan with a default value of 6.
    private double radius = 6;

    // (5) A String field that holds the color, with the default being white.
    private String color = "white";

    // (7) A no-argument constructor that sets all fields to a default value.
    public Fan() {
        // defaults already set in field declarations
    }

    // (8) A constructor takes arguments and sets values.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // (6) Setter and getter methods for all mutable fields.
    public int getSpeed() {
        return speed;
    }

    // (6) Setter and getter methods for all mutable fields.
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // (6) Setter and getter methods for all mutable fields.
    public boolean isOn() {
        return on;
    }

    // (6) Setter and getter methods for all mutable fields.
    public void setOn(boolean on) {
        this.on = on;
    }

    // (6) Setter and getter methods for all mutable fields.
    public double getRadius() {
        return radius;
    }

    // (6) Setter and getter methods for all mutable fields.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // (6) Setter and getter methods for all mutable fields.
    public String getColor() {
        return color;
    }

    // (6) Setter and getter methods for all mutable fields.
    public void setColor(String color) {
        this.color = color;
    }

    // (9) Write a toString() method that returns a description of the Fans' state.
    @Override
    public String toString() {
        if (!on) {
            return "Fan is OFF | radius=" + radius + " | color=" + color + " | speed=" + speedToWord(speed) + " (" + speed + ")";
        }
        return "Fan is ON | speed=" + speedToWord(speed) + " (" + speed + ")"
                + " | radius=" + radius
                + " | color=" + color;
    }

    // helper method to make speed more readable (not required)
    private String speedToWord(int speed) {
        switch (speed) {
            case STOPPED: return "STOPPED";
            case SLOW:    return "SLOW";
            case MEDIUM:  return "MEDIUM";
            case FAST:    return "FAST";
            default:      return "UNKNOWN";
        }
    }
}
