// Writen by Edgar Colin
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 5 Problem 5 MODIFIED
 // Filename: Coffee.java 



import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Coffee
{
   public static void main(String[] args)
   {  
                 
      String coffeeSelection;
      
      int choice;
      double choiceCost = 0;
      double choice1Cost = 0;
      double choice2Cost =0;
      double choice3Cost =0;
      
      JOptionPane.showMessageDialog(null,
         "WELCOME TO JIVIN' JAVA COFFEE!\n" 
        +"----------------------------\n"
        +"(1) American     $1.99      \n"
        +"(2) Espresson    $2.50      \n"
        +"(3) Latte        $2.15      \n"
        +"-----------------------------\n"
        +"*******Coffee Options*******\n");
      
      coffeeSelection = JOptionPane.showInputDialog(null,
         "WELCOME TO JIVIN' JAVA COFFEE!\n" 
        +"----------------------------\n"
        +"(1) American     $1.99      \n"
        +"(2) Espresson    $2.50      \n"
        +"(3) Latte        $2.15      \n"
        +"-----------------------------\n"
        +"*********Coffee Options*********\n"
        +""
        +"Enter your Choice of Coffee 1,2 or 3  in the Space Below :\n"
        +"Entering 0 will quit the application");
      
      choice = Integer.parseInt(coffeeSelection);  
      
      switch(choice)
      {
         case 1:
            
            JOptionPane.showMessageDialog(null,
            "You Have Selected a Decicious!\n" 
            +"(1) American     $1.99      \n" );
         
            choiceCost = 1.99;
            System.out.println(choiceCost);
            break;
         case 2:
      
            JOptionPane.showMessageDialog(null,
            "You Have Selected a Decicious!\n" 
            +"(2) Espresso    $2.50      \n" );
         
            choiceCost = 2.50;
            System.out.println(choiceCost);
            break;
         case 3:
      
         JOptionPane.showMessageDialog(null,
         "You Have Selected a Decicious!\n" 
         +"(3) Espresso    $2.15      \n" );
         
         choiceCost = 2.15;
         System.out.println(choiceCost);
      
         case 0:
      
         
            JOptionPane.showMessageDialog(null,
            "You Have Selected to Quit the Program!\n"
            +"Your bill is $" + choiceCost);
            System.out.println(choiceCost);
            
            JOptionPane.showMessageDialog(null,
               "Your selections have been completed\n"
               +"Your total bill is $" + choiceCost);
            System.exit(0);
            
            break;       
         
         }
            
            
            choice1Cost = choiceCost;
         
            coffeeSelection = JOptionPane.showInputDialog(null,
            "WELCOME TO JIVIN' JAVA COFFEE!\n" 
            +"----------------------------\n"
            +"(1) American     $1.99      \n"
            +"(2) Espresson    $2.50      \n"
            +"(3) Latte        $2.15      \n"
            +"-----------------------------\n"
            +"*********Coffee Options*********\n"
            +""
            +"Enter your Choice of Coffee 1,2 or 3  in the Space Below :\n"
            +"Entering 0 will quit the application");
      
             choice = Integer.parseInt(coffeeSelection);             
         switch(choice)
         {  
            case 1:
              
               JOptionPane.showMessageDialog(null,
               "You Have Selected a Decicious!\n" 
               +"(1) American     $1.99      \n" );
         
               choiceCost = 1.99;
               choice2Cost = choiceCost + choice1Cost; 
               System.out.println(choice2Cost);
               break;
            
            case 2:
            
               JOptionPane.showMessageDialog(null,
               "You Have Selected a Decicious!\n" 
               +"(2) Espresso    $2.50      \n" );
         
               choiceCost = 2.50;
               choice2Cost = choiceCost + choice1Cost ;
               System.out.println(choice2Cost);
               break;
            
            case 3:
            
               JOptionPane.showMessageDialog(null,
               "You Have Selected a Decicious!\n" 
               +"(3) Espresso    $2.15      \n" );
         
               choiceCost = 2.15;
               choice2Cost = choiceCost + choice1Cost ;
               System.out.println(choice2Cost);
               break;
               
            case 0:
            
               choiceCost = 0;
               JOptionPane.showMessageDialog(null,
               "You Have Selected to Quit the Program!\n"
               +"Your bill is $" + choice1Cost);
               System.out.println(choice1Cost);
               
               JOptionPane.showMessageDialog(null,
               "Your selections have been completed\n"
               +"Your total bill is $" + choice1Cost);
               System.exit(0); 
               break;
                  
            }
               choice3Cost = choice2Cost;
         
               coffeeSelection = JOptionPane.showInputDialog(null,
               "WELCOME TO JIVIN' JAVA COFFEE!\n" 
               +"----------------------------\n"
               +"(1) American     $1.99      \n"
               +"(2) Espresson    $2.50      \n"
               +"(3) Latte        $2.15      \n"
               +"-----------------------------\n"
               +"*********Coffee Options*********\n"
               +""
               +"Enter your Choice of Coffee 1,2 or 3  in the Space Below :\n"
               +"Entering 0 will quit the application");
      
               choice = Integer.parseInt(coffeeSelection);             
               
               switch(choice)
               {
                  case 1:
                  
                     JOptionPane.showMessageDialog(null,
                     "You Have Selected a Decicious!\n" 
                     +"(1) American     $1.99      \n" );
         
                     choiceCost = 1.99;
                     choice3Cost = choiceCost + choice3Cost;
                     System.out.println(choice3Cost);
                     break;
                  case 2:
            
                     JOptionPane.showMessageDialog(null,
                     "You Have Selected a Decicious!\n" 
                     +"(2) Espresso    $2.50      \n" );
         
                     choiceCost = 2.50;
                     choice3Cost = choiceCost + choice3Cost;
                     System.out.println(choice3Cost);
                     break;
                  case 3:
                  
                     JOptionPane.showMessageDialog(null,
                     "You Have Selected a Decicious!\n" 
                     +"(3) Espresso    $2.15      \n" );
         
                     choiceCost = 2.15;
                     choice3Cost = choiceCost + choice3Cost;
                     System.out.println(choice3Cost);
                     break;
                     
                  case 0:
               
                     choiceCost = 0;
                     JOptionPane.showMessageDialog(null,
                     "You Have Selected to Quit the Program!\n"
                     +"Your bill is $" + choice3Cost);
                  
                  break;
                  }
                  JOptionPane.showMessageDialog(null,
                  "Your selections have been completed\n"
                  +"Your total bill is $" + choice3Cost);
               }
               
                       
         }
            
   
