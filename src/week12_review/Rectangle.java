package week12_review;

public class Rectangle extends Shape{ //hata olmamasi icin constructor ekle ve override olmali methodlar

    private double length, width; //declare unique variables

    public double getLength() { //getter
        return length;
    }

    public void setLength(double length) { //setter
        this.length = length;
    }

    public double getWidth() {  //getter
        return width;
    }

    public void setWidth(double width) {  //setter
        this.width = width;
    }

    public Rectangle(double length, double width) {  //constructor
        super("Rectangle"); //ismi rectangle buraya ekledik
        setLength(length);//set seklinde olomali
        setWidth(width);//set seklinde olmali this degil
    }

    @Override   //override methods// generate-implement methods
    public double calc_area() {
        return length * width;//return 0; silip formulu yazicaz return yanina
    }

    @Override
    public double calc_perimeter() {
        return 2 * ( length + width);//return 0; silip formulu yazicaz return yanina
    }


}