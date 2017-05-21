 // Writen by Edgar Colin
  // Sept 1th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // HW 9 Problem 8 
  // Filename: DemoRecording.java 


import java.util.Scanner;
public class DayofWeek
{
   enum Week {Monday, Tuesday, Wednesday, Thursday, Friday,
      Saturday, Sunday};
      
   public static void main(String[] args)
   {
      Week dayofWeek;
      String userEntry;
      
      Scanner input = new Scanner(System.in);
      System.out.print("The days of the week are :\n");
      for(Week week : Week.values())
      {
         System.out.print(week + " ");
      }
      
      System.out.println();
      System.out.println("Enter a day: ");
      dayofWeek = Week.valueOf(input.nextLine()); 
      
      switch(dayofWeek)
      {
         case Monday:
         case Tuesday:
         case Wednesday:
         case Thursday:
         case Friday:
         System.out.println("Business hours from 9 to 9");
            break;
         case Saturday:
         System.out.println("Business hours from 10 to 6");
            break;
         case Sunday:
         System.out.println("Business hours from 11 to 5");
      }
   } 
}