// Creating static Methods that accept arguments
// and a Return a Value.
//

import java.util.Scanner;
public class ParadiseInfo2
{
   public static void main(String[] args)
   {
      double price; // Defining variable for the price
      double discount; // Defining variable for the discount
      double savings; // Savings
      
      // allows for user input, stores it in keyboard
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter cutoff price for discount>> ");
      price = keyboard.nextDouble(); // stores input into price
      
      System.out.print("Enter discount rate as a whole number>> ");
      discount = keyboard.nextDouble(); // stores input into discount
      
      
      displayInfo();
      //Execute the function
      savings = computeDiscountInfo(price, discount);
      
      // Display result and description of the program.
      System.out.println("Special this week on any service over" +
         price);
      System.out.println("Discount of " + discount + " percent");
      System.out.println("That's a savings of at least $" + savings);
      
   
      
   }
   // void method illustrates how there can be no imput
   public static void displayInfo()
   {
      System.out.println("Paradise Day Spa wants to pamper you.");
      System.out.println("We will make you look good.");
   }
   
   // the following method computes discount savings, two inputs
   public static double computeDiscountInfo(double pr, double dscnt)
   {
         double savings; // savings
         savings = pr * dscnt / 100; // calculates savings
         return savings; // returns savings ** new
   }
}


