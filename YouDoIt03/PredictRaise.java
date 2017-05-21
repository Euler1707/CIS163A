// Figure 3-20  pg 136
public static double predictRaise(double salary)
{
   double newAmount;
   double bonusAmount;
   final double RAISE = 1.10;
   newAmount = salary * RAISE;
   bonusAmount = calculateBonus(newAmount);
   return newAmount;
}
   