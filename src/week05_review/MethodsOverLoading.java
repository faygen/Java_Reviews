package week05_review;

public class MethodsOverLoading {

    public static void main(String[] args) {
        String result = contacStrings("Cydeo", "School");
        System.out.println(result);
        System.out.println("============================================");
        String str="Wooden Spoon";

    }

    public static String contacStrings(String str1, String str2) {

        return str1 + " " + str2;

    }

    public static String contactStrings(String str1, String str2, String str3) {

        return str1 + " " + str2 + " " + str3;

    }

    public static String contactStrings(String str1, String str2, String str3, String str4) {

        return str1 + " " + str2 + " " + str3 + " " + str4;
    }
}