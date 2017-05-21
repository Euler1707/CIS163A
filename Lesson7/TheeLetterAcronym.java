import javax.swing.*;
class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      String threeWords;
      String Word1 = "";
      String Word2 = "";
      String Word3 = "";
      
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
      
      threeWords = JOptionPane.showInputDialog(null,
         "Please enter three words to formulate a 3 letter" +
         " acronym: ");
      
      
      NumSpaces = threeWords.length() - threeWords.replace(" ", "").length();
        
      System.out.println("The number of spaces is " + NumSpaces); 
      
      if (NumSpaces == 2)
      { 
         
         x = threeWords.length();
         System.out.println("String Length is: " + x );
         index1 = threeWords.indexOf(' ');
         Word1 = threeWords.substring(0,index1);
        
         Intermediate = threeWords.substring(index1 + 1, x);
        
         System.out.println(index1);
        
         y = Intermediate.length();
         System.out.println("String Length is: " + x );
         index2 = Intermediate.indexOf(' ');
         System.out.println(index1);
        
         Word2 = Intermediate.substring(0,index2);
         Word3 = Intermediate.substring(index2 + 1,y);
        
         one = Word1.charAt(0);
         two = Word2.charAt(0);
         three = Word3.charAt(0);
        
         one = Character.toUpperCase(one);
         two = Character.toUpperCase(two);
         three = Character.toUpperCase(three);
        
         StringBuilder sb = new StringBuilder();
        
         sb.append(one);
         sb.append(two);
         sb.append(three);
           
         acronym = sb.toString();
        
         //JOptionPane.showMessageDialog(null, Word1); 
         //JOptionPane.showMessageDialog(null, Intermediate);   
         //JOptionPane.showMessageDialog(null, Word2);   
         //JOptionPane.showMessageDialog(null, Word3); 
      
         //JOptionPane.showMessageDialog(null, one); 
         //JOptionPane.showMessageDialog(null, two); 
         //JOptionPane.showMessageDialog(null, three); 
      
         JOptionPane.showMessageDialog(null, "The original phrase was " + 
         threeWords +".\nThe three letter acronym is " + acronym +"."); 

      }
      else
      {
         JOptionPane.showMessageDialog(null,"Please enter only a phrase with Three words to create"
            + "\nyour acronym, use only Two spaces between the 3 words.\n"
            + "Currently the amount of spaces is "+ NumSpaces +" which makes " + (NumSpaces+1)
            + " word(s).");
      }        
   }
}      
      
   
   