package week12_review;

import static java.lang.Math.PI;//static variable import (PI) math class from lang package
import static java.lang.Math.pow;//power method import ettik

public class Circle extends Shape { //extend it

    private double radius; //unique variables
//public final static PI=3.14 bu sekilde yazabilirim unique varible olarak ama math siniftan import ettik bu soruda
//final variable genelde uppercase olur

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {  //constructor //string name i sildik
        super("Circle"); //name i burada belirledik
        setRadius(radius);//this.radius degistirip set ile yaptik
    }

    @Override
    public double calc_area() {
        return pow(radius, 2) * PI;//main classtan static import power (multiple yapar)ile method import ettik
        //return radius*radius*PI boylede yazilir
    }

    @Override
    public double calc_perimeter() {
        return radius * 2 * PI;
    }


}
