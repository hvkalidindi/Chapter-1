
/**
 * Write a description of class Program2_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Ham Kalidindi
//8/23/16
//Program 2.7
//Enter in seconds and print out hours, minutes, and seconds - % is required

import java.util.Scanner;

public class Program2_7
{
    public static void main(String [] args) {
        
    Scanner user_input = new Scanner(System.in);
    
    int inputSeconds;
    
    //User input
    System.out.print("Enter seconds");
    inputSeconds = user_input.nextInt();
    
    //Calculates times
    int minutes = inputSeconds/60;
    int newseconds = inputSeconds % 60;
    
    int hours = minutes/60;
    int newminutes = minutes % 60;
    
    //Displays time
    System.out.print(hours);
    System.out.print(":");
    System.out.print(newminutes);
    System.out.print(":");
    System.out.print(newseconds);
    
    }    
}