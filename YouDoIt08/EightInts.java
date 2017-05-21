public class EightInts
{
   public static void main(String[] args)
   {
   
      System.out.println("The following program displays 8 intergers,\n"
         + "first in increasing order and then in decreasing order:\n ");
      
      double[] eightInts = {1,3,5,6,7,8,23,56};
      System.out.println("Displays 8 integers in order: ");
      
      for( int x = 0 ; x <= 7; ++x)
      {
         System.out.println(eightInts[x]);
      } 
      
      System.out.println("\n");
      System.out.println("Displays 8 integers in reverse order: ");
      for( int y = 7 ; y >= 0; --y)
      {
         System.out.println(eightInts[y]);
      }   
   }
}   