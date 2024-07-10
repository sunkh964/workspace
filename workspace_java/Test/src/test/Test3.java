package test;

public class Test3 {
    public static void main(String[] args) {


        int[] array = {5, 11, 20, 40, 30};
        int max = 0;
        int min = array[0];

        // 큰거
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        // 작은거
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
