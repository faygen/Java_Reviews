package week03_review;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); //\n
        System.out.println("enter your full name");
String fullName= input.nextLine();  //\n enter kullandik
        System.out.println("fullName = " + fullName);

        System.out.println("enter your age");
int age= input.nextInt();//29\n enter kullandik
        System.out.println("age = " + age);
input.nextLine(); // in order to clear the scanner
        System.out.println("enter your school name");
String schoolName= input.nextLine();
        System.out.println("schoolName = " + schoolName);

input.close();
    }
}
