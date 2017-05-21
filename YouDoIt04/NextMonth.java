/*
 // Writen by Edgar Colin
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 4 Problem 9(a)
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
   {
      final int DAYS_IN_YEAR = 365;
      
      GregorianCalendar now =
          new GregorianCalendar();
      
      int currentYear = now.get(Calendar.YEAR);
      int currentMonth = now.get(Calendar.MONTH);
      
      GregorianCalendar nextMonth = 
         new GregorianCalendar(currentYear,currentMonth+1,1);
         
      int day = now.get(Calendar.DAY_OF_YEAR);
      int nextMonthDay = nextMonth.get(Calendar.DAY_OF_YEAR);
      int diff = nextMonthDay - day;
      int daysLeftYear = DAYS_IN_YEAR - day;
      
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
