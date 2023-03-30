package week09_review;

import java.time.LocalDate;

public class Tester {


    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;
/* bu sekilde yazariz ilk tek tek this. ile
    public Tester(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
  */

    public Tester(String name) {
        this.name = name; //we assigned instance variable.//parantesin icine char gender falan eklersen asagisua hemen  this.gender=gender; demen lazim
        // jobTitle="Unknown";// optional null yazmasin diye printte
    }

    public Tester(String name, char gender) {
        this(name);//constructorla bagladik yukaridaki bu sekilde this ile calling phone *sirasini eegistiremezsin name once olmali
        this.gender = gender;
    }

    public Tester(String name, char gender, LocalDate DOB) {
        this(name, gender);
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
    }

    public Tester(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        // we need to asssigned to this .construvtor needs to assigned this.I need to set it in instance variable with this.
        //1 constuctor can call only 1 constructor 2 tane yazamazsin
        this(name, gender, DOB);
        age = LocalDate.now().getYear() - DOB.getYear();//age dob den cikiuor diye gereksiz bulduk argument olarak yazmadik
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }
//bu metod olmasa diger tarafta bank of Amerika print yazmaz generate toString
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting(){  //static olmaz if method needs instance.static only accepts static

        System.out.println(jobTitle +" "+ name +" is smoke testing");
    }

    public void creatingTicket(String ticketNumber){   //ticket number istiyor o yuzden parameter koyduk String ticket number diye
        System.out.println(jobTitle +" "+ name +" is creating ticket " + ticketNumber);
    }

}
        /*
        public void smokeTesting(){
            System.out.println(jobTitle+" "+ name + " is smoke testing");

        }
        /*
        public void creatingTickets(String ticketNumber){
            System.out.println(jobTitle+" "+ name + " is creating ticket");
        }
    }
*/





/*
//1.create a class called Tester
attributes:
naame, gender,dateofbirth,age, employeeid,job title,salary

add a constuctor that can set all the fields

actions
smoke Testing() creating Ticket() dailyStandup, toString ()
ticket number da olsun
 */