/* The "Energy" program to convert Mass of an object in Kg
*  to Energy(J).
*
* @author  Hussein
* @version 1.0
* @since 2020-11-18
*/

import java.util.Scanner;

/**
* This is the standard "LoggingCompany" program.
*/

final class Energy {
    /**
    * Declaring exponent variable.
    */
    public static final double POW2 = 2;
    /**
    * Declaring exponent variable.
    */
    public static final double POW8 = 8;
    /**
    * Declaring exponent variable.
    */
    public static final int TEN = 10;

    /**
    * Declaring Speed Of Light variable.
    */
    public static final double SPEEDOFLIGHT = 2.998;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting...
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Speed of light constant
        final double lightSpeed = SPEEDOFLIGHT * Math.pow(TEN, POW8);

        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the mass of an object in Kg: ");

        // Checks if there is an Invalid Input. (try...catch)
        try {

            // Input
            final float mass = myObj.nextFloat();

            // Process
            final double energy = mass * Math.pow(lightSpeed, POW2);

            // Output
            System.out.println(mass + "kg of mass would produce "
                + energy + " (J)" + " of energy.");
        }
        catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("Sorry, that was not a number.");
        }
        System.out.println("\nDone.");
    }
}
