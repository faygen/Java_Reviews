package week03_review;

import java.util.Scanner;

public class NextLineMethod2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter your salary");
int salary = input.nextInt();
        input.nextLine(); //everytime when we are using nextLine after the other methods we must provide one //
        // additional next line method
        System.out.println("enter your job title");
String job_title=input.nextLine();

input.close();

    }
}
