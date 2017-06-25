import javax.swing.*;
import java.awt.*;
public class JCardLayout extends JFrame 
{
   private JButton nb = new JButton("North Button");
   private JButton sb = new JButton("South Button");
   private JButton eb = new JButton("East Button");
   private JButton wb = new JButton("West Button");
  
   private JButton cb = new JButton("Center Button");
   //private Container con = getContentPane();

   public JCardLayout() 
   {
      setLayout(new CardLayout()); 
      add("nort", nb); 
      add("south",sb); 
      add("east",eb); 
      add("west",wb); 
      add("center",cb); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      JCardLayout jbl = new JCardLayout();
      jbl.setSize(250,250);
      jbl.setVisible(true); 
   }
}
   