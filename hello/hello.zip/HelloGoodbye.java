/************************************************************************************
* Compilation: javac HelloGoodbye.java
* Execution: java HelloGoodbye 
*
*
* A program HelloGoodbye.java that takes two names as command-line arguments 
* and prints hello and goodbye messages
*
* % java HelloGoodbye Kevin Bob
* Hello Kevin and Bob.
* Goodbye Bob and Kevin.
*
*
* % java HelloGoodbye Alejandra Bahati
* Hello Alejandra and Bahati.
* Goodbye Bahati and Alejandra.
**
**************************************************************************************/
public class HelloGoodbye {
    public static void main (String args []) {
        

        System.out.println("Hello " + args[0]+ " and " + args[1] +".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] +".");
    }
}


