package 일곱_메서드.문제_2;

import java.util.Scanner;

public class Test_2_2_3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(test2(sc.nextInt(), sc.nextInt()));

        System.out.println(test3(25,20));

//        System.out.println(test4("hi"," hello"));
    }

    public static int test2(int a, int b){
        return a * b;
    }

    public static int test3(int a, int b){
//        if (a>b){
//            return a;
//        }
//        else {
//            return b;
//        }
        return a> b ? a: b;
    }

    public static String test4(String a, String b){
        return a + b;
    }
}
