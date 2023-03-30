package week03_review;

public class DayInWeek {

    public static void main(String[] args) {


        int day = -200;
        String result="";

        if(day>=1&&day<=7){


        if (day == 1) {
            result="monday";
        } else if (day == 2) {
            result="tuesday";
        } else if (day == 3) {
            result="wed";
        } else if (day == 4) {
            result="thurs";
        } else if (day == 5) {
            result="friday";
        } else if (day == 6) {
            result="saturday";
        } else {
           result="sunday";

        }

    }else {   //day is invalid//this is the second pre condition
            if (day<1){
                result="minimum day number can not  be less than 1";
            }else{
                result="maximum day number can not be greater than 7";
            }

        }


        System.out.println(result);
        System.out.println("======================================");
int month =5;
if(month>=1&&month<=12){
    switch(month){
        case 1:
            //........
    }

}else{

    System.out.println("Invalid");
}



    }
}
