import javax.swing.*;
// You do it 

public class JDemoFrame
{
   public static void main(String[] args)
   {  // Frame part of swing class
      JFrame aFrame = new JFrame("This is a frame");
      final int WIDTH = 250;
      final int HEIGHT = 250;
      aFrame.setSize(WIDTH, HEIGHT); //set default size
      aFrame.setVisible(true); // set frame to visible
   }
}      