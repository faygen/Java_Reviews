package week12_review;

    import java.text.DecimalFormat;

    public  abstract class Shape {  //if you create a 1.parent class and .2.there must be a method multiple implamentations , u need abstract
//you can cot create an object in this class
        private final String name;//final ile isim fixed//final yazinca kirmizi oldu hata bec. you dont have a default value
        //variables must be initialized before they are being used.
//final yapinca sadece getter yapabilirsin. setter olmaz. consructorda detay verirsin.
        public Shape(String name) {//constructor//with condition we can optimize it in constructor
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double calc_area(); //currly braces yok noktali virgul olmali//abstract cunku so many implamentations kullacagiz

        public abstract double calc_perimeter();//abstract bec. we need multiple implementations


        // public abstract void eat(String food);

        @Override
        public String toString() {
            DecimalFormat df =new DecimalFormat("0.00");//burayi ekledik ilk 2 decimal format var diye
            return name +"{" +                                  //return shape di degistirdik name yaptik
                    "area='" + df.format(calc_area() ) + '\'' + //area ekledik//2 decimals format olsun df.format ekledik olsun
                    ", perimeter='" + df.format(calc_perimeter() ) + '\'' +  //perimeter ekledik.2 decimals format olsun df.format ekledi
                    '}';
        }

    }

/*
Shape Task:
    1. Create a class named Shape:
            Variables:
                name (final)
            Encapsulate all the fields
            Methods:
                calc_area();
                calc_perimeter()
                toString(): include the area & perimeter of the shape
 */

