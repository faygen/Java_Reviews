package week03_review;

import java.util.Scanner;

public class Calculator_task {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter the fist number");
        double n1 = input.nextDouble();

        System.out.println("enter the second number");
        double n2 = input.nextDouble();
        System.out.println("enter a math operator");
        //String operator =input.next(); boyle de kullanilabilir
        char operator = input.next().charAt(0);


        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("operator = " + operator);

input.close();  // switch e baslamadan kapatman lazim

        switch (operator) {
            case '-':
                System.out.println(n1 - n2);
                break;

            case '+':
                System.out.println(n1 + n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case'/':
                System.out.println(n1/n2);
break;
            default:
                System.out.println("invalid operator");

        }
          /*

9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"




           */


    }

    }

