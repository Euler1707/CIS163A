import java.util.*;
public class ThrowArrayException 
{
   public static void main(String[] args)
   {
      String [] array = {"Carol","Guillermo","Erik","Thomas","Mike","Brian","Amanda","Tony","Alex","Ana"};
      int userVal= 0;
      Scanner keyboard = new Scanner(System.in);
   
      
      try
      {
      
         System.out.print("Enter an index to return an element of " +
            "the array >> ");
         userVal = keyboard.nextInt();
         System.out.print("\nArray value : " + array[userVal-1] +"\n");
         System.out.println("");
       
      }
      catch(ArrayIndexOutOfBoundsException exception)
      {
         System.out.println("\nNumber too large, enter a number between 1 and 10!\n");
      }  
   }
}         