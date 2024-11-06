package sample1;

import java.util.Scanner;

public class JavaPractice {
    public static int sum(int k) {
        if (k <= 6) {
            System.out.print( k+sum(k + 1));
            return k ;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        sum(5);
//        final int x=9;
//        double x1=15;
//        int x2= (int) x1;
//        System.out.println("the x value 10 is converted"+" " +x2+"into double\\typecast is achieved ");
//        int y= (x>=15)?(int) x1:x2;
//            System.out.println(y+"false condition");
//
//        Scanner scanner= new Scanner(System.in);
//
//        int day= scanner.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
        }

// Outputs "Thursday" (day 4)

    }

