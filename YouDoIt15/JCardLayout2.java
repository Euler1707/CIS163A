import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JCardLayout2 extends JFrame 
   implements ActionListener
{
   private JButton nb = new JButton("North Button");
   private JButton sb = new JButton("South Button");
   private JButton eb = new JButton("East Button");
   private JButton wb = new JButton("West Button");
   private JButton cb = new JButton("Center Button");
   //private Container con = getContentPane();
   CardLayout cardLayout = new CardLayout();
   
   public JCardLayout2() 
   {
      setLayout(cardLayout); 
      add("nort", nb); 
      add("south",sb); 
      add("east",eb); 
      add("west",wb); 
      add("center",cb); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      nb.addActionListener(this);
      sb.addActionListener(this);
      eb.addActionListener(this);
      wb.addActionListener(this);
      cb.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      cardLayout.next(getContentPane());
   }
   public static void main(String[] args)
   {
      JCardLayout2 jbl = new JCardLayout2();
      jbl.setSize(250,250);
      jbl.setVisible(true); 
   }
}
   