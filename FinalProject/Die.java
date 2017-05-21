// Chapter 4 
// Writen by Erik Colin EDG2140344
// Sept 1th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// Chapter 4 Game zone 1 & 2
// Filename: Die.java

// Class Declaration Public
import java.util.*;
import java.lang.*;
// This class generates a random number
public class Die
{

   int dieValue;
   int ErikInterger;
   
   ErikInterger =10;
   public int Die()
   {
   
      dieValue = ((int) (Math.random() * 100) % 6 + 1);

      return dieValue;
   }
   public void displayLine()
   {
     
      System.out.print("Roll : " + dieValue + "\n");              
   } 
}   
