package week11_review;
public class Employee extends Person {

    private String employeeId, jobTitle;//uniquleri de private yaptik
    private double salary;
    //1. you need to declare unique variables 2 .getter setter 3.extend 4. constructor
//child class must need to call parent constructor.
    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {//generate constructor hepsi cikti
        super(name, age, gender);//constructora uniqueleri de ekle=otomatik cikti
        setEmployeeId(employeeId);//this li cikti getter setter koymalisin
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if(employeeId.charAt(0) == '0'){//charakter 0 ise
            System.err.println("Employee Id can not start with zero");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle==null){
            System.err.println("JobTitle can not be null");
            System.exit(1);
        }
        if(jobTitle.isEmpty()){
            System.err.println("JobTitle can not be empty");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        if(salary==0){
            System.err.println("Salary can not be zero");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working ");//getName() privatedan gelir
    }

    @Override
    public String toString() {//generate toString  override
        return getClass().getSimpleName()+"{" +  //Employee silip getClass().getSimpleName()
                super.toString() +  //name,age , gender vermesi icn parent class super dan geldi.bu sub class
                ", employeeId='" + employeeId + '\'' + //digerini ekle
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
Create a sub-class of Person named Employee:
            Extra variables:
                employeeId (String), jobTitle, salary
            Encapsulate all the fields
                restrictions for the fields:
                    job title can not be empty
                    job title can not be null
                    salary can not be negative
                    salary can not be zero
                    employee id can not start with the character '0'
            Add a constructor to set all the fields
                (Make sure all the restrictions are applied)
            Methods:
                work()
                toString()
 */