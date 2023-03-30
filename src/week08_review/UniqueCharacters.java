package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        //find unique characters , no loops, you need collectioin later you need frequency

     String str="aabccdeeef" ;

       // str.split(""); //for each characters letters
        // frequency method icin once Collection olmali/
        // char array can not  to directly convert to the collection.it should be non primitive
        //1. I can turn it String  to array . i can convert it to   String array
                //asList method converting this Array to a collection and this collection passing toArrayList
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));//this ArrayList has every single character now
        //string to array , array to ArrayList
        //sout [aabccdeeef]
list.removeIf(p-> Collections.frequency(list,p)>1);//remove the elements they are not unique
//unknown remove if , frequency of each element  p
        System.out.println(list);//[bdf]

        String result = list.toString().replace("[", "").replace("]", "").replace(", ", ""); // "bdf"

        System.out.println(result);

        System.out.println(result);



    }
}
/*
4. Write a program that can return the unique characters from a string
            DO NOT use:
                for loop, for each loop, while loop, do while loop
 */