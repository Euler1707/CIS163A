import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDemoFlowLayout extends JFrame implements ActionListener
{
   private JButton lb = new JButton("L Button");
   private JButton rb = new JButton("R Button");
   private Container con = getContentPane();
   private FlowLayout layout = new FlowLayout();
   public JDemoFlowLayout()
   {
      con.setLayout(layout);
      con.add(lb);
      con.add(rb);
      lb.addActionListener(this);
      rb.addActionListener(this);
      setSize(500, 100);
      
   }   
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      if( source == lb)
         layout.setAlignment(FlowLayout.LEFT);
      else 
         layout.setAlignment(FlowLayout.RIGHT);
      con.invalidate();
      con.validate();
   }
   public static void main(String[] args)
   {
      JDemoFlowLayout frame = new JDemoFlowLayout();
      frame.setVisible(true);
   }
}              