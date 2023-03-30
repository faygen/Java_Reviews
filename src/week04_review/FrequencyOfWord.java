package week04_review;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence= "Java Java Java Java Python C# Ruby C++ Swift"; // out put 4 ciksin.
        // that can return the
        // frequency of java from a sentence

        int originalLength=sentence.length();

     String temp=  sentence.replace("Java","abc");  // 1 eksigi 3 harfli
        int newLength=temp.length();
        System.out.println(sentence);
        System.out.println(temp);
        System.out.println(originalLength);
        System.out.println(newLength);

        int freqencyofJava=originalLength-newLength; //kac kez tekrarlanmis bunu buluruz

        System.out.println(freqencyofJava); //4

        System.out.println("=================================================");

        String s="";  // kac kere tekrarlandu frequency , karakter sayisindan 1 eksik kelime nul replace yap. lenght bul cikar


    }
}
