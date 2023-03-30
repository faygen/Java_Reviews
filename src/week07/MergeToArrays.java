package week07;

import java.util.Arrays;

public class MergeToArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D"};//index 0~3
        String[] arr2 = {"E", "F", "G"};//index 0~2
String[] arr3=new String[arr1.length+arr2.length];// yeni bir array olusturuyoruz
int k=0;     //I am declaring to use k for index number of 3.rd array ,i wanna use it for both loops so its outside the loop so i can use it everywhere

        for (int i = 0; i < arr1.length; i++,k++) { // abcd null null null yazdi //i for index of first array
       arr3[k] = arr1[i];//3. ye assigned yapcaz 1. arrayi //elements of 1. array being assigned to the indexes of 3. array
       //k needs to increase by 1 k++
        }

        for (int j = 0; j < arr2.length; j++,k++) { //i index of 2, arrasy
     arr3[k]  =arr2[j]; //k needs to increase by 1 k++ // elements of second array being assigned
        }
        System.out.println(Arrays.toString(arr3));
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