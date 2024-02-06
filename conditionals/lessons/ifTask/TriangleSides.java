/***************************************************************************************
* Compilation: javac TriangleSides.java
* Execution: Java TriangleSides
*
*
*
* Write a program that takes three integers as input representing the lengths of the sides 
* of a triangle and prints whether the triangle is equilateral, isosceles, or scalene.
*
*
*
* %java TriangleSides 1942
* 1942 is positive number
*
* 
* %java TriangleSides 76548
* 76548 is positive number
*
* %java TriangleSides 00
* 0 is Zero indeed
*
* %java TriangleSides 456783
*
*
* %java TriangleSides -89765
* -89765 is negative number
*
************************************************************************/
public class TriangleSides {
    public static void main (String [] args) {
        // Condition 1: No input Provided
        if (args.length <= 2) {
            System.out.println("Error: Provide number as a command-line argument.");
            return; // Exit the program with honour
        }

        // Condition 2: Invalid input.
        double sideA, sideB, sideC;
        try {
            sideA = Double.parseDouble(args [0]);
            sideB = Double.parseDouble(args [1]);
            sideC = Double.parseDouble(args [2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Inavlid input. Please supply the valid interger.");
            return; // Exit the program deligently.
        }

        // Condition 3: Checking the validation of th the conditions
        if ((sideA == sideB) && ((sideA == sideC))) {
            System.out.println("The triangle is an Equilateral triangle the 3 sides are equal");
        } else if (((sideA == sideB ) && (sideA != sideC))                                                                                                  || ((sideA == sideC) && (sideC != sideB))                                                                                                  || ((sideB == sideC) && (sideB != sideA))) {
            System.out.println("This triangle is an Isoscles triangle 2 sides are equal");
        }else {
            System.out.println("This triangle is Scalen triangle no side is equal");
        }
    }
}
