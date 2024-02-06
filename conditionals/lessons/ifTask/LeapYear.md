LeapYear.java README

check this (My question to GPT)
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
        if ((year % 4 == 0) && (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else  {
            System.out.println(year + " is not a leap year");
        }
    }
}

for the task 3 Leap year and correct me with details


Check for correctness from ChatGPT:
Your code appears to correctly implement error handling for the conditions mentioned. Let's break down your code and evaluate it based on those conditions:

1. **No Input Provided**:
   - You correctly check if the length of the `args` array is 0 to determine if no input was provided.
   - If no input is provided, you print an error message prompting the user to provide a year as a command-line argument.
   - After printing the error message, you gracefully exit the program using the `return` statement, preventing further execution of the code.

2. **Invalid Input**:
   - You attempt to parse the input argument as an integer using `Integer.parseInt()`.
   - If the parsing fails due to invalid input (e.g., non-integer input), a `NumberFormatException` is thrown.
   - You catch this exception and print an error message indicating that the input is invalid.
   - After printing the error message, you gracefully exit the program using the `return` statement.

3. **Leap Year Check**:
   - After successfully parsing the input as an integer, you proceed to check if the year is a leap year.
   - Your leap year check `(year % 4 == 0) && (year % 400 == 0)` is incorrect. This condition checks if the year is divisible by both 4 and 400, which is unnecessary and incorrect. A leap year is divisible by 4 but not by 100 unless it is also divisible by 400.
   - You should revise your leap year condition to `(year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)` to accurately check for leap years.

Overall, your code effectively handles the first two conditions of no input provided and invalid input. However, the leap year check should be corrected to accurately determine leap years. Here's the corrected version of the leap year condition:

```java
// Condition 3: Leap Year Check
if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
    System.out.println(year + " is a leap year");
} else {
    System.out.println(year + " is not a leap year");
}
```

With this correction, your code will accurately determine whether the input year is a leap year.