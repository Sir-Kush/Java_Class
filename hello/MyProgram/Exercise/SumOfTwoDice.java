/******************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *
 *  Generate 2 integers between 1 and 6, and print their sum.
 *
 *  %  java SumOfTwoDice
 *  5
 *
 *  %  java SumOfTwoDice
 *  9
 *
 *  %  java SumOfTwoDice
 *  3
 *
 *  %  java SumOfTwoDice
 *  11
 *
 *  %  java SumOfTwoDice
 *  8
 *
 *  %  java SumOfTwoDice
 *  7
 *
 * In this version:

* Dice Rolling Logic: Two dice are simulated by generating random integers between 0 (inclusive) and 6 (exclusive) using (int)
* (Math.random() * 6). This generates values from 0 to 5. The sum of these values is then printed.
******************************************************************************/
public class SumOfTwoDice {
    public static void main (String [] args)
    {
        int dice1 = (int) (Math.random() * 6);
        int dice2 = (int) (Math.random() * 6);

        System.out.println( dice1);
        System.out.println( dice2);
        System.out.println( dice1 + dice2);
    }
}