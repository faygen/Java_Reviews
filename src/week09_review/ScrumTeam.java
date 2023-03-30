package week09_review;

import java.util.ArrayList;
import java.util.Arrays;
public class ScrumTeam { // ScrumTeam HAS A Developer //HAS a relationship

    public String PO, BA, SM; //instance variables
    public ArrayList<Tester> testers; //for testers team we have multiplee people variables so we need data structure array list
    public ArrayList<Developer> developers; // for developers team
    public int daysOfSprint;
//bunlari zorunlu tutsun task bize po,ba,sm,sprint.at the beginning size is 0
    //diffrent scrum teams has diffrent develeopers and tsters so its instance
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) { //contructor
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        testers = new ArrayList<>();//we initialize them othervise null olur//I need to use add and remove method so I need to initialize it
        developers = new ArrayList<>();//we initialize them
        //we create arraylist objects here.at the beginning size is0 for tester and developer .bec. we didnt initialize them
    }
//we dont know the element so Tester yazacagiz ve tester object yazacagiz
    public void addTester(Tester tester){ // adds one tester to the testers team.we need to add to arraylist with add method
        testers.add(tester);
    }
//Tester is 1 ,Testers are multiple so we use Testers.if you try to call instance u need to use this
    public void addTesters(Tester[] testers){ // adds multiple tester to the testers team
        this.testers.addAll( Arrays.asList( testers)  ); //addAll method array to arraylist
    }//testers same local variable name as the same instance variable so we need to use this.

    public void addDeveloper(Developer dev){ //  adds one developer to the developers team
        developers.add(dev);
    }

    public void addDevelopers(Developer[] developers){ // adds multiple developers to the developers team
        this.developers.addAll( Arrays.asList(developers));//this keyword kullanmalisin .
        // arrayi arraliste eklicen addAll kullan ve Arrays.asList kullan
    }

    public void removeTester(String id){ // removes the tester with the specified id from testers team.id is unique
        testers.removeIf( p -> p.employeeId.equalsIgnoreCase(id) );
    }

    public void removeDeveloper(String id){
        developers.removeIf( p -> p.employeeId.equals(id) );
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testers.size() + //biz ekledik total number of testers=" + testers.size() +
                ", total number of developers=" + developers.size() +//", total number of developers=" + developers.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}

/*
3. create a class called ScrumTeam
           	Attributes:
                  PO, BA, SM (for storing their names ONLY)
                  testers, developers, daysOfSprint
            Add a constructor that can set the PO, BA, SM and daysOfSprint
         	Actions:
                addTester(Tester tester): adds the given tester to the testers ArrayList
                addTesters(Tester[] testers): adds the given testers to the testers ArrayList
                addDeveloper(Developer developer): adds the given developer to the developers ArrayList
                addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                removeTester(long employeeID): removes the given tester from the testers ArrayList
                removeDeveloper(long employeeID): removes the developer from the developers ArrayList
                toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint
 */