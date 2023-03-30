package week02_review;

public class Operators {
    public static void main(String[] args) {

        System.out.println(20/3);
        System.out.println(20.0/3);
        System.out.println(100%20); // think like a vending machine , you need to get change
        //you can not divide a number to 0
        System.out.println("ResultB"+1+3); //ResultB13 /toplanmadi soldan saga gidilir
        System.out.println(1+2 + "ResultA"); // 3resultA
        System.out.println("------------------------------------");


        int a= 200;
        System.out.println("a = " + a);
        a=2000;
        System.out.println("a = " + a);

        System.out.println("-------------------------------------");

        int x=100;
      //  x=x+20;
           x+=20;  // adding value to a variable on top of its original value // kisa yolu eklemenin

        int y =200;
        y-=50;  // y=y-50
        System.out.println(y);

        int score = 45;
        score*=2;
        System.out.println(score); // 90
int points = 100;

points/=2;
        System.out.println(points); // 50

       int cents =100;
       cents-=60;
        System.out.println(cents);

        int quarter= cents/25; // 1 quater bec you have 40 cents , kalan 15 cents
        System.out.println(cents);  // 15 cents left

        int nickles = cents /5 ; // nickels = 5 cent // 3 olur bec total 15
      //  cents=cents%1;
        cents %= 1 ;

        int amount = 730;
        int hundreds = amount/100;
        System.out.println(hundreds);
        amount%=100;
        System.out.println(amount);

        int tenth = amount/10;
        System.out.println(tenth);
        amount%=10;
        System.out.println(amount);


        System.out.println("-------------------------------------");
        System.out.println(-10+20);
        int q=25;
        System.out.println(++q); //26
        int r= 50;
        System.out.println(r++); //50
        System.out.println(r); //51

        int t = 300;
        System.out.println(--t); //299
         int u= 300;
        System.out.println(u--); //300
        System.out.println(u);  //299











    }
}
