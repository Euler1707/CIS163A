import javax.swing.*;
class Name
{
   public static void main(String[] args)
   {
      String fullName;
      String firstName = "";
      String middleName = "";
      String lastName = "";
      
      String acronym;
      
      char one;
      char two;
      char three;
      
      String Intermediate;
      
      int index1;
      int index2;
      
      int x;
      int y;
      
      int NumSpaces;
      
      fullName = JOptionPane.showInputDialog(null,
         "Please enter your full name : ");
      
      NumSpaces = fullName.length() - fullName.replace(" ", "").length();
        
      System.out.println("The number of spaces is " + NumSpaces); 
      
      
      if (NumSpaces == 2 || NumSpaces == 1)
      { 
         
         x = fullName.length();
         System.out.println("String Length is: " + x );
         index1 = fullName.indexOf(' ');
         firstName = fullName.substring(0,index1);
        
         Intermediate = fullName.substring(index1 + 1, x);
        
         System.out.println(index1);
        
         y = Intermediate.length();
         System.out.println("String Length is: " + x );
         index2 = Intermediate.indexOf(' ');
         System.out.println(index1);
        
         middleName = Intermediate.substring(0,index2);
         lastName = Intermediate.substring(index2 + 1,y);
        
         one = firstName.charAt(0);
         two = middleName.charAt(0);
         three = lastName.charAt(0);
        
         one = Character.toUpperCase(one);
         two = Character.toUpperCase(two);
         three = Character.toUpperCase(three);
        
         StringBuilder sb = new StringBuilder();
        
         sb.append(one);
         sb.append(two);
         sb.append(three);
           
         acronym = sb.toString(); 
      
         JOptionPane.showMessageDialog(null, "The original phrase was " + 
         fullName +".\nThe three letter acronym is " + acronym +"."); 

      }
      else
      {
         JOptionPane.showMessageDialog(null,
             "Please enter a 3 letter Acronym with two spaces in between");
      }
        
   }
}      
      
   
   