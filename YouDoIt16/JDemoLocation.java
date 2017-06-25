import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoLocation extends JFrame 
   implements ActionListener
{
   JButton pressButton = new JButton("Press");
   int x = 0, y = 0;
   final int GAP = 30;
   public JDemoLocation()
   {
      setTitle("Location Demo");
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(pressButton);
      pressButton.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      pressButton.setLocation(x,y);
      x += GAP;
      y += GAP;
   }
   public static void main(String[] args)
   {
      JDemoLocation frame = new JDemoLocation();
      frame.setSize(150, 150);
      frame.setVisible(true);
   }
}            
