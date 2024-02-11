/************************************************************************************************
* Compilation: javac AgeGroup.java
* Execution: Java AgeGroup
*
*
* Write a program that takes an age as input and prints the corresponding age group:

*   -Child: 0-12 years
*   -Teenager: 13-19 years
*   -Adult: 20 years and above
* 
*
*
* %java AgeGroup 13
* Error: Invalid input. Please provide a single character.
*
* %java AgeGroup 8
*Error: Invalid input. Please provide a single character.
*
* %java AgeGroup 23
* The letter you provide is: a which is AgeGroup letter
* 
* %java AgeGroup 57
* The letter you provide is: a which is consonant letter
*
**************************************************************************************************/
public class AgeGroup {
    
    public static void main (String [] args) {
    
    // Condittion 1: No input provide
        if (args.length == 0) {
            System.out.println("Error: Provide valid interger to the command-line input");
            return; // Exit thr program gracefully
        }

    // Condition 2: Invalid input.
        int age;
        try {
            age = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error: Invalide input. Please provide integer number for age");
            return; // Exit the program gracefully
        }

        // To check if age is negeative or higher than 120
        if (age < 0 ) { 
            System.out.println("Error: Inalid age supplied. Age cannot be negative");
            return; // Exit the program gracefull
        } if (age >120) {
            System.out.println("Error: Ivalid age supplied, Age cannot be more than 120 in this era");
            return;
        }
        
        // to know the age group
        String ageGroup;
        if (age <= 12) {
            ageGroup = "Child";
        } else if (age <= 19) {
            ageGroup = "Teenager";
        } else {
            ageGroup = "Adult";
        }
        // print the ageGroup
        System.out.println("Your age is: " + age + " You're a " + ageGroup + ".");
    }
    
}
