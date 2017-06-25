import javax.swing.*;
import java.awt.*;
public class JFrame4
{
   public static void main(String[] args)
   {
      
      final int FRAME_WIDTH = 250;
      final int FRAME_HEIGHT = 100;
      
      // Changing font using the Font Class , part of awt.*;
      
      
      Font headlineFont = new Font("Arial", Font.BOLD, 36);
      Font textyBodyFont = headlineFont.deriveFont(Font.PLAIN,14);
      JFrame aFrame = new JFrame("Fourth Frame");
      aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      aFrame.setVisible(true);
      aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel greeting = new JLabel("Good day it is a good day");
      greeting.setFont(headlineFont); // set the font to adjust it
      aFrame.add(greeting);
     // JLabel greeting2 = new JLabel("Bad day");
     // greeting2.setFont(textyBodyFont);
     // aFrame.add(greeting2);
      
      //aFrame.remove(greeting);
      //greeting.setText("Howdy");
   }
}      