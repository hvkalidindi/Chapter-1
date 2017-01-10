
/**
 * Write a description of class ch3notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.Scanner;
public class ch3notes
{
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    Scanner Keyboard = new Scanner(System.in);

       /* int num = 5, num1 = 10;
        
        System.out.print("Enter a number ");
        num = Keyboard.nextInt();
        
        System.out.print("Enter a second number ");
        num1 = Keyboard.nextInt();
        
        System.out.println ();
        
        if (num < num1)
           {System.out.println (num + "\t<\t" + num1);
            }
            
        else
            System.out.println (num1 + "\t<\t" + num);
            */
           
           
       /*
       int base = 200;
       
       Scanner keyboard = new Scanner (Sytem.in);
       System.out.print("Enter price of car");
       double price = keyboard.nextDouble();
       double charge = 0;
       
       if (price > 40000)
            charge = base + 200 + 800 + (.06 * (price - 40000));
       else if (price > 20000)
            charge = base + 200 + (.04 * (price - 20000));
       else if (price > 10000)
            charge = base +(.02 * (price - 10000));
       else
            charge = base;
            
       System.out.printf("The sticker will cost you $" + charge );
           
        */
       
    double total = .01*1 + .05*2 + .10 * 3 + .25 * 4;
    
    if (total == 1.41)
        System.out.println("Wow it works?" );
    else
        System.out.println("Hahaha tell what is going on, FIX IT!" );
        
        
    }
}
