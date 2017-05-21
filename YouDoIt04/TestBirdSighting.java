// Writen by Edgar Colin
// Aug 14th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// HW 4 Problem 3(a) and 3(b)
// Filename: TestBirdSighting.java

import java.util.*;
public class TestBirdSighting
{
   public static void main(String[] args)
   {
      String birdSpecies;
      int numberSeen;
      int day;
      
      // Instantiates iterations of the birdSighting Class
      BirdSighting firstBird = new BirdSighting();
            
      // Default constructor intantiation for demostration 3(a)
      BirdSighting defaultBird = new BirdSighting();
      
      // Overloaded Constructor 3(b) 
      // (1) The number of parameters is 3
      // The 3rd parameter theDays initiated within the
      // overloaded constructor in file BirdSigting.java
      // (2) The Same types are used because no variable
            // Can be promoted to Int type, inputing a 
            // double failes. 
      BirdSighting overloadedBird = 
         new BirdSighting("Cardinal", 45 ,365);
    
      // Calling the Scanner Class for user input
      Scanner userInput = new Scanner(System.in);
      
         
      // User inputs for Testing part 3a  
      // Methods "set" and "get".
      
      System.out.print("*******User Inputs for Testing\nPart 3(a)" +
         " Methods 'set' and 'get****'\n \n");
      System.out.print("Please enter the name of the bird\n" +
         "species seen: ");
      birdSpecies = userInput.nextLine();  
      
      System.out.print("Please enter the number of\nbirds of " +
         "the given species seen: ");
      numberSeen = userInput.nextInt();
       
      System.out.print("Please enter the day of the year in\n" +
         "which the given species was seen: ");
      day = userInput.nextInt();
      
      // Statements which feed the user inputs into
      // the constructor for object creation
      
      firstBird.setBirdSpecies(birdSpecies);
      firstBird.setNumberSeen(numberSeen);
      firstBird.setDay(day);
      System.out.println("\n");
      
      // Display the settings for the user input
      // defined Constructor from part 3a
      System.out.println("User Input Settings 3(a)\n");
      firstBird.display();  
      System.out.println("\n");
      
      // Display the settings for the Default
      // Constructor from part 3b
      System.out.println("Default Constructor Settings 3(b) \n");
      defaultBird.display();
      System.out.println("\n");
      
      // Display the settings for the "OVERLOADED"
      // Constructor from part 3b
      System.out.println("Overloaded Constructor Settings\n");
      overloadedBird.display();
      System.out.println("\n");
      System.out.println("End of Program\n");
            
    
   }      
      
      
     
      
      
      
}