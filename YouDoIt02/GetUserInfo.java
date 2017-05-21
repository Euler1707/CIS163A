import java.util.Scanner;
public class GetUserInfo
{
   public static void main(String[] args)
   {
      String name; // Defines a String
      int age; // Defines an Int type
      
      // Left Scanner declares object of Scanner Type
      // Programmer Chosen name of inputDevice
      // Right new Scanner(System.in) connects inputDevice to 
      // to Scanner.
      // new is required when creating complex data types
      // Scanner retrieves values from input devices.
      Scanner inputDevice = new Scanner(System.in); // 
      System.out.print("Please enter your name >> ");
      // nextLine() retrieves a line of text ad stores it in name.
      name = inputDevice.nextLine();
      System.out.print("Please enter your age >> ");
      // nextInt() stores in variable age.
      age = inputDevice.nextInt();
      System.out.println("Your name is " + name + 
         " and you are " + age + " years old.");
   }
}   
         