package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 배열 만들기
// 1~9 사이의 랜덤한 정수, 중복 X
public class Test5 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }

        // 숫자 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("만들어진 숫자(3개) : ");
        int[] random = new int[3];
        for (int i = 0; i < 3; i++) {
            random[i] = sc.nextInt();
        }

        // 스트라이크, 볼
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (random[i] == arr[i]) {
                strike++;
            }
            else{
                for (int j = 0; j <3; j++){
                    if (random[i] == arr[j]) {
                        ball++;
                    }
                }
            }
        }
    }
}
