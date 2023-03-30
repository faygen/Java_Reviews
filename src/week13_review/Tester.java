package week13_review;

public class Tester extends Employee implements RemoteJob {
//parent class abstarct. hata olmamasi icin constructor olustur ve methodlar override olmali yoksa hata verir
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName()+" is testing");
    }

    public void smokeTesting(){ //unique method
        System.out.println(getJobTitle() +" "+getName()+" is smoke testing");
    }

    @Override
    public void workFromHome() {
        System.out.println(getJobTitle() +" "+getName()+" can do testing from home if needed");
    }
//equals we just want 1 method to compare object to another object  , equals  come from object class
    //compare 1 tester with another, if job title and salary is same ,testers are same
    @Override
    public boolean equals(Object obj) {  //ask you another tester object
        if( ! (obj instanceof Tester)){//bunun sonradan koyduk
            throw new RuntimeException("Invalid object");
        }
//    given obj
        if(obj instanceof Tester){
            if( ((Tester) obj).getSalary() == getSalary()){
                return true;
            }
        }

        return false;
    }



}