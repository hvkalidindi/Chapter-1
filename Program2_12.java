
/**
 * Ham Kalidindi
 * 8/26/16
 * Program 2_12 
 * Asks user for how many of each coin they want using number format class to produce output
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Program2_12
{
    public static void main(String [] args) {
         
        Scanner user_input = new Scanner(System.in);
         
         //Types of coins
         int quarters;
         int dimes;
         int nickels;
         int pennies;
         
         //Asks user how many of each type of coins he/she wants
          System.out.print("How many quarters would you like? ");
          quarters = user_input.nextInt();
          
          System.out.print("How many dimes would you like? ");
          dimes = user_input.nextInt();
          
          System.out.print("How many nickels would you like? ");
          nickels = user_input.nextInt();
          
          System.out.print("How many pennies would you like? ");
          pennies = user_input.nextInt();
    
          //Calculates individual change
          double quarterValue = quarters * 25;
          
          double dimeValue = dimes * 10;
          
          double nickelValue = nickels * 5;
          
          double pennyValue = pennies * 1;
          
         
          //Calculates total change 
          double totalChange = (quarterValue + dimeValue + nickelValue + pennyValue)/100;
          
          //NumberFormats value to look like currency
          NumberFormat money = NumberFormat.getCurrencyInstance();
          
          //Displays change
          System.out.println("Total: " + money.format(totalChange) );
          
          
         
    }
}
