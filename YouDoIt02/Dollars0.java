import java.util.Scanner;
public class Dollars0
{
   public static void main(String[] args)
   {
   int Dollars;
   
   final int Twenty = 20;
   final int Ten  = 10;
   final int Five = 5;
   final int Ones = 1;
   
   Scanner input = new Scanner(System.in); //System input 
   //to Scanner
   
   System.out.print("Please enter the number of Dollars>> ");
   
   Dollars = input.nextInt();
   
   System.out.println("\nThe dollar amount split into" 
   + " into currency \ndenominations of $20s, $10s , $5s, $1s bills ");
   
   System.out.println("Split into least amount of bills =\n"
      + Dollars/20 + " $20s, " + (Dollars%20)/10 + " 10s, "
      + ((Dollars%20)%10)/5 + " 5s, " + (((Dollars%20)%10)%5)/1 + " 1s .");  
   }
}   