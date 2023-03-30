package week08_review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

     String[] arr= {"Anna","Canada","Bob","David","Lan","Abida","Ebrahim","Farida" };

//converting array to list
        ArrayList<String>names=new ArrayList<>(Arrays.asList(arr));

        System.out.println(names);//-> arrow token
//1. yol   names.removeIf(p->p.toLowerCase().charAt(0)==p.toLoweCase().charAt(p.length()-1));//olur ama 2. yol var
//              char stringe ""+ ile donusur
        names.removeIf(p->(""+p.charAt(0)) .equalsIgnoreCase(""+p.charAt(p.length()-1)));

        System.out.println(names);//[Canada, Lan, Ebrahim, Farida]

//converting arrayList to array;
      arr=  names.toArray(new String[0]);//.toArray() parantez icinde 2. ciyi secmeliyiz T[] olan.
        // ve String istiyorum.new String lenght yazmaliyim [0] seklinde size 0 olmali.[10] dersen 6 tanesi null olur
//[0] yerine (names.size) da diyebilirsin
        System.out.println(Arrays.toString(arr));//[Canada, Lan, Ebrahim, Farida]

ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//int [] numbers= nums.toArray(new int[0]);complier non primitive olmali int olmaz .Integer kullan
    Integer[]numbers=nums.toArray(new Integer[0])    ;
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5, 6]

    int[]a1={10,20,30,40};//itthis array  can not convert to the ArrayList. non prinitive olmali
        // ArrayList<Integer> list = new ArrayList<>( Arrays.asList(a1));
        ArrayList<Integer> list = new ArrayList<>();
//a1.for
        for (int each : a1) {
            list.add(each);
        }

    }
}
