/************************************************************************************
* Compilation: javac RightTriangle.java
* Execution: java RightTriangle 
*
*
* A program RightTriangle that takes three int command-line arguments and determines 
* whether they constitute the side lengths of some right triangle.
*
*
* % java RightTriangle 3 4 5
* true.
*
*
* % java RightTriangle 13 12 5
* true
*
* % java RightTriangle 1 2 3
* false
* 
* % java RightTriangle -3 4 -5
* false
*
*
**************************************************************************************/
public class RightTriangle {
    public static void main (String args []) {
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);

        boolean result = (c == Math.sqrt((a*a) + (b*b))                                                                                                           || b == Math.sqrt((c*c) + (a*a))                                                                                                           || a == Math.sqrt((c*c) + (b*b)));
        System.out.println(result);
    }
}