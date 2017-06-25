import javax.swing.*;
import java.awt.*;
public class JBorderLayoutRight extends JFrame 
{
   private JButton nb = new JButton("North Button");
   private JButton sb = new JButton("South Button");
   private JButton eb = new JButton("East Button");
   private JButton wb = new JButton("West Button");
  
   private JButton cb = new JButton("Center Button");
   private Container con = getContentPane();

   public JBorderLayoutRight() 
   {
      setLayout(new FlowLayout(FlowLayout.RIGHT)); 
      add(nb); 
      add(sb); 
      add(eb); 
      add(wb); 
      add(cb); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      JBorderLayoutRight jbl = new JBorderLayoutRight();
      jbl.setSize(250,250);
      jbl.setVisible(true); 
   }
}
   