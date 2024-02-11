import java.text.NumberFormat;
/*************************************************************************
 * Compilation: javac Comparisson.java
 * Execution: java Comparisson 12 89
 * 
 * 
 * Write a program that takes two numbers as input and prints whether the
 * first number is greater than, less than, or equal to the second number.
 * 
 * 
 * % java Comparisson 12 89
 * 12 is less than 89
 * 
 * % java Comparisson 967 234
 * 967 is greater than 234
 * 
 * % java Comparisson 9999 9999
 * 9999 is equal to 9999
 * 
 **************************************************************************/
public class Comparisson {
    public static void main (String [] args) {
        // Condition 1: No input. Check exactly if 2 input is supplied to the command-line
        if (args.length != 2) {
            System.out.println("Error: You did not input any value, kindly provide two interger value as input");
            return; //Exit program gracefully   
        }

        // condition 2: Invalid input.
        int num1, num2;
        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error: Invalid input. Provide two interger number to command-line input");
            return; //Exit program gracefully
        }

        // Condition 3: Check for comparisson of num1 and num2.
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);   
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        } 
            
    }
}
