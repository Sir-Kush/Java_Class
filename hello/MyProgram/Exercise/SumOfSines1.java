/******************************************************************************
 *  Compilation:  javac SumOfSines1.java
 *  Execution:    java SumOfSines1 t
 *
 *  Read in an angle t (in degrees) and print sin(2t) + sin(3t).
 *  From trigonometry:
 *  The sum to Product identity for sine is: 
 *
 *  sin(A) + sin(B) = 2sin((A+B)/2)cos((A-B)/2)
 *
 *  % java SumOfSines1 30
 *  1.8660254037844386
 *
 ******************************************************************************/
public class SumOfSines1 {
    public static void main (String [] args){
        double t = Double.parseDouble(args[0]);
        double radians = Math.toRadians(t);

        System.out.println(t);
        System.out.println(radians);
        System.out.println((2* Math.sin(5 * (radians)/2))*(Math.cos(-radians/2)));
    }
}