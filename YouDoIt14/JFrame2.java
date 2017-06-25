import javax.swing.*;
public class JFrame2
{
   public static void main(String[] args)
   {
      /* This is supposed to be a customer icon that changes
       the look and feel of the window. Does not work on MAC*/
      JFrame.setDefaultLookAndFeelDecorated(true);
      JFrame aFrame = new JFrame("Second frame");
      aFrame.setSize(250, 100);
      aFrame.setVisible(true);
   }
}

      
