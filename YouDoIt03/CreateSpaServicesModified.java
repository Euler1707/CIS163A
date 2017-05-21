import java.util.Scanner;

public class CreateSpaServicesModified // Modified Spa Service Library
{
   public static void main(String[] args)
   {
   //Within the main, declare variables to hold a service
   // description and price that a user can enter from the 
   // keyboard:
   // String service;
   // double price;

   // Using a constructor SpaService to make two objects   
   SpaService firstService = new SpaService();
   SpaService secondService = new SpaService();

   // Scanner Class Called do define keyboard input.
   Scanner keyboard = new Scanner(System.in);


   // In the next statements, you promt for a service, accept it
   // from the keyboard.
   
   // System.out.print("Enter service >> ");
   // service = keyboard.nextLine();
   // System.out.print("Enter price >> ");
   // price = keyboard.nextDouble();

   /* Recall that the setServicesDescription() in the SpaService class
   is nonstatic, meaning it is used with an object, and it requires
   a String argument. Write the statement that sends the service the
   user entered to the setServiceDescription() metho for the firstService
   */
   
   //firstService.setServiceDescription(service);
   //firstService.setPrice(price);
   
   
   // I believe this will use get data to set parameters
   // inside the firstService object. Once loaded
   // The firstService object will do its thing as 
   // before/
 
  //************************************************   
   // *** The following sends a copy of FirstService
   // Object to a method named getData();************
   
   firstService = getData(firstService);
 //************************************************    
  
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
  
  //************************************************
  // *** The following sends a copy of SecondService
   // Object to a method named getData();***********
  //************************************************ 
  
  secondService = getData(secondService);
  
    // I believe this will use get data to set parameters
   // inside the firstService object. Once loaded
   // The firstService object will do its thing as 
   // before/
   
   // Display details for the firstservice();
   System.out.println("First service details:");
      System.out.println(firstService.getServiceDescription() +
      " $" + firstService.getPrice());
   
   //    Display details for the secondservice();
   
   System.out.println("Second service details:");
      System.out.println(secondService.getServiceDescription() +
      " $" + secondService.getPrice());  
   }
   
   
   //The following header indicates that the method both 
   //accepts and returns a SpaService object.
   public static SpaService getData(SpaService s)
   {
      String service;
      double price;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter service>> ");
      service = keyboard.nextLine();
      System.out.print("Enter price>> ");
      price = keyboard.nextDouble();
      keyboard.nextLine();
      
      
    // Finish the method by assigning the entered service 
    // and price to the SpaService object parameter.
    // Then Return the full obkect to the main method,
    // where it is assigned to the obkect used in the 
    // method call.  
      
      s.setServiceDescription(service);
      s.setPrice(price);
      return s;
      
    // Typical use of object oriented programming. Short
    // reusable code.  
   }
      
   
}