package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int max, mid, min;

        System.out.print("정수 1  : ");
        num1 = sc.nextInt();

        System.out.print("정수 2  : ");
        num2 = sc.nextInt();

        System.out.print("정수 3  : ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3){
                mid = num2;
                min = num3;}
            else {
                mid = num3;
                min = num2;}
        }
        else if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                mid = num1;
                min = num3;
            }
            else {
                mid = num3;
                min = num1;
            }
        }

        else {
            max = num3;
            if (num1 > num2) {
                mid = num1;
                min = num2;
            }
            else {
                mid = num2;
                min = num1;
            }

        }
        System.out.println("수 나열 : " + max + " > " + mid + " > " + min);

    }
}
