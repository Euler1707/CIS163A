 // Writen by Edgar Colin
  // Sept 1th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // HW 9 Problem 6 
  // Filename: Schedule.java 


import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
public class Schedule
{
   public static void main(String[] args)
   {
      String tempCourse = "";
      String course;
      String DayTime = "";
      
      String courses[][] = {{"CIS 110", " Monday ","13:00"},
                            {"CIS 210", " Tuesday ","14:00"},
                            {"CIS 310", " Thursday ","15:00"},
                            {"CIS 410", " Wednesday ","16:00"}};
      
      final int LIMIT = 2;
      
      boolean validItem = false;
      
      course = JOptionPane.showInputDialog(null,
         "Enter the course number to obtain schedule information\n(i.e CIS 110)");
         
      for(int x = 0 ; x < 3 ; ++x)
      {
         if(course.equals(courses[x][0]))
         {  
            validItem = true;
            DayTime = " " + courses[x][1] +" at " + courses[x][2]+"h";
            tempCourse = courses[x][0];   
         }             
      }
      if(validItem)
      {
         JOptionPane.showMessageDialog(null,"The schedule for the course "
             + tempCourse + " is: " + DayTime);
      }
      else
      {
         JOptionPane.showMessageDialog(null,"ERROR: TRY AGAIN, not match found");
      }
      
   }
}      
      
   