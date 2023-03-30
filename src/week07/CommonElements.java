package week07;

public class CommonElements {
    public static void main(String[] args) {

        String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
        String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};



        for (String element : arr1) { //element: each element of 1. array


            for (String each : arr2) { //each=each elementn of second arrey
                if (each.equals(element)) { //if the element of first array is included in the ssecond array
                    // if(!result.contains(element)) eger 2 tane varsa element 1 tane yazsin diye
                    //result+=element + "\n";
                    System.out.println(each);
                }
            }
        }

    }
}
/*


   Write a program that can display the common elements from two arrays of string

            Ex:
                String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
                String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

            Output:
                Java
                Wooden Spoon
 */