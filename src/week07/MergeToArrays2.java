package week07;

import java.util.Arrays;

public class MergeToArrays2 {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "D"};
        String[] arr2 = {"E", "F", "G"};
        String[] arr3 = new String[arr1.length + arr2.length];// yeni bir array olusturuyoruz
        int k = 0;
//arr1.for   // shorter faster
        for (String each : arr1) { //each :is elements of first array//no index number here
            arr3[k++] = each; //veya sonunda yaz  k++;//each element of first array being assigned to each index of 3. array
            //++k olmaz onden hep 1 ekler.

        }
        for (String each : arr2) { //each :is elements of first array//no index number here
            arr3[k++] = each;

            System.out.println(Arrays.toString(arr3));
        }
    }
}
/*
Tasks:
    Write a program that can merge two arrays of String and retuns the third array

            Ex:
                String[] arr1 = {"A", "B", "C", "D"};
                String[] arr2 = {"E", "F", "G"};

            output:
               arr3 = {"A", "B", "C", "D", "E", "F", "G"};


 */