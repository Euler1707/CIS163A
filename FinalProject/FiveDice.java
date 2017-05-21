// Chapter 4 
// Writen by Edgar Colin EDG2140344
// Sept 1th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// Chapter 2 Game zone 1 
// Filename: FiveDice.java

import java.util.*;
import java.lang.*;
public class FiveDice
{
   public static void main(String[] args)
   {
         
      Die[] Player1 = new Die[5];
      Die[] CPU = new Die[5];
      System.out.println("Player 1: # " + " rolls :");

      for(int x = 0; x < Player1.length; ++x)
      {
         Player1[x] = new Die();
         Player1[x].Die(); 
         Player1[x].displayLine();         
      }
      System.out.println("\n");
      System.out.println("CPU: # " + " rolls :");
      for(int x = 0; x < CPU.length; ++x)
      {
         CPU[x] = new Die();
         CPU[x].Die();         
         CPU[x].displayLine();
      }     
   
   }
   
}   