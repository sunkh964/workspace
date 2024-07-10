package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 ~ 999까지의 수 중 임의의 숫자 입력 : ");
        int num = sc.nextInt();

        int hundreds = num/100;
        int tens = (num/10) %10;
        int ones = num % 10;

        // 박수
        int clapCnt = 0;

        if(hundreds == 3 || hundreds == 6 || hundreds == 9){
            clapCnt++;
        }
        if (tens == 3 || tens == 6 ||tens == 9){
            clapCnt++;
        }
        if (ones == 3 || ones == 6 || ones ==9){
            clapCnt++;
        }

        switch (clapCnt){
            case 0:
                System.out.println("박수 0번");
                break;
            case 1:
                System.out.println("박수 1번");
                break;
            case 2:
                System.out.println("박수 2번");
                break;
            case 3:
                System.out.println("박수 3번");
        }
    }
}
