package sample1;


import java.util.Scanner;

class Invalidageexception extends Exception {
    public Invalidageexception(String str) {
        super(str);
    }
}

class Agevalidator{
        void checkage(int age) {
            try{ if(age<0 || age>150){
                throw new Invalidageexception("age is invalid");
            }}catch (Exception e){
                System.out.println(e);

            }
        }


        }

//   void divisionnumber(int numerator,int Denominator){
//       try{
//       int result =numerator/Denominator;
//
//       } catch (Exception e) {
//           System.out.println("cannot divided by zero");
//       }
//       System.out.println();
//   }
//}




public class Exceptiondemo {
    public static void main(String[] args){
        Scanner one=new Scanner(System.in);
        int a= one.nextInt();

        Agevalidator one1=new Agevalidator();
        one1.checkage(a);
    }
}
