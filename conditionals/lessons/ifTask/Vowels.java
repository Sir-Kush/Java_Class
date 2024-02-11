
/************************************************************************************************
* Compilation: javac Vowels.java
* Execution: Java Vowels
*
*
* Write a program that takes a character as input and prints whether it is a
* vowel or a consonant.
* 
*
*
* %java Vowels Adediwura
* Error: Invalid input. Please provide a single character.
*
* %java Vowels admide
*Error: Invalid input. Please provide a single character.
*
* %java Vowels A
* The letter you provide is: a which is vowel letter
* 
* %java Vowels c
* The letter you provide is: a which is consonant letter
*
**************************************************************************************************/
public class Vowels {
    public static void main(String[] args) {
    // Condition 1: No input provide,
        if (args.length == 0) {
            System.out.println("Error: Provide a valid character to the command-line input");
            return; // Exit the program gracefully
        }

        // Condition 2: Invalid input.
        // Get the first argument which should be the letter
        String input = args[0];
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Invalid input. Please provide a single character.");
            return; // Exit the program gracefully
        }

        char letter = Character.toLowerCase(input.charAt(0));

        // Condtion 3: Test for whic is vowel:
        if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
            System.out.println("The letter you provided is: " + letter + " which is vowel letter");
        } else {
            System.out.println("The letter you provided is: " + letter + " which is consonant letter");
        }

    }
}