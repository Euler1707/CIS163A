import java.util.Scanner;
public class GetUserInfo2
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
      
      System.out.print("Please enter your age >> ");
      // nextInt() stores in variable age.
      age = inputDevice.nextInt();
      
      inputDevice.nextLine();// consumes the Enter Key
      
      System.out.print("Please enter your name >> ");
      // nextLine() retrieves a line of text ad stores it in name.
      name = inputDevice.nextLine();
      
      System.out.println("Your name is " + name + 
         " and you are " + age + " years old.");
   }
}   
/* When you type characters using the keyboard they are stored
temp. in the memory space called keyboard buffer. It is called
a Type-Ahead buffer.

-The scanner methods next(),nextInt and nextDouble() retrieve
the next token in the next buffer, which might be a space, or 
or enter key.
-The nextLine method reads all data up to the Enter key character.
-Hence the program leaves enter in the buffer pressed and
 no time to enter text. 
 
 The solution is to put an extra inputDevice() in between to 
 to consume the Enter Key
 */ 
 
       