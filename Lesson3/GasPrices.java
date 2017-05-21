// Writen by Edgar Colin
// Aug 11th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887

// This is an update 

import java.text.DecimalFormat;
import java.util.Scanner; // Imports Scanner Utility

public class GasPrices // Class Gas Prices
{
   public static void main(String args[])
   {
      double pricePerBarrel; // Defines variable to be
      // Assigned Price per Barrel.
      
      Scanner keyboard = new Scanner(System.in);
      // Assigns Scanner to keyboard.
      
      
      // Message asking user to enter a dollar amount.
      System.out.print("Please enter the current price \nper " +
         "barrel of crude oil in U.S dollars >> ");
         
      // Input gets stored in previously defined pricePerBarrel.
     
      pricePerBarrel = keyboard.nextDouble();
      keyboard.nextLine();
      
      // Evaluating PriceAtPump Method below that
      // Calculates gas prices at the pump ranges
      // based on the pricePerBarrel of oil
      priceAtPump(pricePerBarrel);
               
   }
   public static void priceAtPump(double pricePerBarrel)
   {// Defining temporary BarrelPrice to store input variable. 
   
      double BarrelPrice;
      double gasPriceMin; //Defines gas at the pump min.
      double gasPriceMax; //Defines gas at the pump max.
      
      // Define new variable for clarity.
      BarrelPrice = pricePerBarrel;
      
      // These next data fields are used to scale
      // The price cost of gas at the pump per each
      // dollar that the barrel of oil cost, pricePerBarrel.
      // Basically $3.50/100 and $4.00/100.
      
      final double lowMultiple = .0350;
      final double highMultiple =.0400;
      
      
      //Gas price range is calculated by taking the 
      // above scaled gas costin $ per each dollar a 
      // barrel costs.The low and high multiples multiplied
      // by the current cost per a full barrel.
      
      gasPriceMin = lowMultiple*BarrelPrice;
      gasPriceMax = highMultiple*BarrelPrice;

      // The low and high cost of gas a the pump
      // are displayed with a message.
      DecimalFormat df = new DecimalFormat("#.##");
      System.out.print("\nThe price at the pump " +
         "is currently between \n>> $"+ df.format(gasPriceMin) + 
         " and $"+ df.format(gasPriceMax));
      // Figure out how to round to the nearest 1/1000th of a 
      // cent  
   }
}   
   
