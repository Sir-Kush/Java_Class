/************************************************************************************************
 * Compilation: javac LargestNum.java
 * Execution: Java LargestNum
 *
 *
 * Write a program that takes a character as input and prints whether it is a vowel or a consonant.
 * 
 *
 *
 * %java LargestNum 99 467 898
 *
 * 
 * %java LargestNum 674 988 91
 *
 * 
 * %java LargestNum 2000 567 876
 *
 *
 **************************************************************************************************/
public class LargestNum {
    public static void main(String[] args) {
        // Condition 1: No input provided
        if (args.length <= 2) {
            System.out.println("Please provide three integers as input arguments.");
            return;  // Exit program gracefully
        }

        // Convert command-line arguments to integers
        int a, b, c;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide valid integers.");
            return; // Exit the program gracefully
        }

        // Condition 3: To print the largest among them
        if (a > b) {
            int t = a; a = b; b = t;
        }
        if (a > c) {
            int t = a; a = c; c = t;
        }
        if (b > c) {
            int t = b; b = c; c = t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("The largest value is: " + c);

    }
}