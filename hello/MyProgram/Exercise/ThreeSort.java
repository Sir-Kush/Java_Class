/******************************************************************************
 *  Compilation:  javac ThreeSort.java
 *  Execution:    java ThreeSort a b c
 *
 *  Read 3 integer values from the command line and print them
 *  in ascending order.
 *
 *  % java ThreeSort 17 50 33
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 50 33 17
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 17 50 17
 *  17
 *  17
 *  50
 *
 ******************************************************************************/
 public class ThreeSort {
    public static void main (String args []) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);

    int min = Math.min(n1, Math.min(n2, n3));
    int max = Math.max(n1, Math.max(n2, n3));
    int median = n1 + n2 + n3 - min - max;

    System.out.println("Minimum is: " + min);
    System.out.println("Median is: " + median);
    System.out.println("Maximum is: " + max);
    
    }
 }