/***************************************************************************************
* Compilation: javac PosNegZero.java
* Execution: Java PosNegZero
*
*
*
* Write a program that takes a number as input and prints whether it is 
*positive, negative, or zero.
*
*
*
* %java PosNegZero 1942
* 1942 is not a leap year
*
* 
* %java PosNegZero 76548
* 2000 is a leap year
*
* %java PosNegZero 00
* 2024 is a leap year
*
* %java PosNegZero 456783
*
*
* %java PosNegZero -89765
*
*
************************************************************************/
public class PosNegZero {
    public static void main (String [] args) {
        // Condition 1: No input Provided
        if (args.length == 0) {
            System.out.println("Error: Provide number as a command-line argument.");
            return; // Exit the program with honour
        }

        // Condition 2: Invalid input.
        int number;
        try {
            number = Integer.parseInt(args [0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Inavlid input. Please supply the valid interger.");
            return; // Exit the program deligently.
        }

        // Condition 3: Checking the validation of th the conditions
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is Zero indeed");
        }
    }
}