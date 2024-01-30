/**************************************************************
* Compilation: javac sorting.java
* Execution: java sorting
*
* Suppose that a and b are int values. What does the following sequence of statements do?
*
* int t = a
* b = t
* a = b
*
* Solution: sets a, b, and t equal to the original value of a.
*
*************************************************************/
public class sorting {
	public static void main(String [] args)
	{
		int a, b, t;
		a = 5;
		t = a;
		b = t;
		System.out.println("Value of a, b, and t = :");
		System.out.println(b);
	}
}
