package week05_review;

public class MethodPractice_Return {
    public static void main(String[] args) {
        double a = calculate(10, '+', 30); // dikaakt '*' char olarak
        System.out.println(a);


        System.out.println("===========================================");



   double mulpicication = calculate(10,'*',20); //dikkat '*' char olarak
        System.out.println(mulpicication);
        System.out.println(calculate(10,'*',20));


        System.out.println("Hello World"); // bu alakasiz oldu

        System.out.println("------------------------------------------------------");

        System.out.println("Java".charAt(10000) );


    }




public static double calculate(double num1,char mathOperator, double num2){

    double result=0; //tum methodlarda kullan bunu.valid input yoksa 0 olur sonuc.


    switch (mathOperator) {

        case '-':
            //return num1=num2;
           result =num1 - num2;
            break;
        case '+':
            result=num1 + num2;
            break;
        case '*':
            result=num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
              result=num1/num2;

            }
            break;
        default:
            System.err.println("invalid math operator");
            //*****System.exit(status :1 );******     // it exit the whole program terminator //invalid operator yazar ve exit code 1 olur
    //terminates the whole program .everything will stop

    }


    return result ;
}
/*
Tasks
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

}
