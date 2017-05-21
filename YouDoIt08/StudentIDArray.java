import java.util.*;
import javax.swing.*;

public class StudentIDArray
{
   public static void main(String[] args)
   {
      final int NumStudents = 10;
      int[] idValues = {1101, 1108, 1201, 1213, 1266,
         1304, 1311, 1409, 1411, 1412};
      String[] names = {"Edgar", "Luis", "Maria", "Carol", "Erik"
         ,"Tim", "Christian", "Natalia", "Guillermo", "Irma"};
      double[] gpa = { 3.44, 2.46, 3.57, 3.80, 2.79, 3.83, 4.0
         , 2.34, 3.76, 4.0};
         
      String inputID;
      int intID;
      boolean match = false;
      
      
      inputID = JOptionPane.showInputDialog(null,
         "Please enter the student's ID number >> ");
      intID = Integer.parseInt(inputID);
      
      System.out.println(intID);
      
      for(int i = 0; i < NumStudents; i++)
      {     
            if(intID == idValues[i])
            {
               JOptionPane.showMessageDialog(null,
                  "Student ID Number: " + idValues[i] + "\n" +
                   "First Name: " + names[i] + "\n" +
                   "GPA: " + gpa[i]); 
               match = true;
            }
                    
      }
      
      while(match == false)
      {
         JOptionPane.showMessageDialog(null,
                  "The ID number entered does not match,"
                   + "try again! \nEnter a valid 4 digit ID Number:  ");
      
      
         inputID = JOptionPane.showInputDialog(null,
         "Please enter the student's ID number >> ");
         intID = Integer.parseInt(inputID);
      
         System.out.println(intID);
      
         for(int i = 0; i < NumStudents; i++)
         {     
               if(intID == idValues[i])
               {
                  JOptionPane.showMessageDialog(null,
                     "Student ID Number: " + idValues[i] + "\n" +
                      "First Name: " + names[i] + "\n" +
                      "GPA: " + gpa[i]); 
                  match = true;
               }
                    
         }
      
      }       
   }
}   