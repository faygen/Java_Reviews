package week13_review;

public class Developer extends Employee implements RemoteJob{


    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName()+" is coding");
    }


    @Override
    public void workFromHome() {
        System.out.println(getJobTitle() +" "+getName()+" can work from home if needed");
    }

    public void unitTesting(){ //unique testing
        System.out.println(getJobTitle() +" "+getName()+" is unit testing");
    }

}