/***************************************************************************************
* Compilation: javac LeapYear.java
* Execution: Java LeapYear
*
*
* Write a program that takes a year as input and prints whether it is a leap year or not.
* A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
*
*
* %java LeapYear 1942
* 1942 is not a leap year
*
* 
* %java LeapYear 2000
* 2000 is a leap year
*
* %java LeapYear 2024
* 2024 is a leap year
*
* %java LeapYear 1867
*
*
* %java LeapYear 1600
*
*
************************************************************************/
public class LeapYear {
    public static void main (String [] args) {
        //Condition 1: No Input Provided
        if (args.length == 0) {
            System.out.println("Error: Provide a year as command-line argument.");
            return; //Exit the program gracefully
        }

        // Condition 2: Invalid Input
        int year;
        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide valid integers.");
            return; //Exit the program gracefully
        } 

        // Condition 3: to check if the year supplied is a leapYear
        if ((year % 4 == 0) && (year % 100 != 100 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else  {
            System.out.println(year + " is not a leap year");
        }
    }
}