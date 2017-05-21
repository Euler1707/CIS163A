public class CompareLoops
{
   public static void main(String[] args)
   {
      long startTime1, startTime2, endTime1, endTime2;
      final int REPEAT = 1000000;
      startTime1 = System.currentTimeMillis();
      for(int x = 0 ; x <= REPEAT ; ++x)
      {
         for(int y = 0; y <=REPEAT ; ++y)
         {
         }
      }   
      endTime1 = System.currentTimeMillis();
      System.out.println("Time for loops starting from 0; " +
         (endTime1 - startTime1) + " milliseconds");
      startTime2 = System.currentTimeMillis();
      for(int x = REPEAT ; x > 0 ; --x)
      {
         for(int y = REPEAT; y > 0 ; --y)
         {
         }
      }   
      endTime2 = System.currentTimeMillis();
      System.out.println("Time for loops starting from 0; " +
         (endTime2 - startTime2) + " milliseconds");   
   }
}             