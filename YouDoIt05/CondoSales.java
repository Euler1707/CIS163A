 // Writen by Edgar Colin
 // Aug 22th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 5 Problem 3(A) MODIFIED
 // Filename: CONDOSALES.java 



import java.util.Scanner;

public class CondoSales
{
   public static void main(String[] args)
   {
   
   int selection;
   int condoPrice;
   int kitchenCover;
   int kitchenCoverCost = 4000;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("For option 1: Condo with park view enter 1 :  ");
   System.out.println("For option 2: Condo with golf course enter 2 :  ");
   System.out.println("For option 3: Condo with lake view enter 3 : \n ");
   
   System.out.println("Enter your option selection now >> ");
   selection = keyboard.nextInt();
     
      if(selection == 1)
      {
         System.out.println("You selected option " + selection
         + ": Park View Condo.");
         
         condoPrice = 140000;
         
         
         System.out.println("Would you like granite counter tops on your\n" +
         "condo kitchen for an additional cost of $4000.\nIf Yes press" +
         " 1, otherwise press 2 >> ");
         kitchenCover = keyboard.nextInt();

         
         if(kitchenCover == 1)
         {   
            System.out.println("Park view condo costs : $" + condoPrice);
            System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
            System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost));         
         }
         else if(kitchenCover == 2)
         {
            System.out.println("Park view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice);
         }               
         else
         {       
            System.out.println("Park view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice);  
         }   
      }
      else if(selection == 2)
      {
         System.out.println("You selected option " + selection
         + ": Golf Course View Condo.");
         
         condoPrice = 170000;
         
         System.out.println("Would you like granite counter tops on your\n" +
         "condo kitchen for an additional cost of $4000.\nIf Yes press" +
         " 1, otherwise press 2 >> ");
         kitchenCover = keyboard.nextInt();
      
         if(kitchenCover ==1)
         {   
            System.out.println("Golf course view condo costs : $" + condoPrice);
            System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
            System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost));
         }
         else if(kitchenCover ==2)
         {
            System.out.println("Golf view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice);

         }
         else
         {
            System.out.println("Golf view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice);
         }   
         
      }
      else if(selection == 3)
      {
         System.out.println("You selected option " + selection
         + ": Lake Course View Condo.");
         
         condoPrice = 210000;

         System.out.println("Would you like granite counter tops on your\n" +
         "condo kitchen for an additional cost of $4000.\nIf Yes press" +
         " 1, otherwise press 2 >> ");
         kitchenCover = keyboard.nextInt();

         if(kitchenCover == 1)
         {   
            System.out.println("Lake view condo costs : $" + condoPrice);
            System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
            System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost));
         }
         else if(kitchenCover ==2)
         {
            System.out.println("Lake view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice);
         }
         else
         {
            System.out.println("Lake view condo costs : $" + condoPrice);
            System.out.println("NO granite kitchen tops." );
            System.out.println("Grand total cost : $" + condoPrice); 
         }       
      }else{
      
         System.out.print("ERROR: You did not select a valid condo " +
             "Option. PLEASE RESTART PROGRAM");
      }
   }
   
 
}   
   