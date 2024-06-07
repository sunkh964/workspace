package 일곱_메서드.문제_심화;

import java.util.Arrays;

public class Test_6_4 {
    public static void main(String[] args) {
/* test6
        int[] arr = {1, 7, 5, 3, 4};
        int max = test6(arr);
        System.out.println(max);
*/
/* test7
        String[] arr = {"Aa", "Bb", "Cc"};
        String result = test7(arr);
        System.out.println(result);
*/

/* test9
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = test9(a);

        System.out.println(Arrays.toString(result));
*/

        int[] x = {1,3,5};
        int[] y = {2,4,8};
        int[] result2 = test8(x,y);

        System.out.println(result2);
    }

    public static int test6(int[] array){ // 1 7 5 3 2
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static String test7(String[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++){
            result = result + arr[i];
        }
        return result;
    }

    public static int[] test8(int[] x, int[] y){
        int index = 0;
        for (int i = 0; i < x.length + y.length; i++ ){
            index++;
        }
        int [] resultArr = new int[index];
        for (int i = 0; i < x.length + y.length; i++){
            resultArr[index] = x[i] + y[i];
        }
        return resultArr;

    }

//    9. 정수형 배열 하나를 매개변수로 받아 배열의 요소 중
//    홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.
//  => 짝수 배열을 새로 하기

    public static int[] test9(int[] x){
    // 매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for (int e : x){
            if (e % 2 ==0){
                cnt++;
            }
        }
    // 짝수만 저장될 배열 생성
        int [] resultArr = new int[cnt];

        int index = 0;
        for (int i = 0; i< x.length; i++){
            if (x[i] % 2 == 0){
                resultArr[index] = x[i];
                index++;
            }
        }
        return resultArr;
    }



}
