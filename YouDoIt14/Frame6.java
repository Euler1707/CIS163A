import javax.swing.*;
import java.awt.*;
public class Frame6
{
   public static void main(String[] args)
   {
   
     final int FRAME_WIDTH = 250;
     final int FRAME_HEIGHT = 100;
     
     JFrame aFrame = new JFrame("Sixth Frame");
     aFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
     aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     aFrame.setVisible(true);
     aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JLabel greeting = new JLabel("Hello");
     JLabel greeting2 = new JLabel("Who are you?");
     aFrame.setLayout(new FlowLayout());
     aFrame.add(greeting);
     aFrame.add(greeting2);
   }
}   