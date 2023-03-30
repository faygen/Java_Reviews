package week06_review;

public class RemoveDublicates {

    public static void main(String[] args) {   //remove dublicates

        String str="XXXYYZZQQQQWWUUUUOOOO" ;   //remove dublicates

        //  "XYZ"
        String result=""; // you need it because you can not change the string object at the top. string is ummutable  //"XYZ"

        for (int i = 0; i <str.length(); i++) { // every single character
            if(result.contains(""+str.charAt(i))){ // str.charAt(i) means str deki  every single character .
                // contains method string ister oyuzden "" koyariz
               // result+= str.charAt(i) yukaridakini yazmadan if li olani bunu print yaparsak ayni cok sayida karakteri yazar
                continue; //if a character already there you need to skip the second one so no dublicated
            }   // if have the same character you need to skip it


            result+= str.charAt(i); // only yukaridaki conditiona gore if must be check first. must be in loop

        }
        System.out.println("result=" + result); // print must be outside, yoksa repeated olur





    }
}







