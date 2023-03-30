package week07;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[]row1={"Java",  "SQL" , "HTML" , "CSS", "Python"};//single dim. array
        String[]row2={"Selenium",  "API" , "Jenkin" };
        String[]row3={"Cydeo",  "Wooden Spoon " , "Batch28" };
      //  String[][]sheet1={row1,row2,row3};
     //   String[][]sheet2={};
      //  String[][]sheet3={};
String [][] sheet1={row1,row2,row3};
//[index of 1 dimensinal arrays][index number of elements ]
        System.out.println(sheet1[0][1]); //sql i bulduk
      //  String[][][] excelFile={sheet1,sheet2,sheet3};

    }
}
