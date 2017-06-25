import javax.swing.*;
import java.awt.*;
public class JDemoFont extends JFrame
{

   Font bigFont = new Font("Serif", Font.ITALIC, 48);
   String hello = "Hello";
   public void paint(Graphics brush)
   {
   
   super.paint(brush);
   brush.setFont(bigFont);
   brush.drawString(hello, 10, 100);
   }
   public static void main(String[] args)
   {
      JDemoFont frame = new JDemoFont();
      frame.setSize(180, 150);
      frame.setVisible(true);
   }
}   
   