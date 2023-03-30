package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxNUmber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );

        System.out.println(list);

        /*
        list.removeIf( p -> p ==Collections.max(list));  // removes the first maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the second maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the third maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the fourth maximum number
        System.out.println(list);


       ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n=5;
        for(int i=0; i<n-1; i++){

        list.removeIf(p->p==Collections.max(list);
        }

        int result=Collections.max(list);
        System.out.println(result); //4
         */
      //dublicates do not matter
        int n=5;//i need to remove first 4 max numbers (-1) time 5-1
        for (int i = 0; i < n-1; i++) { //loop 4 times n-1
            list.removeIf(p -> p == Collections.max(list));//dublicates do not matter//collections.max metodu var
        }
            int result=Collections.max(list);
            System.out.println("result= " + result);
           // int result=Collections.max(list);
           // System.out.println(result); //11
        //in order to find the max number we can remove the first (n-1) max numbers .then the next max number will be the nth max number
        /*
       //remove first 4 max number
       list.removeIf(p->p== Collections.max(list)) ;//8 removes 1. max numbers//[1, 2, 3, 4, 5, 6, 7, 7] 8 ler removes
        System.out.println(list);//tek tek sirayla gider
        list.removeIf(p->p== Collections.max(list)) ;//7 removes 2. max numbers
        System.out.println(list);
        list.removeIf(p->p== Collections.max(list)) ;//6 removes 3. max numbers
        System.out.println(list);
        list.removeIf(p->p== Collections.max(list)) ;//5 removes 4. max numbers
        System.out.println(list);
*/
    }
}
