 // Chapter 6
 // Writen by Edgar Colin EDG2140344
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // Chapter 6 game zone 2
 // Filename: RandomGuess3.java 


import java.util.Scanner;
import javax.swing.*;

public class RandomGuess3
{
   public static void main(String[] args)
   {
      
      int guess1;
      int cpu;
      int diff;
      int playAgain = 0;
      int win = 1;
      
      Scanner userInput = new Scanner(System.in);
      do{
         cpu = randomWithRange(1,1000);
         //System.out.print(cpu);
         int x = 1;
         do{
      
         System.out.print("Attemp #" + x  +"\n" );

         System.out.println("Enter an integer guess between 1 and 1000 > ");
      
         guess1 = userInput.nextInt();
      
         while( guess1 < 0 || guess1 > 1000 )
         {
            ++x;
            System.out.print("Attemp #" + x  +"\n" );
            System.out.print("Please try again. Enter a number between 1 and 1000!!\n");
            guess1 = userInput.nextInt();
         }  
               
         System.out.println("Player Guess :" + guess1);
         
         diff = guess1 - cpu;   
           
         if( diff == 0 )
         {
            win = 1;
            System.out.print("YOU GUESSED RIGHT!!!! YOU WIN!!!!");
            System.out.print("\nIt took only " + x + " attemps!\n");
            System.out.println("Would you like to play again? Press (1) for Yes,\n"+
               "Press any other number to Exit.");
         
            playAgain = userInput.nextInt();
            
            if(playAgain !=1)
            {
               System.out.print("Thank you for playing!");
               System.exit(0);
            }
                    
         }
         else if( diff > 0 )
         {
            win = 2;
            System.out.println("You are high " + "\n" );
         }
         else 
         {
            win = 3;
            diff = (-1)*diff;
            System.out.println("You are low " +  "\n" );   
         }
         ++x;
         }while(win != 1);
      }while(playAgain == 1);     
   }  
   public static int randomWithRange(int min, int max)
   {
      int range = (max - min) + 1;     
      return (int)(Math.random() * range) + min;
   }
}   