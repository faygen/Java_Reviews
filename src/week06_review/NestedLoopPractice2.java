package week06_review;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
//frequency test
        String s = "abcabcabcabcbbbbbbXY";

        String result = "";

        for (int j = 0; j < s.length(); j++) {
// outer loop getting each character one by one. for finding every single character
            char character = s.charAt(j);  // 1. char c ='b'; you can write and find 'b'
            int f = 0; // we don`t know how many we have this character may be 0 .start from 0 . total number of frequency yi
 //char character ='b';// to find  'b'
            //inner loop  for finding the frequency . inner loop checking each character with  matching with this character.
            for (int i = 0; i < s.length(); i++) { // index number each character of index
                if(s.charAt(i) ==s.charAt(j) ){ //   character instead ofs.charAt(j)   you can write.  character instead of  j  .this character appears in this char characters
                    f++; // it needs to increase by 1
                }
            }

           // System.out.println(character + " : " + f);  // a:4 , b:10 , c: 4 ....// we need to stop dublicates
         //   System.out.println(f); find the frequency of b
            /*

           finding the frequency of each character:
            if(result.contains(""+character)){ // if we wanna stop duplicated characters a4b6d4
                continue;
            }
            result += character+""+f; //
*/

            if(f==1){  //to find the  unique character
                result += character; // XY
            }


        }

        System.out.println(result);



    }

}
