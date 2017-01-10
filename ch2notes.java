/********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Ham Kalidindi
//8/22/16
//Ch 2 Notes
//Notes on ch 2


import java.util.Random; //lets us use the random class
import java.util.Scanner; //used for input from user

import java.util.*; //Let's me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;


public class ch2notes

{

public static void main (String[] args)
{
    /*
    //class id    memory    this is the constructor
    Scanner scan = new      Scanner (System.in);
    Scanner Keyboard = new Scanner(System.in);

    Flavor cone = Flavor.razzberry;


public static void main (String[] args)
{
int length;
int x = 9,y,z;
int id = 789;
double num = 5, num1 = 23.89765, num2 = 3.4;
char letter = 'd';
boolean choice = false;

//Class id   need memory constructor
Integer number = new Integer(47);

String word = new String("Homer Simpson");
String word2 = new String("Homer Simpson");
String word3 = new String("Bart");
String lname = "Hayes",fname = "kevin",mname;

double conversionFactor = x/5; //9/5 logic error -- promotion 5.0
final int BASE = 32;           //cast is (data type)
int celsiusTemp = 30;

double fahrenTemp = celsiusTemp * conversionFactor + BASE;

System.out.println(conversionFactor);
System.out.println("Celsius Temp: " + celsiusTemp );
System.out.println("Farenheit Equivalent" + fahrenTemp );
*/

/*
//AutoBoxing
Integer obj;
int y = 56;
obj = y;
int z = obj;
*/
//System.out.println( cone );


//---------------------------- P78 IMPORTANT ***********
/*
System.out.println(word.length());

boolean ans = word.equals(word2);
System.out.println(ans );
System.out.println(word == word2 );
System.out.println(word.compareTo(word3) );

System.out.println(word.indexOf("p") );
*/

/*
//declare an object
Random generator = new Random();

//int range 0-99
//adj the range by adding or subrtacting
x = generator.nextInt(100);
System.out.println("the random number is " + x);

//gen a number between 0-1
num = generator.nextDouble()*50;//now double between 0-99
//adj the range by adding or subtracting
System.out.println(num);


//System.out.println
*/

//P88 FOR MATH METHODS ***********
//Math is a static class, can't make an objext from static class
/*
Math silly = new Math();

System.out.println(Math.abs(-4));
System.out.println(Math.sqrt(12));
System.out.println(Math.pow(2,3));
System.out.println(Math.PI);
System.out.println(Math.random()*100);
*/

//P90 SCANNER METHODS *************************
/*
System.out.print("Enter a number ");
x = Keyboard.nextInt    ();
System.out.println(x );

System.out.print("Enter a word ");

//word = Keyboard.next  ();
Keyboard.nextLine();    //this clears the input buffer of the \n
word = Keyboard.nextLine    ();
word = Keyboard.next ();
System.out.println(word);
*/
/*

System.out.printf("Name: %-20s \t ID: %5d \n", name,id);
System.out.printf("Name: %-20s \t ID: %5d \n", "Si Li",1234);

System.out.println( 'a ' + 100);
System.out.printf('a'   );
*/

//Formatting Objects
NumberFormat money = NumberFormat.getCurrencyInstance();
NumberFormat percent = NumberFormat.getPercentInstance();
DecimalFormat fmt = new DecimalFormat ("0.####");
DecimalFormat fmt2 = new DecimalFormat ("0.00");

//Format objects return strings for output
System.out.println("Sub Total: " + money.format(num1) );
System.out.println("Sub Total: " + percent.format(num1) );

System.out.println("Sub Total: " + fmt.format(num1) );
System.out.println("Sub Total: " + fmt2.format(num2) );


//enum is a special type of class
	enum Flavor{chocolate, strawberry, mintChocolateChip, razberry}
	enum classperiods {one,two,three,four,five,six,seven,eight}


}//end of main

}//end of class

