package 여섯_배열.문제2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int a = sc.nextInt();

        int[] arr = new int[a];
        int sum = 0;
        double average = 1;



        for (int i = 0; i < arr.length; i++ ){
            arr[i] = i+1;
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        average = (double)sum / arr.length;
        System.out.println(average);


/*      강사님 풀이
        int sum = 0;
        for (int e : arr){
            sum = sum + e;
        }

        System.out.println(sum /(double)arr.length);
*/
    }
}
