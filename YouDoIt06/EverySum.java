// This is the begining of loops

import java.util.Scanner;

public class EverySum
{
   public static void main(String[] args)
   {
      System.out.println("The Following Program Outputs the calculation for" +
      "the sum of the nth\nnumbers from n = 1 to n = 50. The left hand side" +
      "displayes the nth number \nand the right side displays the sum of all the natural" +
      "numbers preceding \nthat nth number (i.e nth SUM =  [n + (n-1) + (n-2) +... + 2 + 1]).");
      
       
      System.out.println("  ------------------");
      System.out.println("  Adding Nth Numbers");
      System.out.println("    _____________");

      System.out.println("   | Nth  |  SUM |");
      System.out.println("    _____________");
   
      int sum = 0;
      
      for( int x = 1; x <= 50 ; x ++)
      {
      
         sum = sum + x;
        
         System.out.println( "   *  " +  x + "   SUM =  " + sum + " *"  );
         
      } 
   }
}      