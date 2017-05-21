  // Chapter 9 
  // Writen by Edgar Colin EDG2140344
  // Sept 1th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // Chapter 9 Problem 7 A 
  // Filename: Service.java
  
  public class Service
  {
      String description;
      double price;
      double time;
      
      public void setDescription(String descript)
      {
         description = descript;
      }
      public String getDescription()
      {
         return description;
      }
      public void setPrice(double cost)
      {
         price = cost;
      }
      public double getPrice()
      {
         return price;
      }
      public void setTime(double t)
      {
         time = t;
      }
      public double getTime()
      {
         return time;
      }
      public void display()
      {
         System.out.print(description +"  " + "$"+price+
            "  " + time +"\n");
        
      }
      
   }     
         
       
