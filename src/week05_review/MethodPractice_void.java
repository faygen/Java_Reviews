package week05_review;

public class MethodPractice_void {

    public static void main(String[] args) {

        calculate(10.5,'+',5.5);     //3 arguments,3parameters koymalisin ayni sirada olmali paarntezdekilerle 20+30 gibi yoksa hata olur
    //                                 once num1 sonra char sonra num2. you wont be assined it to varible double calculate= diyemezsin

        System.out.println("=====================================");
 // double result= calculate(100,+,200)*5;  // hata verir  you cant reuse it

    }


   //main method makes runnable  your class

//this method takes 3 argument (2 double and 1 char) calculates the 2 given numbers
public static void calculate(double num1,char mathOperator, double num2){
   // if (num1 < 0 || num2 < 0) {  //if there is a negative number // bunu sonradan ekledik negatif olursa cikiyor returnle

    //    System.out.println("one of them is negative" + num1  + num2 +" are not positive") ;
             //   return ;  //exit the method"); negatif olursa cikiyor

        switch (mathOperator) {

            case '-':
                System.out.println("substraction" + (num1 - num2));
                break;
            case '+':
                System.out.println("addition " + (num1 + num2));
                break;
            case '*':
                System.out.println("multipication" + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {

                    System.out.println("division" + (num1 / num2)); // num2 0 olmamali
                } else {
                    System.out.println(num1 + "can not be divided by zero");
                }
                break;
            default:
                System.out.println("invalid math operator");
        }
    }



}






/*
1. Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0



 */