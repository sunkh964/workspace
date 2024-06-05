package 여섯_배열.문제2;

public class Test2 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int num = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            num++;
            if (num % i == 0 ){
                System.out.println(num);
            }

        }
    }
}
