// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 17 Applets
// Problem:2
// Part:
// Filename:StopWatch.java


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

import java.text.NumberFormat;



public class StopWatch extends JApplet implements ActionListener
{
   private AudioClip sound2;
   private AudioClip sound;   
   private int Tick;
   private double Time;
   private String timeString;

   private Timer displayTimer;
      
   JButton startButton = new JButton("START");
   JButton stopButton = new JButton("STOP");   
   
   private JLabel timeLabel = new JLabel("0:00");
      Container con = getContentPane();
      

   public void init()
   {
      Tick = 0;
      Time = ((double)Tick)/10.0;
      con.setLayout ( new FlowLayout());
      sound = getAudioClip(getCodeBase(), "alarmclock.wav");
      sound2 = getAudioClip(getCodeBase(), "ticking.wav");

      con.setBackground(Color.ORANGE);
      con.add(startButton);
      con.add(stopButton);
      con.add(timeLabel);
      
      timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
      timeLabel.setOpaque(true);    
      
      startButton.addActionListener(this);
      
      stopButton.addActionListener(this);
      displayTimer = new Timer(100, new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			Tick++;
			Time = ((double)Tick)/10.0;
			timeString = new Double(Time).toString();
			timeLabel.setText(timeString);
        // System.out.println(Time);
             }
		});    
      setSize(100,100);     
   } 
   public void paint(Graphics g)
   {
      super.paint(g);
      Graphics2D g2D = (Graphics2D)g;
      g2D.drawString("", 10,10);
   }  
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if ( source == startButton )
      {
         displayTimer.start();
         start();
         sound.stop();
         sound2.loop();
          
      }
      else if ( source == stopButton )
      {
         displayTimer.stop();
         sound.loop();
         
                  
      }

      
   }
}   