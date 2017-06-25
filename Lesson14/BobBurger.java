// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 14
// Problem: 3
// Part:
// Filename: BobBurger.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BobBurger extends JFrame
   implements ItemListener, ActionListener
{
  
   final double BURGER_BASE = 5.00;
   final double DOUBLE_BASE = 7.00;
   final double LETTUCE_BASE = 0.10;
   final double CHEESE_BASE = 1.20;
   final double PICKLE_BASE = 0.50;
   final double DRINK_S = 1.75;
   final double DRINK_M = 2.00;
   final double DRINK_L = 2.25;
   
   double subtotalPrice1 = 0.00;
   double subtotalPrice2 = 0.00;
   double totalPrice = 0.00;
   
   // Attempting DropDown Menus
   
   String[] list = {"Select Sandwich", "Burger $5.00",
                        "Double $7.00"};                     
   JLabel DropLabel = new JLabel
      ("Select Burger Type");
   JComboBox DropBurger = new JComboBox(list);
   
   
   String[] list2 = {"Select Drink Size", "Small $1.75",
                        "Medium $2.00", "Large $2.25"};
   JComboBox DropDrink = new JComboBox(list2);                     
                        
   
   // CheckBox Implementation 
   
   JLabel BobLabel = new JLabel
      ("Bob's Burger Menu");
      
        
   JLabel BurgerChoice = new JLabel
      ("Select Sandwich");
   
  
   
   JLabel CondimentsLabel = new JLabel
      ("Choose Add-ons");


   JCheckBox Cheese = new JCheckBox
      ("Cheese $" + CHEESE_BASE, false);
   JCheckBox Pickle = new JCheckBox
      ("Pickle $" + PICKLE_BASE , false);
   JCheckBox Lettuce = new JCheckBox
      ("Lettuce $" + LETTUCE_BASE, false);
   
   JLabel DrinkLabel = new JLabel
      ("\n  Drink Sizes");

      
   //JCheckBox DrinkS = new JCheckBox
     // ("Small $" + DRINK_S, false);
   //JCheckBox DrinkM = new JCheckBox
     // ("Medium $" + DRINK_M, false);
   //JCheckBox DrinkL = new JCheckBox
     // ("Large $" + DRINK_L, false);

      
   
      
   JLabel ePrice = new 
      JLabel("The price for meal is: ");
   
   JTextField totalField = new JTextField(6);
   JTextField subField1 = new JTextField(6);
   JTextField subField2 = new JTextField(6);
   

   
   public BobBurger()
   {
      super("Bob's Buger e-Menu");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      
      add(BobLabel);
      BobLabel.setFont(new Font("Arial", Font.BOLD, 18));

      
      //DropDown
      add(DropLabel);
      DropLabel.setFont(new Font("Arial",Font.BOLD, 16));
      add(DropBurger);
 
   
      add(CondimentsLabel);
      CondimentsLabel.setFont(new Font("Arial",Font.BOLD, 16));
      add(Cheese);
      add(Pickle);
      add(Lettuce);
      add(DrinkLabel);
      DrinkLabel.setFont(new Font("Arial",Font.BOLD, 16));
      add(DropDrink);
      
      add(ePrice);
      ePrice.setFont(new Font("Arial",Font.ITALIC, 14));
     
      add(totalField);
     
      totalField.setText("$" + totalPrice);

      Cheese.addItemListener(this);
      Pickle.addItemListener(this);
      Lettuce.addItemListener(this);
      //DrinkS.addItemListener(this);
      //DrinkM.addItemListener(this);
      //DrinkL.addItemListener(this);
      
      DropBurger.addActionListener(this);
      DropDrink.addActionListener(this);
      
              
   } 
   public void actionPerformed(ActionEvent e)
   {
      Double[] baseBurgPrice = {0.00,5.00,7.00};
      Double[] baseDrinkPrice = {0.00,1.75,2.00,2.25};
      
      int place = DropBurger.getSelectedIndex();
      int place2 = DropDrink.getSelectedIndex();
      subtotalPrice2 = baseDrinkPrice[place2]+ baseBurgPrice[place];
            
      totalPrice = subtotalPrice1 + subtotalPrice2;
      totalField.setText("$" + totalPrice);
   }
   public void itemStateChanged(ItemEvent event)
   {
      Object source = event.getSource();
      int select = event.getStateChange();
      
      if (source == Cheese)   
      {   
        if (select == ItemEvent.SELECTED)
        {subtotalPrice1 += CHEESE_BASE;}
        else   
        {subtotalPrice1 -= CHEESE_BASE;}
      } 
      else if (source == Pickle)   
      {   
        if (select == ItemEvent.SELECTED)
        {subtotalPrice1 += PICKLE_BASE;}
        else   
        {subtotalPrice1 -= PICKLE_BASE;}
      }
      else if (source == Lettuce)   
      {   
        if (select == ItemEvent.SELECTED)
        {subtotalPrice1 += LETTUCE_BASE;}
        else   
        {subtotalPrice1 -= LETTUCE_BASE;}
      }
       
      totalPrice = subtotalPrice1 + subtotalPrice2;
      totalField.setText("$" + totalPrice);       
   }
   
   
   public static void main(String[] args)
   {
      BobBurger aFrame = 
      new BobBurger();
      final int WIDTH = 200;
      final int HEIGHT = 350;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   
   }
}   
      