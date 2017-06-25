import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JActionTest extends JFrame implements ActionListener
{
   //final int FRAME_WIDTH = 300;
   //final int FRAME_HEIGHT = 150
  //super("Demonstrating many components");
      
  JLabel label = new JLabel("Toggle Through Names");
  JTextField field = new JTextField(12);
  JButton button = new JButton("OK");
  private int numClicks = 0;
  public JActionTest()
  {   
     super("Trial");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new FlowLayout());
     add(label);
     add(field);
     add(button);
               
     button.setToolTipText("Click Button");
     button.addActionListener(this);
     
     field.addActionListener(this);
     
   }
   public void actionPerformed(ActionEvent e)
   {
      numClicks++;
      
      while (numClicks < 3)
      {
      
      
      String[] myStringArray = {"a","b","c"}; 
     
      label.setText("Je;;p");
      button.setText("Click button");
      }
      
   }
   public static void main(String[] args)
   {
      JActionTest aFrame = new JActionTest();
      final int WIDTH = 250;
      final int HEIGHT = 100;
      aFrame.setSize(WIDTH,HEIGHT);
      aFrame.setVisible(true);   
      
   }   

}         