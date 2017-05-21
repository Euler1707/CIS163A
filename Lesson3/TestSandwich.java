 // Writen by Edgar Colin
 // Aug 11th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // Homework 3. Problem 11a & b with modifications

import java.util.Scanner;
public class TestSandwich
{
   public static void main(String args[])
   {
      String mainIngredient;
      String breadType;
      double price;
      
      // Instantiates iterations of the sandwich
      // class.
      Sandwich firstSandwich = new Sandwich();
      Sandwich secondarySandwich = new Sandwich();
      
      // For user input
      Scanner keyboard = new Scanner(System.in);
      
      // User inputs
      System.out.print("Enter sandwich main ingredient (i.e turkey, ham) : ");
      mainIngredient = keyboard.nextLine();
 
      System.out.print("Enter the sandwich bread type : (i.e white, rye) ");
      breadType = keyboard.nextLine();
      
      System.out.print("Enter the price of the sandwich : $");
      price = keyboard.nextDouble();
      
      // Statements which feed user inputs into
      // the constructor for object creation
      
      firstSandwich.setMainIngredient(mainIngredient);
      firstSandwich.setBreadType(breadType);
      firstSandwich.setPrice(price);
      
      // Output that shows succesful creation of class.
      System.out.print("You have entered a " + firstSandwich.getMainIngredient() +
                   " sandwich with " + firstSandwich.getBreadType()+  " bread. " +
                    "\nIt costs a total of : $"+ firstSandwich.getPrice());
      
      // The following output demonstrates 11b.
      // Shows successful custom constructor 
      // settings 
      System.out.print("\n");
      System.out.print("\n");              
      System.out.print("The default option is a " + secondarySandwich.getMainIngredient() +
                   " sandwich with " + secondarySandwich.getBreadType()+  " bread. " +
                    "\nIt costs a total of : $"+ secondarySandwich.getPrice());
      
   }
}