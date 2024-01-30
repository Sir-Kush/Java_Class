/******************************************************************************
 *  Compilation:  javac SumOfSines.java
 *  Execution:    java SumOfSines t
 *
 *  Read in an angle t (in degrees) and print sin(2t) + sin(3t).
 *
 *  % java SumOfSines 30
 *  1.8660254037844386
 *
 ******************************************************************************/
public class SumOfSines {
    public static void main (String [] args){
        double t = Double.parseDouble(args[0]);
        double radians = Math.toRadians(t);

        System.out.println(t);
        System.out.println(radians);
        System.out.println((Math.sin(2* radians)) + (Math.sin(3*radians)));
    }
}