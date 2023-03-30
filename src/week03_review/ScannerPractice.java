package week03_review;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in); // \n(enter will be in scanner memory
        System.out.println("Enter an Integer:");

      int num = input.nextInt();  //12+\n(entera bas 12 ye basip enter


        System.out.println("you have entered "+num);

        System.out.println("enter a decimal number");
       double num2= input.nextDouble();

        System.out.println("you have entered" +num2);

        System.out.println("are you employeed?");
        String employeed = input.next();
        System.out.println("employeed = " + employeed);

        input.close();

    }
}
