package 다섯_반복문.While;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        int i = 1;
        int cnt = 0;

        while (i <= num){
            if (i % 2 ==0){
                cnt++;
            }
            i++;
        }
        System.out.println("짝수의 개수 : " + cnt);
    }
}
