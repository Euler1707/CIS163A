import javax.swing.*;
import java.awt.*;
public class JFrameWithComponents extends JFrame
{
   //final int FRAME_WIDTH = 300;
   //final int FRAME_HEIGHT = 150
  //super("Demonstrating many components");
      
  JLabel label = new JLabel("Enter your name");
  JTextField field = new JTextField(12);
  JButton button = new JButton("OK");
  public JFrameWithComponents()
  {   
     super("Frame with Components");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new FlowLayout());
     add(label);
     add(field);
     add(button);
     button.setToolTipText("Click Button");
     
   }

}         