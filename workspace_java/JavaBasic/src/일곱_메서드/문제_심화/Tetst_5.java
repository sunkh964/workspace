package 일곱_메서드.문제_심화;

public class Tetst_5 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        arr_5(a);
    }

// 5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.

    public static void arr_5(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
