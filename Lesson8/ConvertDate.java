 // Writen by Edgar Colin
 // Sep 5th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 8 Problem 8 Modified
 // Filename: ConvertDate.java


import java.util.*;
import javax.swing.*;

public class ConvertDate
{
   public static void main(String[] args)
   {
      String inputDate;
      String stringMonth;
      String intermediate;
      String stringDay;
      String stringYear;
      
      int inputDateLength;
      int intermediateLength;
      int daysInCurrentMonth;
      
      int slash1;
      int slash2;
      
      String[] textMonth = {"January", "February", "March", "April"
         , "May", "June", "July", "August", "September", "October"
         , "November", "December"," "," ", " "};
       
       
      inputDate = JOptionPane.showInputDialog(null,
          "Please enter a date in the (month/day/year) format.\n" +
          "Note: the year must be 4 digits");
      
      inputDateLength = inputDate.length();
      
      slash1 = inputDate.indexOf("/");
      
      stringMonth = inputDate.substring(0,slash1);
      
      intermediate = inputDate.substring(slash1+1,inputDateLength);
      intermediateLength = intermediate.length();
      
      slash2 = intermediate.indexOf("/");
      
      stringDay = intermediate.substring(0,slash2);
      
      stringYear = intermediate.substring(slash2+1,intermediateLength); 
      
   
      int intDay = Integer.parseInt(stringDay);
     
      int intMonth = Integer.parseInt(stringMonth);
            
      int intYear = Integer.parseInt(stringYear);
            
      Calendar calendar = 
         new GregorianCalendar(intYear,(intMonth -1),intDay);
      
      GregorianCalendar endMonth = 
         new GregorianCalendar(intYear,intMonth,1);
         
      GregorianCalendar beginMonth = 
         new GregorianCalendar(intYear,intMonth-1,1); 
      
      // Calculates the current day in the year from date entered
      int calendarDay = calendar.get(Calendar.DAY_OF_YEAR);
      
      // Calculates the ordinal day when the current date month ends
      int daysToNextMonth = endMonth.get(Calendar.DAY_OF_YEAR);
      
      // Calculates the ordinal day when the current date month begins
      int firstDayMonth = beginMonth.get(Calendar.DAY_OF_YEAR);      
      
      /* Calculates the length of the month for the date entered.
        this value will be used to check whether the day field 
        entered does not violate the amount of days entered in the given 
        month, for example during a leap year in the month
         feb or in a month with 31 days like january*/
      
      if(intMonth != 12) // takes care of discrepancy of difference
      {                    // when the date entered is december.
         daysInCurrentMonth = daysToNextMonth - firstDayMonth;
      }
      else
      {
         daysInCurrentMonth = 31;
      }
      
      /* Displays to verify accuracy
        Try to enter 02/29/2013 and it will fail
        but 02/29/2012 will work because 2012 is a leap year.*/
        
      System.out.println(daysToNextMonth); 
      
      System.out.println(firstDayMonth);
      
      System.out.println(daysInCurrentMonth);
      
      
      
      // Every month field mm or m should greater than 0 or less than 12
      if(intMonth > 12 || intMonth < 0)
      {
         JOptionPane.showMessageDialog(null,
            "Enter a valid month, Restart and try again");
               
      }
      /* Every day field dd or d should greater than 0 or less than 
       the number of days in the given month entered. Should account
       for days with 31 days and days with 29 or 29 depending if leap 
       year or not */
      else if(intDay > daysInCurrentMonth || intDay < 0 )
      {
         JOptionPane.showMessageDialog(null,
            "Enter a valid day, Restart and try again");
      }
      else
      {  /* If acceptable values are entered, the correct day will be displayed.
          The correct ordinal number for the day of the year entered will be 
          displayed even for leave years.*/
         String stringTextDate = 
            "The date entered is "+ textMonth[intMonth-1] + " " + intDay +", " + intYear;
                                        
         JOptionPane.showMessageDialog(null,stringTextDate); 
         
         JOptionPane.showMessageDialog(null,"The day entered is day "+ calendarDay +" of the year.");          
      }
   
   }
  
}   