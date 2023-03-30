package week09_review;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {


    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("Sajjad", 'M', LocalDate.of(1998, 3, 4), "A01", "QA", 100000),
                new Tester("Serhan", 'M', LocalDate.of(1997, 7, 4), "A02", "SDET", 105000),
                new Tester("Ana", 'F', LocalDate.of(1996, 9, 4), "A03", "QE", 110000),
        };


        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982, 12, 4), "9874", "Front end Developer", 110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989, 4, 14), "3265", "Back end Developer", 120000),
                new Developer("Ediz", 'M', LocalDate.of(2001, 10, 28), "9563", "Developer", 130000),
                new Developer("Hamid", 'M', LocalDate.of(1989, 10, 10), "303", "Developer", 200000),
                new Developer("Serhan", 'M', LocalDate.of(1990, 11, 25), "308", "Developer", 160000)
        };

        Developer dev2 = new Developer("Halima", 'F', LocalDate.of(1997, 12, 4), "1224", "Swift Developer", 150000);
//scrum team object olusturuyoruz
        ScrumTeam scrum1 = new ScrumTeam("Nazar", "Olzhas", "Kudret", 14);
        scrum1.addTesters(testers);//3 //testers kullan1den fazla.testerlari ekledik
        scrum1.addDevelopers(developers);//5 bunlari yazmasak yazdirsak 0 veriyor
        scrum1.addDeveloper(dev2);//6 / 1 developer addDeveloper

        System.out.println(scrum1);//ilk bunu yazdirsik sadece po,ba,sm yazdi ,digerleri null eklememiz lazim


        scrum1.removeDeveloper("9563");

        System.out.println(scrum1);

        scrum1.removeTester("A02");

        System.out.println(scrum1);
        System.out.println("===============================================");
        System.out.println("------------------------------------------");
//if you need to get the names of every single test. Arraylist ve for each kullan
        for (Tester eachTester : scrum1.testers) { //scrum1.testers.for now i can get each of tester them name vesalary
            System.out.println(eachTester.name + " : " + eachTester.salary);//.name ve. salary dedim hem isim hem maaslari cikti
        }

        System.out.println("------------------------------------------");

        for (Developer eachDev : scrum1.developers) {
            System.out.println(eachDev.name + " : " + eachDev.salary);
        }

        System.out.println("------------------------------------------");


        System.out.println("------------------------------------------");

        // ArrayList<ScrumTeam> scrums = new ArrayList<>();
        //  ScrumTeam[] scrumTeams = {scrum1,scrum2,scrum3};

        ScrumTeam scrum2 = new ScrumTeam("Emre", "Yasmin", "Melisa", 14);
        ScrumTeam scrum3 = new ScrumTeam("Ahmet", "Yelda", "Enes", 8);
        Tester[] testers2 = {
                new Tester("Saim", 'M', LocalDate.of(1999, 2, 2), "A08", "QA", 100000),
                new Tester("Salih", 'M', LocalDate.of(1999, 5, 3), "A09", "SDET", 105000),
                new Tester("Elif", 'F', LocalDate.of(1998, 3, 1), "A04", "QE", 110000),
                new Tester("Selim", 'M', LocalDate.of(1989, 2, 5), "A19", "SDET", 125000)

        };
        Developer[] developers2 = {
                new Developer("Sasha", 'F', LocalDate.of(1986, 11, 22), "A1A", "Java Developer", 120000),
                new Developer("Tugba", 'F', LocalDate.of(1993, 1, 31), "A3A", "SDET", 120000),
                new Developer("Feyza", 'F', LocalDate.of(1983, 1, 2), "A2B", "QA", 120000),
                new Developer("Pinar ", 'F', LocalDate.of(1985, 12, 20), " A4C", "scrum master", 120000),
                new Developer("Liliana", 'F', LocalDate.of(1990, 3, 2), "A2D", "QA", 120000),
                new Developer("Atalay ", 'M', LocalDate.of(1985, 4, 10), " A47", "QA", 120000),
                new Developer("Alisher ", 'M', LocalDate.of(1982, 10, 20), " A49", "SDET", 120000)

        };


        }
    }



//if yopu need to get the names of every single test. Arraylist ve for each kullan
        //scrum1.testers.for now i can get each of them name vesalary


     /*   ScrumTeam scrum2 = new ScrumTeam("Ali", "Yasmin", "Emre", 8);
        ScrumTeam scrum3 = new ScrumTeam("Ahmet", "Yelda", "Enes", 8);
        Developer[] developers2 = {
                new Developer("Sasha", 'F', LocalDate.of(1986, 11, 22), "A1A", "Java Developer", 120000),
                new Developer("Tugba", 'F', LocalDate.of(1993, 1, 31), "A3A", "SDET", 120000),
                new Developer("Feyza", 'F', LocalDate.of(1983, 1, 2), "A22", "QA", 125000),
                new Developer("Pinar ", 'F', LocalDate.of(1985, 12, 20), " A44", "scrum master", 120000)
        };

        scrum2.addDevelopers(developers2);
        System.out.println(scrum2);
        for (Developer eachDev : scrum2.developers) {
            System.out.println(eachDev.name + " :" + eachDev.salary);
        }
        System.out.println("=======================================");

        Tester[] testers2 = {
                new Tester("Ayse", 'F', LocalDate.of(1988, 2, 12), "A23", "QA", 120000),
                new Tester("veli ", 'M', LocalDate.of(1999, 3, 5), "B23", "Sdet", 100000)


        };
        scrum2.addTesters(testers2);
        System.out.println(scrum2);

        for (Tester eachTester : scrum2.testers) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
//ScrumTeam scrum2;

        //   ScrumTeam scrum3;

        Developer[] developers3 = {
                new Developer("Sam", 'F', LocalDate.of(1986, 11, 22), "A1C", "Java Developer", 120000),
                new Developer("Tarik", 'F', LocalDate.of(1993, 1, 31), "A35", "SDET", 120000),
                new Developer("Fatih", 'F', LocalDate.of(1983, 1, 2), "A28", "QA", 125000),
                new Developer("Pelin ", 'F', LocalDate.of(1985, 12, 20), " A49", "scrum master", 120000)


        };

        scrum3.addDevelopers(developers3);
        for (Developer eachDev : scrum3.developers) {
            System.out.println(eachDev.name + " :" + eachDev.salary);

            System.out.println("------------------------------------------");

            // ArrayList<ScrumTeam> scrums = new ArrayList<>();
            //  ScrumTeam[] scrumTeams = {scrum1};


            Tester[] testers3 = {
                    new Tester("Ayse", 'F', LocalDate.of(1988, 2, 12), "A23", "QA", 120000),
                    new Tester("veli ", 'M', LocalDate.of(1999, 3, 5), "B23", "Sdet", 100000)
            };

            scrum3.addTesters(testers3);
            System.out.println(scrum3);
          //  scrum3.addTesters(testers3);
            for (Tester eachTester : scrum3.testers) {
                System.out.println(eachDev.name + " :" + eachDev.salary);

            }
ScrumTeam [] scrums=new ScrumTeam [3];
         scrums[0]=scrum1;
         scrums[1]=scrum2;
         scrums[2]=scrum3;
            System.out.println(Arrays.deepToString(scrums));

       //   for(ScrumTeam each : scrums){
         //     for(Tester each :)
          }
        }
    }
}



*/
/*
4.create a class called AppleInc:
            1. create an array of Testers and add the testers from your group
            2. create an array of developers add the developers from your group
            3. create an object of ScrumTeam named scrum1 and store the testers & developers above to the scrum team
            4. Display the full infos of the scrum team
            5. Create another object of ScrumTeam named scrum2 and store 2 testers & 5 develoeprs objects
            6. Create an array of ScrumTeam and store all the scum objects (scrum1 & scrum2)
 */


