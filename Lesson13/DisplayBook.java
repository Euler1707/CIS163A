// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 13 
// Problem: 3
// Part: 
// Filename: FileStatistics1.java

import java.nio.file.*; import java.io.*;
import static java.nio.file.StandardOpenOption.*;

import java.util.Scanner;
public class DisplayBook 
{
   public static void main(String[] args) 
   {
      
      String bookFilename;
      String bookTitle;
      Scanner Filename = new Scanner(System.in);
      
      System.out.print("Enter the title of the book you want to read: >> ");

      bookTitle = Filename.nextLine();
      
      bookFilename = bookTitle + ".txt";   
      
      
      //Reading
      Path file =
         Paths.get(bookFilename);
      String s = "";
      //Extra for creating and writing to the file
          

      try  
      {  
         InputStream input = new
            BufferedInputStream(Files.newInputStream(file)); 
         BufferedReader reader = new
            BufferedReader(new InputStreamReader(input)); s = reader.readLine();
         while(s != null)
         {
            System.out.println(s);
            s = reader.readLine();
         }
         reader.close();
         
         
         
      }
      catch(Exception e) 
      {
        
        
        
        System.out.println("Message: The book title entered does not match"
          + " any records, a file "  + bookFilename + " has been created.\n" +
            "Location PATH: " + file); // Full path diplayed if not saved in program dir
        
        String title = bookTitle; 
        
        try
        {
            OutputStream output = new
               BufferedOutputStream(Files.newOutputStream(file, CREATE));
           
            BufferedWriter writer = new      
               BufferedWriter(new OutputStreamWriter(output));
               
            writer.write(title,0,title.length());
            writer.close();
                   
        }
        
        catch(Exception e2)
        {
            System.out.println("Message: " + e);
        }
        
              
      }
   }
}                