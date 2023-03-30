package week13_review;

import java.util.ArrayList;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee;
//upcasting
        employee =  new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000);
//when you want to reach unique member of object types use downcasting
        employee.work();
        // employee.smokeTesting(); // reference type decides what's accessible,tester yapar tum employeeler degil

        // Tester tester =(Tester)employee;
        ( (Tester)employee ).smokeTesting();//down castin yapmaliyiz , 1 kere kullanilcaksa initialize yapmaya gerek yok
//there must be a relationship yoksa classcast exception olur
        //  ( (Developer)employee ).unitTesting(); //testerin altina gelmis developer olmaz zaten testerla relationshipi yok

        employee.setSalary(200000); //- yapsak hata negatif olmaz

        System.out.println(employee);

        System.out.println("-----------------------------");

        employee =  new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000);
//when you want to reach unique member of object types use downcasting
        employee.work();
        ((Developer) employee).unitTesting(); //downcasting   //bella not josh implementing get executed
        //   ((Tester) employee).smokeTesting(); // Developer IS NOT A Tester//classcast exception


        System.out.println("-----------------------------");

        employee =  new Teacher("Jimmy", 36, 'M', "A03", 100000);

        employee.work();
        ( (RemoteJob)employee ).workFromHome();//bu onemli dogru
        //employee.workfromhome yazamayiz

        System.out.println(employee);

        System.out.println("-----------------------------");

        employee =  new Driver("Aaron", 40, 'M', "B01", 110000, 'A');

        employee.work();
        System.out.println(employee);

        System.out.println("-----------------------------");

        employee = new Janitor("Daniel", 38, 'M', "C01", 90000);

        employee.work();
        System.out.println(employee);

        System.out.println("-----------------------------");
//object dedik herseyi kabul eder, string olsa etmez ,Employee common o yuzden onu yazdik
        Employee[] employees = {
                new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000),
                new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000),
                new Teacher("Jimmy", 36, 'M', "A03", 100000),
                new Driver("Aaron", 40, 'M', "B01", 110000, 'A'),
                new Janitor("Daniel", 38, 'M', "C01", 90000)
        };

        int countTesters = 0;
        for(Employee each : employees){  //for each loop, for everysingle employee

            each.work();

            if(each instanceof Tester){  //instancei specific type icin kulklanioruz
                countTesters++;  //kac tane tester var
            }


        }





    }

}