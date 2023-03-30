package week12_review;

public class Square extends Shape { //hata olmamasi icin hem constructor olmali hem de override method olmali
//parent class absrtact method ve abstract class bunda da  override olmali methods bu sub class
    private double side; //unique variable

    public Square(double side) {  //constructor
        super("Square");//we assigned name : square here and yukaridaki string name i sildik constructor icindeki
        setSide(side); //this.side=side; di sildik setSide(side); yaptik tum degisiklikleri alsin diye
    }


    public double getSide() {  //getter
        return side;
    }

    public void setSide(double side) {  //setter
        this.side = side;
    }

//short cut right click- implement metods
    @Override
    public double calc_area() { //methodlari override yazip
        return side * side;  //return yanina metodlarin hesaplamalrini yazdik
    }

    @Override
    public double calc_perimeter() {   //methodlari override yazip
        return 4 * side;      //return yanina metodlarin hesaplamalrini yazdik
    }



}