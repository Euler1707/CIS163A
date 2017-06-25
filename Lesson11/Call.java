// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 11 
// Problem: 3 and 4
// Part: a)
// Filename: Call.java

import java.util.*;
public class Call
{
   public static void main(String[] args)
   {
      int aName; // index for phone directory
      int whichPhone; // index for phone choice
      
      // PROBLEM 3 PART 1 (PHONE ARRAY)***
      Phone[] cellPhone = new Phone[2];
      cellPhone[0] = new iPhone();
      cellPhone[1] = new Samsung();
      //Below demosntrates Call method from interface
      
      
      // ***** ONLY FOR TESTING Problem 3 ******
      //System.out.println("Showing Phone Array:");
      //for(int x = 0 ; x <= 2; ++x)
      //{
      //   cellPhone[x].Call();
      //}
            
      
      // PROBLEM 3 PART 2 (PERSON ARRAY)***
      // Populating the array with data into contructors

      Person aPerson[] = new Person[4];
      aPerson[0] = new Person("Joe", "555-1234");  
      aPerson[1] = new Person("Bob", "555-4444");
      aPerson[2] = new Person("Alice", "555-6565");
      aPerson[3] = new Person("Sally", "555-1111");   
    
      
      // ***** ONLY FOR TESTING Problem 3 ******
      //System.out.println("");
      //System.out.println("Demonstranting to String Override");
      //Demonstrating toString Override
      //for(int k = 0 ; k < 4; ++k){
      //   System.out.println(aPerson[k]);
      //}
      
      
      // Question 4 Implementation (USER INPUT)
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("You are able to make a call\n");
      System.out.println("Select the phone you want to use:\n"
         + "Enter (1) for iPhone or Enter (2) for Samsung.\n");
      whichPhone = keyboard.nextInt();
      whichPhone--;
      //System.out.println(whichPhone);
      
      System.out.println("Enter the name of the person to call:");
      System.out.println("Enter 1 for Joe\nEnter 2 for Bob\n" +
         "Enter 3 for Alice\nEnter 4 for Sally");
      aName = keyboard.nextInt();
      aName--;
      //System.out.println(aName);

      System.out.println("INITIATING DEVICE:");
      cellPhone[whichPhone].Call(aPerson[aName]);               
   }
}            