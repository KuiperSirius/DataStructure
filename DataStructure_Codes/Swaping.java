public class Swaping
  {
    static void swap(int  x , int y )
    { 
     int  temp ;
     System.out.println("Before  Swapping");
     System.out.println("x= "+x+" y= "+y);
     temp = x;  x = y;  y = temp;
     System.out.println("After  Swapping");
     System.out.println("x= "+x+" y= "+y);

   }
   public static void main(String[] args)
   {
     int  u=23 , v=100;
     System.out.println("Before Calling");
     System.out.println("u= "+u+" v= "+v);
     swap(u, v);
     System.out.println("After Calling");
     System.out.println("u= "+u+" v= "+v);
   }
  }