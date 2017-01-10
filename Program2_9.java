
/**
 * Ham Kalidindi
 * 8/25/16
 * Program 2_9
 * Circle find area and circumeference using math class and decimal format classs
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program2_9
{
    public static void main(String [] args) {
        
    Scanner user_input = new Scanner(System.in);
    
    //User inputs the radius of the circle
    int circleRadius;
    
    System.out.print("How big do you want the circle? (radius = ?) ");
    circleRadius = user_input.nextInt();
    
    //Calculates the circle area
    double circleArea = (Math.pow(circleRadius,2))*(Math.PI);
    
    //Calculates the circle circumeference
    double circumference = 2 * circleRadius * Math.PI;
    
    DecimalFormat fmt = new DecimalFormat("0.00");
    System.out.println("Area of your circle is: " + fmt.format(circleArea));
    System.out.println("Circumference of your circle is: " + fmt.format(circumference));
    
}
}