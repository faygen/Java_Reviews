package week09_review;

import java.time.LocalDate;

public class Developer {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;

    public static boolean hasProgrammingSkill=true; //statik bu bunu constructorun icine asla koyma.tum devloperlarin programing bilgisi var ok static
//you should never initialized the static variables in the constructor.asagiya ekleyemezsin booleanstatic= true diye
//I have only 1 constuctor asagidaki
    public Developer(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        age=LocalDate.now().getYear()-DOB.getYear();
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){

        System.out.println(jobTitle + " " + name + " is coding");
    }
    public void unitTesting (){

        System.out.println(jobTitle + " " + name + " is unit testing" );
    }
    public void fixingBugs(){
        System.out.println(jobTitle +" "+name +" is crying");
    }



}
/*
2. create a class called Developer
	        Attributes:
	        	name, gender, dateOfBirth, age, employeeID, JobTitle, Salary, hasProgrammingSkill
        	Add a constructor that can set all the fields
	        Actions:
	        	coding(), unitTesting(), fixingBug(), toString()
	        	use name and job title too
 */