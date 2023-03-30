package week06_review;

import java.util.Scanner;

public class NestedLoopPractice1 {

    public static void main(String[] args) throws InterruptedException {  // count down
// count down olsun
       Scanner input=new Scanner (System.in);
        System.out.println("print enter the number of minutes");
        int minutes=input.nextInt();
input.close();
        for (int m = minutes; m >= 0; m--) { // m minutes  for minutes 2 dakiakdan geri say // when we add scanner so we put minutes or we can give number
            for (int s = 59; s >= 0; s--) {  //s seconds forvseconds this loop
                System.out.println(m + " minutes " + s + " seconds");//its repeating every second  koydugumuz icin iceride print

                Thread.sleep(1000);// counting down //pause execution 1 saniyede bir yazar bunun sayesinde asagida geri sayar hizlica

            }

        }
    }
}