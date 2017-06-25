// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 13 
// Problem: 1
// Part: 
// Filename: FileStatistics1.java


import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics
{
   public static void main(String[] args)
   {
      
      String Filename = "Chapter13_Exercise1.txt";
      Path filePath =
         Paths.get(Filename);
      try
      {
         BasicFileAttributes attr = 
            Files.readAttributes(filePath, BasicFileAttributes.class);
         System.out.println("File name: " + Filename);
                  System.out.println("Size " + attr.size());
         System.out.println("Last modified time " +
            attr.lastModifiedTime());
         
      }
      catch(IOException e)
      {
         System.out.println("IO Exception");
      }         
   
   }
}         