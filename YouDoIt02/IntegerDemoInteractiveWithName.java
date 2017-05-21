import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{
   public static void main(String[] args)
   {
   
   String name;
   
   int anInt; // One must keep the data types
   byte aByte; // They are not inhereted when the
   short aShort; // Input takes place
   long aLong;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Please enter an integer >> ");
   anInt = input.nextInt();
   
   System.out.print("Please enter a byte integer >> ");
   aByte = input.nextByte();
   
   System.out.print("Please enter a short integer >> ");
   aShort = input.nextShort();
   
   System.out.print("Please enter Long integer >> ");
   aLong = input.nextLong();   
   
   input.nextLine(); // Line added to consume the Enter
   // from the buffer storage!!! ** ** *** 
   
   System.out.print("Please enter your name >> ");
   name = input.nextLine();
   System.out.println("Thank you. " + name);
   
   System.out.println("The int is " + anInt);
   System.out.println("The byte is " + aByte);
   System.out.println("The short is a " + aShort);
   System.out.println("The long is " + aLong);
   
   }
}