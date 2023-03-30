package week04_review;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str="cydeo School";
     char ch=  str.charAt(1);   //index number start from 0  // y istiyorsan bulmak , c icin 0 koyarsin

      int length=  str.length();
        System.out.println(ch);
        System.out.println(length); //5

        int lastIndex=str.length()-1;  //4
     char ch2=   str.charAt(lastIndex);  //son kararkteri verir o harfi
        System.out.println(ch2);

       int indexO= str.indexOf('e'); //index of hem char hem string kabul eder
        System.out.println(indexO);

int indexOfFirstO=str.indexOf("o"); //4 cikar

        System.out.println(indexOfFirstO);

        int indexOffSecond= str.indexOf("oo");//School daki o yu bulalim sadece first o yu bulacak 9 ikinci o
        System.out.println(indexOffSecond);

        System.out.println("=================================================");

        String s1 ="BATCH 28";
         s1=  s1.toLowerCase();  //batch 28

        System.out.println("s1 = " + s1);

        System.out.println("========================================");

        String s2="I live in Virginia";
   //  s2=   s2.replace("Virginia","New York");
s2= s2.replaceFirst ("Virginia","New York");
        System.out.println(s2);


        System.out.println("-----------------------------------------");

        String s3="Batch 28 students";  //batch 28 yazmak istiyorum
     String t1=   s3.substring(0,8);//7 normalde ama sonunda 8 yazacaksin ki sondakini yazmaz ona kadar bosluk 8 ama
        System.out.println(t1);

      String t2=  s3.substring(s3.indexOf('s'));  //student yazmak istiyoruz once s in index numberini bulup substring yap
       System.out.println(t2);          // , s3.length                       //s3.length yazdik sonuna kadar yazsin diye ama yazmak zorunda degiliz


        System.out.println("--------------------------------");
        String name="muhTaR";
        name=name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase()   ;   //first character uppercase
     //  name= ("" +name.charAt(0)).toUpperCase()  + name.substring(1).toLowerCase(); //char la uppercase yaaparsan basina "" koymalisin

        System.out.println(name);


        System.out.println("======================================");

        String a= "yEs";
        System.out.println(a.equals("yes"));  //false der

        System.out.println(a.equalsIgnoreCase("yes")); //true


        System.out.println("========================================");

        String l="Today we will have Java and Soft Skill classes";
       boolean hasSelenium= l.contains(("Selenium"));
        boolean hasJava=l.toLowerCase().contains("java");//to lower case ignore yapsin diye harfleri

        System.out.println("hasSelenium = " + hasSelenium);
        System.out.println("hasJava = " + hasJava);

    }

}
