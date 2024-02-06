/**********************************************************************
* Compilation: javac IsEven.java
* Execution: Java IsEven
*
*
* A program that takes two intgers command-line argument to check if it
* is even or odd.
*
*
* %java IsEven
*
*
* %java IsEven
*
*
* %java IsEven
*
*
************************************************************************/
public class IsEven {
    public static void main (String [] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("They are both Even number: " + a +" "+ b);
        } else if (a % 2 != 0 && b % 2 == 0) {
            System.out.println(" b is Even: " + b  + " Not a: " + a);
        } else if (a % 2 == 0 && b % 2 != 0) {
            System.out.println(" a is Even: " + a + " Not b: " + b);
        } else  {
            System.out.println("They are both Odd number: " + a + " " + b);
        }
    }
}