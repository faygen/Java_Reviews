package week07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice1 {
    public static void main(String[] args) {

        //scores 10,11, 12 13 14 15

       int[] scores = {10,11,12,13,14,15} ; //new int[6]
        System.out.println(Arrays.toString(scores));//yazar yukaridaki numalari

        System.out.println("=======================================");

        String[]words={"Java", "Selenium", "API", "SQL", "Wooden Spoon", "Python"};

        String [] result=new String [6];//index 0~5
//simdi reverse yapalim
//j =0 cunku index 0 dan baslar elementler index orderda olmali j elements ,j ++ olmali cunku harfler devam edecek tekrara
        for (int i = words.length - 1,j=0; i >= 0; i--,j++) { // biri -- iken digeri ++ olmali
        result[j]=   words[i] ;
        //result+=words.charAt(i);
        }
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
/*
        result[2]="Java";
         result[1]="Selenium";
        result[3]="API";

        System.out.println(Arrays.toString(result));  //son 3 tanesine null yazar tanimlamadik
*/
        System.out.println("==============================================");

        int[]numbers=new int [7]; // ilk burasi 5 ti ondex : 0~4 / 5 tane element  var ama elementleri bilmiyoruz
        Scanner input= new Scanner(System.in);
//lenght is variable not methos. methos needs parantesis
        for (int i = 0; i < numbers.length; i++) {  //i<9 yazsak prinlesek  7 tane var yukdarida olmaz out of bound olur kirmizi
            System.out.println("enter a number");
            numbers[i]=input.nextInt();//it will be repeated 5 times starts from 0

        }

        System.out.println(Arrays.toString(numbers));

        input.close();
    }
}
