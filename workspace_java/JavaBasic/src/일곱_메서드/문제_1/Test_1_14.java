package 일곱_메서드.문제_1;

import java.util.Scanner;

public class Test_1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test14(5);
    }

// 삼항연산자
// 10>5 // 1 // 2  - 이렇게 삼항
// 10 > 5보다 크면 'a에 1이 실행(if)', '아니면 a에 2가 실행(else)'
    int a = 10 > 5 ? 1: 2;

    public static void test14(int num){
        if (num % 2 ==0){
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }

        System.out.println(num % 2 ==0 ? "짝수" : "홀수");
    }
}
