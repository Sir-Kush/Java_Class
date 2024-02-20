public class GreatCircle {
    public static void main (String args []) {
        double r = 6371.0;

        //getting the value for command-line argument
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // breaking down the formular
        double differenceOfX = (x2 - x1)/2;
        double differenceOfY = (y2 - y1)/2;
        double isSinX = Math.sin(differenceOfX) * Math.sin(differenceOfX);
        double isSinY = Math.sin(differenceOfY) * Math.sin(differenceOfY);
        double isCosX = Math.cos(x1) * Math.cos(x2) * isSinY;
        double harveys = Math.sqrt(isSinX + isCosX);

        //The great-cirle distance d
        double d = 2 * r * Math.asin(harveys);

        //Print result.
            System.out.println(d + " Kilometers");
        
    }
}