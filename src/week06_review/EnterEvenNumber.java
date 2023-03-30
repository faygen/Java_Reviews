package week06_review;

import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner while loop icinde olmamali , multiple olur yoksa

        System.out.println("Enter an even number:"); //while ile yapsak condition yok infinite olue true yazsan bile
        int num = input.nextInt();

       // if(num % 2 != 0) {// if statement  will not repeated because ,you didnt use loop
        while(num % 2 != 0) { //while 2. deniyrouz if olmadi. bu olur even girince durur.
            System.out.println(num + "is not an even number, please re -enter");
           num= input.nextInt();//10 //num i assign yapmazsak condition hep true olur
        } // if and while they both executed when the condition is true


        /* Do while loop ile yapalim simdi
        do{
            if(num % 2 == 0){ // burayi sonradan ekledik bug oldu once cunku . 10 girdik even ama not even yazdi bir sefer yaziyor hata oluyor do while
                break;//simdi ilk bunu kontrol etti hata olmadi //bunu yapmazsam ilkini yanlis olsada dogru verir ilk girisi hep yazdirir
            }if just 1 time sorar if, repeat yapmaz if statement please re enter 1 kez sorar . O yuzden while koyduk
            System.out.println(num +" is not an even number, please re-enter:");
            num = input.nextInt(); // 10//scannerda goukmesi icin assigned yap // 10 girince biter false yapar ve durur
       }                       //assign yaplalisin yoksa hep 1 is not even number yazar surekli
        }while(num % 2 != 0 );
*/


        System.out.println("Even number: " + num);


    }

}

/*
Write a program that asks user to enter even number UNTIl user enters a valid input



 */


