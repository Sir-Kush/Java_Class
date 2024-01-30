/**************************************************************
* Compilation: javac sorting1.java
* Execution: java sorting1
* 
* Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
*
*
*
* Solution: (a == b)
*
*************************************************************/
public class sorting1 {
    public static void main (String [] args)
    {
        int a, b;
        a = 5;
        b = a;
        //boolean c = (a == b);
        boolean result = (!(a < b) && (!(a > b)) && (a == b));
        System.out.println(result);
        //System.out.println(c);
    }
}