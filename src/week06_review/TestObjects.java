package week06_review;

public class TestObjects {
//when you create a custom class you need to test it
    public static void main(String[] args) {
// object name assigned to class name same olmali
     CydeoStudent student1 = new CydeoStudent();//cydeostudent in heap memory
     student1.setInfo("Josh", 25 , 'M', true, false , 28, "java","cydeo");
//student1.name="Alisher";//in string pool
     CydeoStudent student2=new CydeoStudent();
     student2.setInfo("Emily", 22, 'F',false , true, 23, "java", "outher");
//student1.name="aynur"; student2 olmali
     CydeoStudent student3=new CydeoStudent();
   //  student1.name="fazilet"; student3 olmali
     student3.setInfo("daniel", 45, 'm', true , false, 33, "java" , "laylam");


student1.name="Sajjat"; //  isim degisir sadece 1. isim
//student1.name ="Alisher' seklinde yazdirirsak hepsini fazilet,null null yazar .student2.name="aynur,student.3="veli" gibi olmali

        System.out.println(student1.name); // eger diger taraf/ public void String name olsa  static olsa sadece faziletyazar 3 kez en son olani kabule der
        System.out.println(student2.name);// o yuzden void u sileriz diger tarafta
        System.out.println(student3.name);

//student1.study (); //sajjad yazar
//student 4 print yapsak null olur name diger bilgilerde 0 olur

        System.out.println("=====================");

        CydeoStudent s1=new CydeoStudent();
        CydeoStudent s2=s1;  //there is only one object

    }
}
