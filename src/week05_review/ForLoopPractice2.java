package week05_review;

public class ForLoopPractice2 {


            //"Cydeo"
    public static String reverse(String str){  //reverse the string
String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
                        //last index

          result+=  str.charAt(i); //same as result = result + i // result += i
            //each character (from last to the first) we are adding them in to new string
        }

        return result;
    }


}
