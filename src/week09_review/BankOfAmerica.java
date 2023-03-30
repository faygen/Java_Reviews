package week09_review;

import java.time.LocalDate;

public class BankOfAmerica {

    public static void main(String[] args) {
//sadece new Tester()desen hata verir cunku Tster class da constuction 6 argument ile calisir bunada vermen lazim
        Tester tester1 = new Tester("Josh", 'M', LocalDate.of(1985, 4, 5) , "A01", "QA", 100000);

        // tester1.setInfo()

        Tester tester2 = new Tester("Ali");

        Tester tester3 = new Tester("Saja", 'F');

        Tester tester4 = new Tester("Yana", 'F', LocalDate.of(1999,5, 1));
        System.out.println(tester1); //diger tarafta toString metod olmazsa print olmaz

        System.out.println(tester2);

        System.out.println(tester3);

        System.out.println(tester4);


Developer dev1= new Developer("Aaron", 'M', LocalDate.of(1991,2,15), "B35","Java Developer",100.000);
        System.out.println(dev1);
        //dev1.smokeTesting();//hata verdi.developer class da smoke testing methodu tanimlamadik cunku

        tester1.smokeTesting();
        // tester3.coding();bu da olmaz testerda tanimlamadik coding i
        tester3.creatingTicket("smoke123");
        //dev1.creatingTicket("smoke123");

        dev1.coding();
        dev1.fixingBugs();
        dev1.unitTesting();

    }

}

/*
import java.time.LocalDate;

public class BankOfAmerica {

    public static void main(String[] args) {
/*
        Tester tester1 = new Tester("Josh", 'M', LocalDate.of(1985, 4, 5), "A01", "QA", 100000);
// tester1.setInfo()
        Tester tester2 = new Tester("Ali");
        Tester tester3 = new Tester("Saja", 'F');
Tester tester4=new Tester ("elif",'F', 2022,7,5, "22e","tester",100.000);
        System.out.println(tester1);
        System.out.println(tester2);

        System.out.println(tester3);
        System.out.println(tester4);
    }

}
*/