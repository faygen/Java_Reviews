package week14_review;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> value1 = new HashMap<>();
        value1.put("id", "A01");
        value1.put("age", 28);
        value1.put("job_title", "Java Developer");
        value1.put("salary", 100000);
        value1.put("full_time", true);

        Map<String, Object> value2 = new HashMap<>();
        value2.put("id", "A02");
        value2.put("age", 29);
        value2.put("job_title", "JSDET");
        value2.put("salary", 110000);
        value2.put("full_time", true);




        Map<String, Map<String, Object>> employees = new HashMap<>();
        employees.put("Oleksandr", value1);
        employees.put("Elena",  value2);

        System.out.println(employees);


        Object salaryOfElena = employees.get("Elena").get("salary");

        System.out.println(salaryOfElena);


        System.out.println(  employees.get("Oleksandr").get("job_title")  );

        System.out.println("----------------------------------------------------");

        for (Map.Entry<String, Map<String, Object>> eachEntry : employees.entrySet()) {
            System.out.println(eachEntry.getKey() + ":" + eachEntry.getValue().get("salary"));
        }






    }

}