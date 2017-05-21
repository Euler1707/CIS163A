import javax.swing.*;
public class ConstructID
{
   public static void main(String[] args)
   {
      String ID = "";
      String nameInitials = "";
      String fullName;
      String fullAddress;
      String houseNumber;
      
      int addressLength;
      int index;
      
      char aChar;
      char Init;
      
      
      
      fullName = JOptionPane.showInputDialog(null,
         "Please enter your full name : ");
         
      fullAddress = JOptionPane.showInputDialog(null,
         "Please enter your full Address : ");
         
      Init = fullName.charAt(0);
      // System.out.println(Init); 
      
      nameInitials += Init;
      
      for(int i = 0 ; i < fullName.length(); i++)
      {
         aChar = fullName.charAt(i);
         
         if(aChar == ' ')
         {
            System.out.println(nameInitials);

            nameInitials += fullName.charAt(i+1);
         }
      }
      
      addressLength = fullAddress.length();
      
      index = fullAddress.indexOf(' ');
      
      System.out.println(index);
      
      houseNumber = fullAddress.substring(0,index);
      
      System.out.println(houseNumber);
      
      StringBuilder IDpart = new StringBuilder();
      
      IDpart.append(nameInitials);
      IDpart.append(houseNumber);
      
      ID = IDpart.toString();
      
      JOptionPane.showMessageDialog(null,
          "Your Assigned ID Number is: "+ ID);          
      
   }

}   
