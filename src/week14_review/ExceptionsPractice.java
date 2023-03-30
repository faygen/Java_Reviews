package week14_review;

public class ExceptionsPractice {

    public static void main(String[] args) {

        /*
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
         */

        //Thread.sleep(3000);
/*
        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Catch Block");
        }
*/

        sleep(3);


    }


    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

