package week10_review.pizzaTask;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        /*
        Pizza pizza1 = new Pizza();
        //pizza1.size = "Wooden spoon";
        //System.out.println(pizza1.size);
        pizza1.setSize("Java");
        System.out.println( pizza1.getSize());
*/

        Pizza pizza = new Pizza("small", 2, 3);

        System.out.println(pizza);

        pizza.setSize("large");
        pizza.setNumberOfPepperoniTopping(5);

        System.out.println(pizza);

        System.out.println("------------------------------------------------------");

        ArrayList<Pizza> pizzas = new ArrayList<>();




    }

}