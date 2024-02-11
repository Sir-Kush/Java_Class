import java.text.NumberFormat;

/****************************************************************
 * 
 * Compilation: javac QuadraticRoots.java
 * Execution: java QuadraticRoots 1 2 5
 * 
 * 
 * Write a program that takes three coefficients (a, b, c) of a
 * quadratic equation (ax^2 + bx + c = 0) as input and prints the
 * nature of its roots (real and distinct, real and equal, or imaginary).
 * 
 * 
 * % java QuadraticRoots 1 2 5
 * The roots are Imaginary
 * X1 = NaN
 * X2 = NaN
 * 
 * % java QuadraticRoots -1 -3 2
 * The roots are Real and Distinct
 * X1 = 1.0
 * X2 = 2.0
 * 
 * 
 * 
 */
public class QuadraticRoots {
   public static void main(String[] args) {
    // Condition 1: No input. Please provide 3 integer value input.
    if (args.length != 3) {
        System.out.println("Error: No input value. Please provide 3 integer value input to the command-line");
        return; // Exit program gracefully
    }


    // Condition 2: Invalid input. Please provide 3 integer value to the input
    int a, b, c;
    try {
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
    } catch (NumberFormatException e) {
        // TODO: handle exception
        System.out.println("Error: Invalid input. Kindly provide 3 integer value as an input");
        return; // Exit the program gracefully
    }

    // Condition 3: calculate the Discriminant 
    double discrminant = ((b*b) - (4*a*c));
    String roots;

    //  Determine the nature of the root if:
    // - the root is real and distinct: discriminant > 0
    // - the root is real and equal:    didcriminant = 0
    // - the root is imaginary:         discriminant < 0

    if (discrminant > 0) {
        roots = "Real and Distinct";
    } else if (discrminant == 0) {
        roots = "Real and Equal";
    } else if (discrminant < 0){
        roots = "Imaginary";
    } else {
        return;
    }

    // Calculate the roots of quadratic equation
    double root1 = (-b + Math.sqrt(discrminant))/ (2 * a);
    double root2 = (-b - Math.sqrt(discrminant))/ (2 * a);

    // Prints the nature of the root and  the value of the roots
    System.out.println("The roots are " + roots);
    System.out.println("X1 = " + root1);
    System.out.println("X2 = "+ root2);

   } 
}
