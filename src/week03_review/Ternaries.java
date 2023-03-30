package week03_review;

public class Ternaries {

    public static void main(String[] args) {

        int day= -200;
        String result="";
        if(day>=1&&day<=7){  // 7 possiblel outputs
            result=(day==1)?"monday":(day==2)?"tuesday":(day==3)?"wed":(day==4)?"thursday"
                    :(day==5)?"saturday":(day==7 )?"sunday" :"invalid";

}
        System.out.println(result);


    }
}
