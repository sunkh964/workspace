package 여섯_배열.문제2;

public class Test5 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        int[] newArr = new int[5];

        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        for (int e : newArr){
            System.out.println(e);
        }

    }
}
