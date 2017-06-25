package lesson1;

class MyClass extends Thread {

   public void run(){
   
      for ( int i = 0; i < 10; i++ )
      {
         System.out.println( Thread.currentThread().getId() + " Value " + i);
      }
      
      try
      {
         Thread.sleep(100);
      } 
      catch ( InterruptedException e )
      {
         e.printStackTrace();      
      }
   }

}

public class Demo {

   public static void main(String[] args)
   {  // Tod auto generated method stub
      MyClass myClass = new MyClass();
      myClass.start();
      MyClass myClass1 = new MyClass();
      myClass1.start();
   }
}