package week06_review;

import javax.imageio.stream.ImageInputStream;

public class CydeoStudent { //custom class da main method olmaz.custom class object icin vardir. no memory in class
//ilk burdan basladik
    public String name;    // // void yaparsan hep fazilat 3 kez yazar ustten asagi oldugu icin declare etmezsen default  null olur
    public int age;   // I declare them as instance bec.I can create as many object as I want with this objects//
    public char gender;
    public boolean isMarried, isEmployed;
    public int batchNumber;
    public String programmingLanguage;
    public String groupName;

//   public static String schoolName="Cydeo"; //static kullan if  common school for all cydeo students herkes ayni okulda 1 tane var 1 kere kullacaksan
//tostring method kullanmaliyiz yoksa print yapinca hash code olur hata veriypr hush code oluyor
    //sag click generate-to string-full infi istersen hepsinisecersin
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", batchNumber=" + batchNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

// 2 . once construction void yaptik because we just set the values.
//set info method yapacagiz. generate constructor hepsini sec ok.
    //construction yaptik set info method koyduk .public yaninda CydeoStudent vardi  silip bi de void setInfo yazdik
    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, int batchNumber, String programmingLanguage, String groupName) {
        this.name = name;//this keyword it refers to the instances of object.it needs to assigned to the instance variable
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batchNumber = batchNumber;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;



    }


    }

// public static void study (){  // static method belongs to class it cant share anything no instance objects






/*
public void study(){ // instancelara ulasamaz onlar objectin
System.out. println(name +" is studying" + programming language) hepsini kirmizi yazar name ,programming
cunku onlar instance variables
1.in each object user should be able to sore the
name,age, gender, ismarried, isemployeed,batch. programming language and group name information
2. add a function named setInfo that allows the user to be able to set all fields of the Cydeo student
3.add a function named study that can print the name and programming language the student studying
4. add a function that allows the user to be able to display each objects` name ,age,gender.batch and programming language
of the student


}


 */