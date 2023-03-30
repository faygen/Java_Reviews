package week11_review;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void smokeTesting(){
        System.out.println(getJobTitle()+" "+getName()+" is smoke testing");
    }

//if we need new variables we need to override in child class. toString too. New variables yoksa no overrideing
    public void work() {//we override
        System.out.println(getJobTitle()+" "+getName()+" is finding bugs");//super work u sildik
    }


}