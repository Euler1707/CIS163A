// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 13 
// Problem: 2
// Part: 
// Filename: FileStatistics2.java
 

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics2
{
   public static void main(String[] args)
   {
      
      String Filename1 = "Quote.txt";
      
      Path filePath1 =
         Paths.get(Filename1);
      
      String Filename2 = "Quote.doc";
      
      Path filePath2 =
         Paths.get(Filename2);
      
      
      try
      {
         
         double size1;
         double size2;
         
         double result;
         
         BasicFileAttributes attr1 = 
            Files.readAttributes(filePath1, BasicFileAttributes.class);
         System.out.println("File1 name: " + Filename1);
         System.out.println("File1 Size: " + attr1.size());
         System.out.println("Last modified time " +
            attr1.lastModifiedTime());
         
         System.out.println(" ");
         
         BasicFileAttributes attr2 = 
            Files.readAttributes(filePath2, BasicFileAttributes.class);
         System.out.println("File2 name: " + Filename2);
         System.out.println("File2 Size: " + attr2.size());
         System.out.println("Last modified time " +
            attr2.lastModifiedTime());  
            
         
         
         size1 = (double)attr1.size();
         size2 = (double)attr2.size();
         
         result = size1/size2;
         
            
         result = size1/size2;
         System.out.println("");
         System.out.println("File size ratio (File11 size)/(File2 size))=\n \n" +   
         + size1 + "/" + size2 + " = " + result); 
         System.out.println();  
            
              
      }
      catch(IOException e)
      {
         System.out.println("IO Exception");
      }              
   }
}         