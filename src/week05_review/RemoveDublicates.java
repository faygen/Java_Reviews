package week05_review;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str="XXXYYZZQQQQWWUUUUOOOO" ;   //remove dublicates

       //  "XYZ"
         String result="";   //"XYZ"

        for (int i = 0; i <str.length(); i++) {
           if(result.contains(""+str.charAt(i))){
               continue; //if a character already there you need to skip the second one so no dublicated
           }


            result+= str.charAt(i); // only yukaridaki conditiona gore if must be check first

        }
        System.out.println("result=" + result); // print must be outside, yoksa repeated olur





    }
}
