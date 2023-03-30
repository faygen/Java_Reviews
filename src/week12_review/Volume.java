package week12_review;

public interface Volume {

    boolean HAS_VOLUME = true;  // public static  final aslinda ve static ve final  uppercase

    double calc_volume();//public and abstract always given by default//public  abstract double calc_volume aslinda ama public yazmiyor

    static void shapesWithVolume(){//public-private static aslinda private i silebilirsin
        System.out.println("ONLY the three dimensional shapes has volume ");
    }

    default void method1(){ // public defoultvoid method1 hata verir public yerine default yazinca olur
        System.out.println("instance method of the child classes");
    }

}