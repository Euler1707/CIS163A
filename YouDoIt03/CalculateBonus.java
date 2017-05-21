
//fig 3-21 pg 136
public static double calculateBonus(double salary)
{
   final double BONUS_AMT = 50.00;
   salary = salary + BONUS_AMT;
   return salary;
}

public static double calculateBonus(double salary)
{
   salary = salary + trickyCalculation();
   return salary;
}

      