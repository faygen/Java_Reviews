package week03_review;

public class FINRA {

    public static void main(String[] args) {

        int number=15;
        if(number>0){

            //FIN,RA,FINRA


String result ="";

            if(number%3==0 &&number%5==0)  {
             result ="FINRA";
            } else  if(number%3==0)  {
             result ="FIN";
         }else if(number%5==0){
             result ="RA";
         } else {

                result = ""+number;
            }

            System.out.println(result);

        }



        /*multible of3, 5, both 3,5 finra
        ex number=3
        output fin 5
        5 = ra
        both finra


         */


    }
}
