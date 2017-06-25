import javax.swing.*;
import java.awt.*;
public class JBorderLayout extends JFrame 
{
   private JButton nb = new JButton("North Button");
   private JButton sb = new JButton("South Button");
   private JButton eb = new JButton("East Button");
   private JButton wb = new JButton("West Button");
  
  // private JButton cb = new JButton("Center Button");
   //private Container con = getContentPane();

   public JBorderLayout() 
   {
      setLayout(new BorderLayout()); 
      add(nb, BorderLayout.NORTH); 
      add(sb, BorderLayout.SOUTH); 
      add(eb, BorderLayout.EAST); 
      add(wb, BorderLayout.WEST); 
     // add(cb, BorderLayout.CENTER); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      JBorderLayout jbl = new JBorderLayout();
      jbl.setSize(250,250);
      jbl.setVisible(true); 
   }
}
   