package week03_review;

public class SwitchStatements {

    public static void main(String[] args) {

int day =7;
String result ="";
switch(day){

    case 1 :result="Monday";
        break;
    case 2:result ="tuesday";
        break;

    case 3:result = "wed";

        break;
    case 4:result="thurs";

        break;

    case 5:result ="friday";

        break;

    case 6: result="saturday";
        break;
    case 7:result="sunday";
        break;

    default :
        if(day<1){
            result="minimum day number can not be less than 1";

        }else{
            result=" maximum can not be greater than 7";
        }
        break;


}


        System.out.println(result);



    }
}
