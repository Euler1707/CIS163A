import java.util.Scanner;

public class Hello
{
//-------------------------------------
//Constructor that greets the user! 
//-------------------------------------
   public Hello()
   {
      String name;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Hi! What's your name? ");
      name = keyboard.nextLine();
      
      System.out.println("Hello, " 
      + name + "! It's nice to meet you.");
   }
} 

  