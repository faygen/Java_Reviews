package week12_review;

import static java.lang.Math.*;//tum math formullerine ulasmak icin import .*.

public class Cube extends Shape implements Volume { //ekstra volume methodu icin implements

    private double side;

    public Cube( double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calc_area() {
        return 0;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }


    @Override
    public double calc_volume() { //override yapmaliyiz yine bodysi olmali
        return 0;
    }

}