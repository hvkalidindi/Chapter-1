
/**
 * Ham Kalidindi
 * 8/31/16
 * Name Program 
 * The user enters a full name and it prints out the first name, middle initial, and the last name on
 * a new line
 */

import java.util.Scanner;

import java.util.*;

public class Name
{
    public static void main (String[] args) {

    //User Inputs a name
    Scanner scan = new Scanner(System.in);
    Scanner Keyboard = new Scanner(System.in);

    String name = new String(" ");

    System.out.print("Enter a name ");
    name = Keyboard.nextLine();

    
    
   //Locates the first space
   int space = name.indexOf(" ") + 1;
   
   String space1 = name.substring(0,space);

   //middle and last name
   String name_2 = name.substring(space);

   //space between middle and last name
   int middle = name_2.indexOf(" ") + 1;


   //middle inital
   String middleinitial = name_2.substring(0,1);

   //just last name
   String lastname = name_2.substring(middle);


	System.out.println(" ");

   System.out.println(space1 + middleinitial + ".");

   System.out.println(lastname);
   System.out.println(" ");


 }
}
