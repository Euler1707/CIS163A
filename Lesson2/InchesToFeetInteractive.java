import java.util.Scanner; // Imports the Scanner Library
public class InchesToFeetInteractive // Public Class declaration
{   
   public static void main(String[] args) // Main function
   {
   final int FeetToInch = 12; // 12 inches in
   int inches; // Number of inches 
   
   Scanner input = new Scanner(System.in); // System input link to Scanner

   System.out.print("Please enter the number of inches" +
      "\n to be converted to feet. >> ");
   
   inches = input.nextInt(); // store input into inches int

   System.out.println( "\n" + inches + "inches converted to feet = "); 
  
   System.out.println( inches/FeetToInch + " feet " 
      + inches%FeetToInch + " inches "); 
   }
} 

/* Integer division rounds toward 0. That is,
the quotient produced for operands n and d that 
are integers after binary numeric promotion (§5.6.2) 
is an integer value q whose magnitude is as large as 
possible while satisfying |d · q| ≤ |n|. Moreover, q is
positive when |n| ≥ |d| and n and d have the same sign, 
but q is negative when |n| ≥ |d| and n and d have 
opposite signs. */