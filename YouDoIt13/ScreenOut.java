import java.io.*;
public class ScreenOut
{
   public static void main(String[] args)
   {
      String s = "ABCD"; // declare string
      byte[] data = s.getBytes(); // byte array
      OutputStream output = null; 
      try
      {
         output = System.out; // defining output
         output.write(data); 
         output.flush();
         output.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
}            