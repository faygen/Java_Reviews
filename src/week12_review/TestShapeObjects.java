package week12_review;

public class TestShapeObjects {
    public static void main(String[] args) {

        Cube cube = new Cube(10);//once object olustur

        cube.method1();
        cube.calc_volume();

        System.out.println(Volume.HAS_VOLUME);
        System.out.println(Cube.HAS_VOLUME);

        cube.calc_area();
        cube.calc_perimeter();

        System.out.println(cube);






    }

}
