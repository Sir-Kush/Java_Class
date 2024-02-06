/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *
 *  Simulate a fair coin flip and print out "Heads" or "Tails" accordingly.
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Tails
 *
 *
 ******************************************************************************/
public class Flip {
	public static void main (String [] args) 
	{
		// Math.radom() returns the value from 0.0 to 1.0
		// It is Head or Tail which is 50% chances
		if (Math.random() > 0.5)	System.out.println("HEAD");
		else	System.out.println("Tail");	
	}
}
