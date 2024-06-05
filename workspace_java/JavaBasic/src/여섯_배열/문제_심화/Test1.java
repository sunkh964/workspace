package 여섯_배열.문제_심화;

public class Test1 {
    public static void main(String[] args) {


        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        //작성 위치
        for (int i = 0; i < array.length; ) {
            if (max < array[i]) {
                 max = array[i];

                System.out.println("max: " + max);
            }
        }
    }
}
