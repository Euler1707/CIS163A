import javax.swing.*;
import java.awt.*;
public class JDemoManyPanels extends JFrame
{
   //Twelve buttons
   private JButton button01 = new Jbutton("One");
   private JButton button02 = new Jbutton("Two");
   private JButton button03 = new Jbutton("Three");
   private JButton button04 = new Jbutton("Four");
   private JButton button05 = new Jbutton("Five");
   private JButton button06 = new Jbutton("Six");
   private JButton button07 = new Jbutton("Seven");
   private JButton button08 = new Jbutton("Eight");
   private JButton button09 = new Jbutton("Nine");
   private JButton button10 = new Jbutton("Ten");
   private JButton button11 = new Jbutton("Eleven");
   private JButton button12 = new Jbutton("Twelve");
   
   private JPanel panel01 = new JPanel(new GridLayout(2,0));
   private JPanel panel02 = new JPanel(new FlowLayout());
   private JPanel panel03 = new JPanel(new FlowLayout());
   private JPanel panel04 = new JPanel(new GridLayout(2,0));
   
   public JDemoManyPanels()
   {
      setLayout(new BorderLayout());
      add(panel01, BorderLayout.WEST);
      add(panel02, BorderLayout.CENTER);
      add(panel03, BorderLayout.SOUTH);
      add(panel04, BorderLayout.EAST);
      
      panel01.add(button01);
      panel01.add(button02);
      panel01.add(button03);
      
      panel02.add(button04);
      panel02.add(button05);
      panel02.add(button06);
      
      panel03.add(button07);
      
      panel04.add(button08);
      panel04.add(button09);
      panel04.add(button10);
      panel04.add(button11);
      panel04.add(button12);
      
      setSize(400, 250);
   }
   public static void main(String[] args)
   {
      JDemoManyPanels frame = new JDemoManyPanels();
      frame.setVisible(true);
   }
}         