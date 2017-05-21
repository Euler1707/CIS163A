// Chapter 4 
// Writen by Edgar Colin EDG2140344
// Sept 1th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// Chapter 4 Game zone 1 
// Filename: TwoDice.java

import java.util.*;
import java.lang.*;
// This class instantiates 2 objects from the Die class
public class TwoDice
{
   public static void main(String[] args)
   {
      Die dieRoll = new Die();
      Die dieRoll2 = new Die();
      dieRoll.Die();
      dieRoll2.Die();
		
      System.out.print("Roll Dice 1:");
      dieRoll.displayLine();
      System.out.print("\n");
      System.out.print("Roll Dice 2:");
      dieRoll2.displayLine();
   }
}