package week02_review;

public class SwapVariables {
    public static void main(String[] args) {
        //with a temporary variable
      int x = 100;
      int y = 200 ;
      int z= x;     // z=100 // z is temporary variable the original value of x
      x=y; // x=200  x will have the value of y,  x will no longer have the Original value
        y=z ; // y will have z`s value which is the original value of x


        System.out.println("x = " + x); //200
        System.out.println("y = " + y );// 100

        System.out.println("---------------------------------------");

        // without temporary variable

        int a =10;
        int b = 20;

       // a=b; dersem a tamamen gider degeri b olur bi daha kullanamam

        a= a+b;// a=30 // is now equal to the sum of original values of a & b
        b= a-b; // b=10 // 30-20  from the sum of original a&b , substract the b to get original a1 value
         a=a-b ; // a=30-10=20
        System.out.println("a = " + a);
        System.out.println("b = " + b);








      /*





       */




    }




}
