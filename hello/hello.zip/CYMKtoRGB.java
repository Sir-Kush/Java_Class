/************************************************************************************
* Compilation: javac CMYKtoRGB.java
* Execution: java CMYKtoRGB 
*
*
* Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using
* these mathematical formulas:
* 
* white = 1−black
* red   = 255×white×(1−cyan)
* green = 255×white×(1−magenta)
* blue  = 255×white×(1−yellow)

*
*
* % java CMYKtoRGB 0.0 1.0 0.0 0.0    // magenta
* red   = 255
* green = 0
* blue  = 255
*
*
*
* % java CMYKtoRGB 0.0 0.4392156862745098 1.0 0.0    // Princeton orange
* red   = 255
* green = 143
* blue  = 0
*
**************************************************************************************/
public class CYMKtoRGB {
    public static void main (String args []) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        //converting CYMK to RGB
        double white = 1 - black;
        double red   = (255 * white * (1 - cyan));
        double green = (255 * white * (1 - magenta));
        double blue  = (255 * white * (1 - yellow));

        //Rounding up to the nearest integer
        //red = (int) Math.round();
        //green = (int) Math.round();
        //blue = (int) Math.round();

        //Printing out result
        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));
    }
}