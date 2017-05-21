  // Writen by Edgar Colin
  // Aug 7th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // HW 2 Problem 9
  // Filename: DogBoarding.java 

/*
The Happy Yappy Kennel boards 
dogs at a cost of 50 cents per pound per day. 
Write a class that accepts a dog’s weight and
number of days to be boarded and displays
the total price for boarding.
Save the class as DogBoarding.java.
*/
//import java.text.DecimalFormat; //Import Class
//add df.format(Variable) on outputs
import javax.swing.JOptionPane;
import java.util.Scanner;

public class DogBoarding
{
   public static void main(String[] args)
   {
   final double CostPerLb = .50;
   String PoundsString;
   String numDaysString;
   double Pounds; 
   double numDays;
   //DecimalFormat df = new DecimalFormat("0.00");
   
   PoundsString = JOptionPane.showInputDialog(null,
      "Kennel boards at priced at $0.50 \nper pound per day it supports."
      +"\nHow many pounds does the kennel \nboard need to support?"   
      +" >> " , JOptionPane.INFORMATION_MESSAGE );
   
   Pounds = Double.parseDouble(PoundsString); 
   
   numDaysString = JOptionPane.showInputDialog(null,
      "How many days will it be in use? >>"  , JOptionPane.INFORMATION_MESSAGE );
   
   numDays = Double.parseDouble(numDaysString);
   
   JOptionPane.showMessageDialog(null,"The total cost of "
   +"the kettle that supports " + Pounds + " lb " + " for " + numDays + " days is >> " +
   numDays*Pounds*.50 + " dollars");
   


   
   }
}   