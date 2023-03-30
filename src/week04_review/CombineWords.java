package week04_review;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {
     // Scanner.input =new Scanner(System.in);

       // String s1=input.next();
      //  String s2=input.next();
       String s1="one";
       String s2="eight";
       // input.close();
        if(s1.charAt(s1.length()-1)==s2.charAt(0)){ //
            // if the last character of first string is equal to the first character of second string same
            //one , eight ==> oneight
            System.out.println(s1+s2.substring(1));


        }else{
            System.out.println(s1+s2);
        }

    }
}
