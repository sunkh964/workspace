package 네번째_조건문;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {

        // 키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램 시작");

    // x의 값이 7이면 '1'출력, 그렇지 않으면 '2' 출력

        int x = sc.nextInt();

        if(x == 7){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }

        System.out.println("프로그램 종료 :) ");


    }
}
