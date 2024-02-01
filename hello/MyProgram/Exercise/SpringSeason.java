/****************************************************************************
 * Compilation: javac SprinSeason.java
 * Execution: Java SprinSeason
 *
 * Prints true if the given day and month fall between March 20 (inclusive)
 * and June 20 (inclusive).
 *
 *
 * java SprinSeason 3 20
 * true*
 *
 * java SprinSeason 6 20
 * true
 *
 * java SprinSeason 4 15
 * true*
 *
 * java SprinSeason 9 11
 * false
 *
 * java SprinSeason 2 20
 * false
 *
 ******************************************************************************/
 public class SpringSeason {
    public static void main (String [] args)
    {
        int month = Integer.parseInt(args [0]);
        int day = Integer.parseInt(args [1]);

        boolean isSpring = (month == 3 && day >= 20 && day <= 31)                                                                                                  || (month == 4 && day >= 1 && day <= 30)                                                                                                   || (month == 5 && day >= 1 && day <= 31)                                                                                                   || (month == 6 && day >= 1 && day <= 30);

        System.out.println("dd" + "/" + "mm" + "/" + "yyyy");
        System.out.println(day + "/" + month + "/" + "2024");
        System.out.println(isSpring);
        
    }
 }