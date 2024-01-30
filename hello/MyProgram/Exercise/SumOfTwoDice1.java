/******************************************************************************
 *  Compilation:  javac SumOfTwoDice1.java
 *  Execution:    java SumOfTwoDice1
 *
 *  Generate 2 integers between 1 and 6, and print their sum.
 *
 *  %  java SumOfTwoDice1
 *  5
 *
 *  %  java SumOfTwoDice1
 *  9
 *
 *  %  java SumOfTwoDice1
 *  3
 *
 *  %  java SumOfTwoDice1
 *  11
 *
 *  %  java SumOfTwoDice1
 *  8
 *
 *  %  java SumOfTwoDice1
 *  7
 *
 * In this version:
 * Dice Rolling Logic: Two dice are simulated by generating random integers between 0 (inclusive) and 6 (exclusive) using (int)
 * (Math.random() * 6). This generates values from 0 to 5. The sum of these values is then printed.
******************************************************************************/
public class SumOfTwoDice1 {
    public static void main (String [] args)
    {
        int SIDES = 6;
        int dice1 = 1 + (int) (Math.random() * SIDES);
        int dice2 = 1 + (int) (Math.random() * SIDES);

        System.out.println( dice1);
        System.out.println( dice2);
        System.out.println( dice1 + dice2);
    }
}