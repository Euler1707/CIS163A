import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
public class PathDemo3
{
   public static void main(String[] args)
   {
      Path filePath = 
         Paths.get("/Users/edgarcolin/Documents/java/CIS263AA/YouDoIt/YouDoIt13/Data.txt");
      System.out.println("Path is " + filePath.toString());
      try
      {
         filePath.getFileSystem().provider().checkAccess(filePath,READ,EXECUTE);
         System.out.println("File can be read and executed");
      }
      catch(IOException e)
      {
         System.out.println
            ("File cannot be used for this application");
      }
   }
}         