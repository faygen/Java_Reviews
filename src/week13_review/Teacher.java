package week13_review;

public class Teacher extends Employee implements RemoteJob{
    public Teacher(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Teacher", salary); //job title silip teacher yazdik
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName()+" is teaching");
    }

    @Override
    public void workFromHome() {
        System.out.println(getJobTitle() +" "+getName()+" is teaching from home");
    }

}