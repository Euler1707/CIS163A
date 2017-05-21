 // Writen by Edgar Colin
 // Aug 22th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 5 Problem 3(A) MODIFIED
 // Filename: CONDO SALES.java 



import java.util.Scanner;

public class Selection2
{
   public static void main(String[] args)
   {
   
   int selection;
   int condoPrice;
   int kitchenCover;
   double kitchenCoverCost = 4000;
   int garage;
   double garageCost = 5000;
   int expedite;
   double expediteCost;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("For option 1: Condo with park view enter 1 :  ");
   System.out.println("For option 2: Condo with golf course enter 2 :  ");
   System.out.println("For option 3: Condo with lake view enter 3 : \n ");
   
   System.out.println("Enter your option selection now >> ");
   selection = keyboard.nextInt();
     
      if(selection == 1) // Lake Course View 37-497
      {
         System.out.println("You selected option " + selection
         + ": Lake View Condo.");
         
         condoPrice = 210000;
         
         
         System.out.println("Would you like granite counter tops on your\n" +
         "condo kitchen for an additional cost of $4000.\nIf Yes press" +
   
         " 1, otherwise press 2 >> ");
         kitchenCover = keyboard.nextInt();

         
         if(kitchenCover == 1) // Lake View // Kitchen Cover
         {   
            kitchenCoverCost = 4000.00;
            
            System.out.println("Press 1 if you want a condo with garage,\npress"+
            " 2 for a condo with only parking space.\nNote :Garage costs $5000.00");
            garage = keyboard.nextInt();
            
            if(garage == 1) // Lake View // Kitchen Cover // Garage
            {   
               garageCost = 5000.00; 
               
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // Kitchen Cover // Garage // Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2) // Lake View // Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else  // Lake View // Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
                     
            }
            else if(garage == 2) // Lake View // Kitchen Cover // NO Garage             
            {  
               garageCost = 0;
               
               
              System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // Kitchen Cover // NO Garage // Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));           
               }
            }   
            else //Lake View// Kitchen Cover // NO Garage
               {
            
               garageCost = 0;
               
              
               System.out.println("and no garage : $" + garageCost);
                                 
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1)//Lake View// Kitchen Cover // NO Garage// Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with granite kitchen tops: $" + kitchenCoverCost);
                 System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));       
               }
            }   
            
                          
         }
         else if(kitchenCover == 2) //Lake view// No Kitchen Cover // 
         {   
            kitchenCoverCost = 0;
            
            System.out.println("Press 1 if you want a condo with garage,\npress"+
            " 2 for a condo with only parking space.\nNote :Garage costs $5000.00");
            garage = keyboard.nextInt();
            
            if(garage == 1) // Lake View // No Kitchen Cover // Garage
            {   
               garageCost = 5000.00; 
               
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // No Kitchen Cover // Garage // Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2) // Lake View //No Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else  // Lake View // No Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
                     
            }
            else if(garage == 2) // Lake View // No Kitchen Cover // NO Garage             
            {  
               garageCost = 0;
               
               
              System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // No Kitchen Cover // NO Garage // Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// No Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// No Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));           
               }
            }   
            else //Lake View// Kitchen Cover // NO Garage
               {
            
               garageCost = 0;
               
              
               System.out.println("and no garage : $" + garageCost);
                                 
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1)//Lake View// No Kitchen Cover // NO Garage// Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// No Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// No Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));       
               }
            }   
            
                          
         } //Still not kitchen Option                
         else
         {   
            kitchenCoverCost = 0;
            
            System.out.println("Press 1 if you want a condo with garage,\npress"+
            " 2 for a condo with only parking space.\nNote :Garage costs $5000.00");
            garage = keyboard.nextInt();
            
            if(garage == 1) // Lake View // Kitchen Cover // Garage
            {   
               garageCost = 5000.00; 
               
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // No Kitchen Cover // Garage // Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2) // Lake View // No Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else  // Lake View // No Kitchen Cover // Garage // NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
                     
            }
            else if(garage == 2) // Lake View // No Kitchen Cover // NO Garage             
            {  
               garageCost = 0;
               
               
              System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1) // Lake View // No Kitchen Cover // NO Garage // Expedite
               {
                  expediteCost = 2000.00;
//            
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// No Kitchen Cover // NO Garage //NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("and with No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));           
               }
            }   
            else //Lake View// No Kitchen Cover // NO Garage
               {
            
               garageCost = 0;
               
              
               System.out.println("and no garage : $" + garageCost);
                                 
               System.out.println("Press 1 if construction needs to be expedited.\n"+
               "Press 2 if it does.\nNote :Expedite costs $2000.00");
               expedite = keyboard.nextInt();
               
               if(expedite == 1)//Lake View// Kitchen Cover // NO Garage// Expedite
               {
                  expediteCost = 2000.00;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("Expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost)); 
               }
               else if(expedite ==2)//Lake View// Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                  System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("With No expedite request : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));
               }
               else //Lake View// No Kitchen Cover // NO Garage// NO Expedite
               {
                  expediteCost = 0;
                  
                  System.out.println("Lake view condo costs : $" + condoPrice);
                  System.out.println("with No granite kitchen tops: $" + kitchenCoverCost);
                 System.out.println("garage option not selected");
                  System.out.println("No garage : $" + garageCost);
                  System.out.println("No expedite option selected");
                  System.out.println("No expedite request charged : $" + expediteCost);
                  System.out.println("Grand total cost : $" + (condoPrice + kitchenCoverCost +
                     garageCost + expediteCost));       
               }
            }   
            
                          
         }   
      }
   }
}      