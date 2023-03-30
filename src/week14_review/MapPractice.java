package week14_review;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();

        properties.put("browser", "chrome");
        properties.put("cydeo.url", "https://www.cydeo.com");
        properties.put("dice.url", "https://www.dice.com");
        properties.put("username", "helpdesk1@cydeo.com");
        properties.put("password", "UserUser");


        System.out.println(properties);

        System.out.println( properties.get("browser"));

        String browser = properties.get("browser");
        if(browser.equals("chrome")){
            System.out.println("Chrome Driver is selected");
        } else if (browser.equals("firefox")) {
            System.out.println("Firefox Driver is set");
        }else{
            throw new RuntimeException("Invalid browser");
        }


        System.out.println(properties.get("cydeo.url"));





    }

}