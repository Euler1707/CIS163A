import javax.swing.JOptionPane
public class SalaryDialog
{
   public static void main(String[] args)
   {
      String wageString, dependentsString; // defining string var
      double wage, weeklyPay; // defining int vars
      int dependents;
      final double HOURS_IN_WEEK = 37.5; // defining constant
      wageString = JOptionPane.showInputDialog(null,
         "Enter employee's hourly wage", "Salary dialog 1",
         JOptionPane.INFORMATION_MESSAGE); // message pane w/ options
     
     
      weeklyPay = Double.parseDouble(wageString) * 
         HOURS_IN_WEEK; // Changed string input to Double
     
      dependentsString = JOptionPane.showInputDialog(null,
         "How many dependents?", "Salary dialog 2",
         JOptionPane.QUESTION_MESSAGE); // message pane w/ options
         
      dependents = Integer.parseInt(dependentsString); // Change
     // input string to Int type
      
      JOptionPane.showMessageDialog(null,"Weekly salary is $" + 
         weeklyPay + "\nDeductions will be made for " +
         dependents + " dependents"); // message pane w/ output
              
   }
}   