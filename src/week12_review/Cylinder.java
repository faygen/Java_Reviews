package week12_review;

import static java.lang.Math.*;//tum math optionlari icin * yaptik

public class Cylinder extends Shape  implements Volume{

    private double height, radius; //unique variables

    public Cylinder(double height, double radius) { //constructor
        super("Cylinder");//name buraya ekledik
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() { //gettter
        return height;
    }

    public void setHeight(double height) { //setter
        this.height = height;
    }

    public double getRadius() {  //getter
        return radius;
    }

    public void setRadius(double radius) {  //setter
        this.radius = radius;
    }


    @Override
    public double calc_area() {  //override yaptik
        return 2 * PI * radius * height + (2 * PI * pow(radius, 2));
    }

    @Override
    public double calc_perimeter() {
        return (2 * radius) + (2 * height);
    }

    public double calc_volume(){  //override yaptik implements var
        return 0;
    }


}