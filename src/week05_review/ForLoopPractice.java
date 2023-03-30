package week05_review;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner( System.in); // scanner loop un disinda olmali

int max=  -2147483648; //-minimum number integer olabilecek . max = 10 olacak sonra 20 , 30 ,40 ,50 olacak
        int min=  2147483647;


        for (int i = 0; i < 5; i++) {    // or i= 1 and i<6 // scanner loop in icinde yapma tekrar yapar 5 kez
            System.out.println("enter a number");
            int num = scan.nextInt(); //10,20,30,40,50

            if(num>max){
               max= num;
            }
            if(num<min){
                max= num;
            }

        }
        System.out.println("max=" + max); // mutlaka disina yaz loop un yoksa yanlis cikar
        System.out.println("min is " + min);
        scan.close();
    }
}
