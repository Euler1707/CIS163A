    // Writen by Edgar Colin
    // Aug 7th 2016
    // Class: CIS163 Java I
    // Prof: Michael Parmeley
    // Section 14887
    // HW 2 Problem 10 Modified
    // Filename: DogBoarding.java 

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Dollars
{
   public static void main(String[] args) // Main Function
   {
   int Dollars; // Defining Dollar Amount
   String DollarString; // String to be use as
   // input dialo®g storage
   
   /* Defining denominations 
    to split the dollar amount
    into bills of 20,10,5, 
    and 1 dollar
   */
   
   final int Twenty = 20; 
   final int Ten  = 10;  
   final int Five = 5;
   final int Ones = 1;
   
   /* Message pane with message and input box,
      Input is stored as a string into 
      the DollarString variable*/
   DollarString = JOptionPane.showInputDialog(null,
       "Please enter the dollar amount to be split"
      + " into currency \ndenominations of "
      + "$20s, $10s , $5s, $1s bills ",
      "Salary dialog 1",
      JOptionPane.INFORMATION_MESSAGE); 
   
   /* Changed variable type DollarString input to an
     integer type variable Dollar for computation use*/
   Dollars = Integer.parseInt(DollarString); 

      JOptionPane.showMessageDialog(null,
      "\nThe dollar amount of $"+ Dollars + " split" 
      + " into currency with \ndenominations of "
      + "$20, $10, $5, and $1 bills,"
      + "\n in the least amount of bills is : \n"
      + "$"+Dollars + " = " + Dollars/20 + " $20s, "
      + (Dollars%20)/10 + " 10s, "+ ((Dollars%20)%10)/5 +
       " 5s, " + (((Dollars%20)%10)%5)/1 + " 1s ."); // message pane w/ output
              

      }
}   