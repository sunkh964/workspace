package 일곱_메서드.문제_1;

import java.util.Scanner;

public class Test_1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1 입력 : ");

        int x = sc.nextInt();

        System.out.print("정수 2 입력 : ");
        int y = sc.nextInt();
        test13(x, y);
    }

    public static void test13(int num1, int num2){
        System.out.println("두 수의 합 : " + (num1 + num2));


    }
}
