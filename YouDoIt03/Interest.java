  // Writen by Edgar Colin
  // Aug 11 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // Assigment 3 :: Problem 10
  
  
import java.util.Scanner;

public class Interest
{
   public static void main(String args[])
   {
   
   // Program Intro
   System.out.print("**This program calculates the total" +
           " \namount of money you would receive if you invest" +
           " \na certain investment at 5% interest for one year**");
 
   // method calling statement  
   //moneyMade(Investment());
   
   
   // The problem states to return the value for display 
   // purposes.
   System.out.print("\n \nThe amount on hand made after \n" +
                     "adding 5% interest over one year is " +
                     ">> $" + moneyMade(Investment()));
 
   }
   public static double Investment()
   { // This method prompts for user input. 
      double Int;
      Scanner keyboard = new Scanner(System.in);
     
      System.out.print("\n");

      System.out.print("\nPlease enter the amount you" +
           " \nyou would like to put down in USD >> ");
      Int = keyboard.nextDouble();
      keyboard.nextLine();
       
      System.out.print("\nThe amount you are investing is:" +
                        ">> $" + Int);
      return Int;    
   }
   public static double moneyMade(double Inv)
   {  // This method uses previous method's input
      // and generates calculation for the total as 
      // requested
   double interest = .05;
   double totalMade;
   totalMade = Inv + interest*Inv;
   
   return totalMade; // Return must be included because
   //the header calls for a double type, not void.
   
   // **** The display message could have been include
   //***** In this section. The method type would have 
   // needed to be void.
   // Then the method could be simply called inside the main() as
   // moneyMade(); and the result would be executed. 
   }
        
} 