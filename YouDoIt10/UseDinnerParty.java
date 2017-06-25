// Use party application a main() method. 
// Enter the beginning of the class, including the 
// Start of the main() method, which declares a 
// variable guest, a Party object, and a Scanner object
// to use for input

import java.util.*;
public class UseDinnerParty
{
   public static void main(String[] args)
   {
      
      int choice;
      int guests;
      
      Party aParty = new Party();
      DinnerParty aDinnerParty = new DinnerParty();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter number of guests for the party >> ");
      guests = keyboard.nextInt();
      aParty.setGuests(guests);
      System.out.println("The party has " + aParty.getGuests() + " guests");
      
      aParty.displayInvitation();
      
      System.out.print("Enter number of guest for the dinner party >> ");
      guests = keyboard.nextInt();
      aDinnerParty.setGuests(guests);
      
      System.out.print
         ("Enter the menu option -- 1 for chicken or 2 for beef >> ");
      choice = keyboard.nextInt();
      aDinnerParty.setDinnerChoice(choice);
      System.out.println("The dinner party has " + 
         aDinnerParty.getGuests() + " guests");
      System.out.println("Menu option " + 
         aDinnerParty.getDinnerChoice() + " will be served");
      
      aDinnerParty.displayInvitation();
            
      }
}


      
     