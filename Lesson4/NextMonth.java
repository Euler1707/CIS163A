/*
 // Writen by Edgar Colin
 // Aug 19th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 4 Problem 9 + the extras assigned
 // Filename: YearEnd.java
 // Includes Modification required 
 
Write an application that uses methods in 
the GregorianCalendar class to calculate the 
number of days from today until the end of the 
current year. Save the file as nextMonth.java.

*/ 
import java.util.*;
import javax.swing.*;

public class NextMonth 
{
   public static void main(String[] args)
   {  //Defines days in a year
      final int DAYS_IN_YEAR = 365; 
      
      // Instantiation of now from the GregorianCalendar
      // Class
      GregorianCalendar now =
          new GregorianCalendar();
      
      // Getting values from Calendar Class
      // That correspond to today.
      int currentYear = now.get(Calendar.YEAR);
      int currentMonth = now.get(Calendar.MONTH);
      
      // Defining nextMonth Instantiation for calculating
      // The day of the year in which next month starts.
      GregorianCalendar nextMonth = 
         new GregorianCalendar(currentYear,currentMonth+1,1);
      
      // Store the day of the year into day   
      int day = now.get(Calendar.DAY_OF_YEAR);
      // Store the day of the year when next month starts
      // into nextMonthDay
      int nextMonthDay = nextMonth.get(Calendar.DAY_OF_YEAR);
      
      // Calculating the amount of days until the first day
      // of next month
      int diff = nextMonthDay - day;
      
      // Calculating the amount of days in the year.
      int daysLeftYear = DAYS_IN_YEAR - day;
      
      // Display for testing
      System.out.println("Day : " + day);
      System.out.println("nextMonthDay : " + nextMonthDay);      
      System.out.println("The year has 365 days");
      System.out.println(" ");
      System.out.println("Current day of the year is: " + day);
      System.out.println(" ");
      System.out.println("There are " + (DAYS_IN_YEAR - day) + 
         " left in the year.");
      System.out.println(" ");
      System.out.println("Next month starts in " + diff + " days");
      
      
      // User interactive interface for display
      JOptionPane.showMessageDialog(null, "Hello, this is the 'Days Left in "
         + "the Year and Days left in this Month application Program.'\n" +
         "\nPress ok in order to see the amount of days left this" + 
         " year and the amount of days until the start of next month. :) "); 
         
      JOptionPane.showMessageDialog(null, "Days left in this Year : " 
         + daysLeftYear + "\n" + "The next Month starts in : " + diff + " days.");
   
   // This program was done with the help of the instructor. Thank you for 
   // the help!          


      
                       
            
         
            
  
   }
}
