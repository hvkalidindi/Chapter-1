
/**
 * Ham Kalidindi
 * 8/29/16
 * Program 2.14 
 * Random phone number - use Random and Math class - output should tell the user their phone number is....
 * then format number as it is in book
 * Read directions for rules on creating phone#
 */
import java.util.Random;

public class Program2_14
{
    public static void main(String [] args) {
        
        //Creates a random first set of numbers
        
        Random range1 = new Random();
        int numRange1 = range1.nextInt(778);
        
        //Creates a random second set of numbers
        Random range2 = new Random();
        int numRange2 = range2.nextInt(743); 
        
        //Creates a random third set of numbers
        Random range3 = new Random();
        int numRange3 = range3.nextInt(9999);
        
        //Displays the random phone number
        //System.out.print(numRange1);
        
        System.out.print(numRange1);
        System.out.print("-");
        System.out.print(numRange2);
        System.out.print("-");
        System.out.print(numRange3);
        System.out.println("");
        
        
        
        
        
        
    }
}
