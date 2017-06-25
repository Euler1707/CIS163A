import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class JCompanyImage extends JApplet
{
   Image companyLogo;
   final int WIDTH = 287;
   final int HEIGHT = 129;
   final int FACTOR = 2;
   public void init()
   {
      companyLogo = getImage(getCodeBase(), "CompanyLogo.png");
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      // draw image at its natural size
      g.drawImage(companyLogo,0,0,this);
      // draw image scaled - twice as large
      g.drawImage(companyLogo, 0, HEIGHT, WIDTH * FACTOR, HEIGHT * FACTOR, this);
   }
}      