package week06_review;

import java.util.Scanner;

public class EnterEvenNUmber2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0 ; //temporary value

        //  while(num%2!=0){ //0 makes it wrong sadece 0 yazar run yapinca bug oluyor
        //      System.out.println("enter a number");
        //     num=input.nextInt();
        //  }
        //  System.out.println(num);
        do{
            System.out.println("Enter a number:");//it gets executed before checking condition
            num = input.nextInt();//enter number sorar ilk bir numara girersin
        }while(num % 2 != 0 ); // do while loop bu soruda daha cok isimize yaradi

        System.out.println(num);


    }
}

