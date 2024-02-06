/**********************************************************************
* Compilation: javac Grade.java
* Execution: Java Grade
*
*
* Write a program that takes a numerical grade input from the user and 
* prints the corresponding letter grade (A, B, C, D, or F) based on 
* the following criteria:
*
* A: 90-100
* B: 80-89
* C: 70-79
* D: 60-69
* F: Below 60
*
*
* %java Grade
*
*
* %java Grade
*
*
* %java grade
*
*
************************************************************************/
public class Grade {
    public static void main (String [] args){
        double score = Double.parseDouble(args [0]);

        //Conditions sets for each criteria;
        // * A: 90-100
        // * B: 80-89
        // * C: 70-79
        // * D: 60-69
        // * F: Below 60

        if (score == 100 && score >= 90) {
            System.out.println(score +"%" + " | " + "A");
        } else if (score <= 89 && score >= 80) {
            System.out.println(score +"%" + " | " + "B");
        } else if (score <= 79 && score >= 70) {
            System.out.println(score +"%" + " | " + "C");
        } else if (score <= 69 && score >= 60) {
            System.out.println(score +"%" + " | " + "D");
        } else if (score < 60 ){
            System.out.println(score +"%" + " | " + "F");
        } else {
            System.out.println("Not a Score, Please Retype the score...");
        }
        
    }
}