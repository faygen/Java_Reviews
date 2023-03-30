package week13_review;

public abstract class Employee {

    private String name;  //common variables
    private int age;
    private char gender;
    private final String id;
    private String jobTitle;
    private double salary;
//if its not common , we need interface, no object
    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        this.id = id;//final oldugu icin setter yok this kullan
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() { //setter yok
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Age can not be zero or negative");
        }
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if(salary <0){
            throw new RuntimeException("Salary can not be negative");
            //  System.err.println("Salary can not be negative");
            //  System.exit(1);
        }
        this.salary = salary;
    }


    public abstract void work(); //common methods different implementations kullanacagiz no body
    //bunu yazinca hata oldu abstract method icin class abstract olacak ya da interface olacak yoksa hata olur
    //public kullanilcak ,must be parent , not final

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/*
Common variables:  name, age, gender, id, jobTitle, salary
common methods: work(), toString()
 */