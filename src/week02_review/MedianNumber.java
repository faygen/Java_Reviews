package week02_review;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
       boolean aisMedian=( b>a && a>c) || (c>a && a>b);
       // inorder for a to be median number between 3 different numbers ,
        // a need to be less than b and greater than c . Or a need to be less than cor greater than b

        //boolean bisMedian=(!aisMedian && ( c>b|| c>a)); // we also can use it
        boolean bisMedian = (a>b && b>c ) || (c>b && b>a);


        // inorder for b  to be median number between 3 different numbers ,
        // b need to be less than b and greater than c . Or b  need to be less than cor greater than b

        boolean cisMedian = !aisMedian && !bisMedian ;
        // if both a and b are not the median number between three diffreent numbers . then c must be median number

             if(aisMedian) {
                 System.out.println(a + " is median number");

             }



        /* if else is for 2 condition . this is for 3 different
        write a program find the median number
        a=10 b=15 c = 20
        output: 15 is median number



         */



    }
}
