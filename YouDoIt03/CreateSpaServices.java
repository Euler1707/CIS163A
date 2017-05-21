import java.util.Scanner;

public class CreateSpaServices
{
   public static void main(String[] args)
   {
   //Within the main, declare variables to hold a service
   // description and price that a user can enter from the 
   //keyboard:
   String service;
   double price;

   SpaService firstService = new SpaService();
   SpaService secondService = new SpaService();
   Scanner keyboard = new Scanner(System.in);


   // In the next statements, you promt for a service, accept it
   // from the keyboard.
   System.out.print("Enter service >> ");
   service = keyboard.nextLine();
   System.out.print("Enter price >> ");
   price = keyboard.nextDouble();

   /* Recall that the setServicesDescription() in the SpaService class
   is nonstatic, meaning it is used with an object, and it requires
   a String argument. Write the statement that sends the service the
   user entered to the setServiceDescription() metho for the firstService
   */
   firstService.setServiceDescription(service);
   firstService.setPrice(price);
   
   // Same for the second....
  // *** Next seven lines commented out for illustration of 
  // *** Constructor Class results in "secondService" ***
  // keyboard.nextLine();
  // System.out.print("Enter service >> ");
  // service = keyboard.nextLine();
  // System.out.print("Enter price >> ");
  // price = keyboard.nextDouble();
   
  // secondService.setServiceDescription(service);
  // secondService.setPrice(price);
   
   // Display details for the firstservice();
   System.out.println("First service details:");
      System.out.println(firstService.getServiceDescription() +
      " $" + firstService.getPrice());
   
   //    Display details for the secondservice();
   
   System.out.println("Second service details:");
      System.out.println(secondService.getServiceDescription() +
      " $" + secondService.getPrice());
   
   
   }
}