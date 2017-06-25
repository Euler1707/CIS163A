import java.util.Scanner;
public class UninitializedVariableTest
{
   public static void main(String[] args)
   {
      int x = 0;
      Scanner input = new Scanner(System.in);
      try
      {
         System.out.print("Enter an interger >> ");
         x = input.nextInt();
      }
      catch(Exception e)
      {
         System.out.println("Exception occurred");
      }
      System.out.println("x is a " + x);
   }
}            