import javax.swing.*; // java.awt.Frame is parent of javax.swing
public class JFrame1  // java swing class will include JFrame// java.awt.Frame is parent of javax.swing
{
   public static void main(String[] args)
   {  //JFrame constructor adding the title
      JFrame aFrame = new JFrame("First frame"); 
      aFrame.setSize(250, 100); //setting the size of the aFrame
      aFrame.setVisible(true); // setting the aFrameVisible
   }
}

      