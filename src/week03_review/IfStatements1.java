package week03_review;

public class IfStatements1 {


    public static void main(String[] args) {

        // Odd or Even

/*
int num= 100;  // in single if it will check both condition and both if.

if(num%2 !=0){
    System.out.println("odd number");
}
if(num%2==0){
    System.out.println("even number");
}

*/

        int num = 100;
        if (num % 2 != 0) {
            System.out.println("odd number");

        } else {
            System.out.println("even number");
        }


        System.out.println("==========================================================");

//28 days ,30days,31 days

        int month = 30;

        if (month >= 1 && month <= 12) {


            if (month == 2) {
                System.out.println("28 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }

        }else{
                System.out.println("invalid");//if month<1 or month >12
            }
if(month<1){
    System.out.println("minimum month number is zero");
}else{
    System.out.println("maximum month number is 12");
}

        }

    }

