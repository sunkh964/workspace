package If_문제_2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int max, mid, min;

        System.out.println("첫 번째 수 입력 : ");
        num1 = sc.nextInt();

        System.out.println("두 번째 수 입력 : ");
        num2 = sc.nextInt();

        System.out.println("세 번째 수 입력 : ");
        num3 = sc.nextInt();

    // num1이 가장 큰 수라면
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
            System.out.println(max + ">" + mid + ">" + min);

    }

    }
