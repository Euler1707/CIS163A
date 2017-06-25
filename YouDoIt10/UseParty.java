// Use party application a main() method. 
// Enter the beginning of the class, including the 
// Start of the main() method, which declares a 
// variable guest, a Party object, and a Scanner object
// to use for input

import java.util.*;
public class UseParty
{
   public static void main(String[] args)
   {
      int guests;
      Party aParty = new Party();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter number of guests for the party >> ");
      guests = keyboard.nextInt();
      aParty.setGuests(guests);
      System.out.println("The party has " + aParty.getGuests() + " guests");
      
      aParty.displayInvitation();
   }
}


      
     