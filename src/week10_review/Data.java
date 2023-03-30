package week10_review;

public class Data {

    public int a; //instance variable

    public static int b; //static variable

    // text =

    public Data(int a) {   //we generate the constructor,constuctor runs mutiple times
        this.a = a;
      //  b=100;//bunun yerine static block kullan//that means you initialize it 100 times
        //  we inititialize the static vareiable in the constructor,its going to be same value for the all objects
        //b will be always 100
        //its assinged a ,than it assigned b .data ya gelen value once a yi sonra b yi gorur 20-100 , 30-100
    }

    static{
        b=100;   //static runs only 1 time,static executed first,initialize it 1 time
    }

}



class Test{
    public static void main(String[] args) {

//this data object  dafault olmaz
        Data data1 = new Data(20);//yukarida belirledigimiz gibi int deger vermeliyiz ,constructori izlemeliyiz ,icine yoksa hata verir dafault olursa
//yukariya constructora  bakariz it assigned a and assigfned b .yani 20-100
        Data data2 = new Data(30);////yukariya constructora bakariz it assigned a and assigfned b .yani 30-100
//constructor will executed twice for 20 and 30
        System.out.println(data1.a);//20
        System.out.println(data1.b);//100

        System.out.println(data2.a);//30
        System.out.println(data2.b);//100

//sonuc yine  20-100-30-100 cikar

    }
}



class A{

}


class B{

}
