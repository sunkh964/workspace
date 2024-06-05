package 다섯_반복문.문제;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");

        int num = sc.nextInt();
        int even = 0;

        for (int i = 1; i <= num; i++ ){
            if (i % 2 == 0){
                even++;
            }
        }
        System.out.println(even);
    }
}
