package week08_review;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args) {
 //ArrayList<Integer>  Integer cunku bu bolum nonPrimitive olmali wrapper . Array LIst primitive olmaz
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);//[]
        list.add(10);//[10] it can wrapped to Integer autoboxing
        list.add(10);
        System.out.println(list);//[10]

        System.out.println(list.size()); //dynamic oldu size method ile 1
list.addAll(Arrays.asList(30,40,60,90) );//addAll da Arrays.asList kullanmalisin
        System.out.println(list);//[10, 10, 30, 40, 60, 90]
//40 den itibaren baska numaralar eklem,ek isitiyorum
        list.addAll(3,Arrays.asList(45,65,75));//index 3 den once koyar dikkat 40 dam once  //[10, 10, 30, 45, 65, 75, 40, 60, 90]
        System.out.println(list);

       //10 i kaldiralim 1 tanesini

       list.remove(1);//index number ile kaldirdik
        System.out.println(list);//[10, 30, 45, 65, 75, 40, 60, 90]

      //remove 3 elements 45,40,90  we know what elements removeAll kullan
list.removeAll(Arrays.asList(45,40,90));//remove them dublicate olsa da remove yapar hepsini
        System.out.println(list);//[10, 30, 65, 75, 60]

 //     list.remove(Integer.valueOf(75))  ;//thias int boyle yazamzsi 75 diye object olmali no longer needed this way
 //       System.out.println(list);
            Integer a= 75;
            list.remove(a);

        System.out.println(list);//[10, 30, 65, 60]
        System.out.println("=====================================");

        ArrayList<Integer> numbers = new ArrayList<>(list);//parantezin icine listi yazinca tum elemenalr numbers a gecti run yazinca hepsini yazar
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500));

        System.out.println(numbers);

        // keep the elements 65, 300, 400, and remove the rest

        numbers.retainAll(Arrays.asList(65, 300, 400));

        System.out.println(numbers);

        System.out.println("==============");

       ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Java" , "SoftSkill", "Selenium ", "API", "SQL", "Wooden spoon"));
                //("Java" , "SoftSkill", "Selenium ", "API", "SQL", "Wooden spoon"));

        System.out.println(names);
        //names.charAt(2); diyemeyiz kabul olmaz/ArrayListte charAt (string mthod direk olmaz )
names.get(2).charAt(2); //3. characterin of 3. element.//get (index 2)ile Selenium geldi its string method oldu simdi charAt . ile cagirabiliriz

        System.out.println("===================================");
ArrayList<Integer>nums = new ArrayList<>();
nums.addAll(Arrays.asList(10,20,30,40,50, 60,70,50,10,20,30,40,50,60));

nums.removeIf(p-> p<40);//40 i yazar 40 dan kucukler gider/p yerine each de kullanabilirsin
        System.out.println(nums);//[40, 50, 60, 70, 50, 40, 50, 60]  40 dahil 40 kaliyor
        //  System.out.println( new LinkedHashSet<>(nums));
    }
}
