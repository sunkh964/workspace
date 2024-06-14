package Interface.array;

public class MyArray implements MyArrayUtil{

    // 매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for (int i = 0; i < (arr1.length); i++){
            sum1 = sum1 + arr1[i];
        }

        int sum2 = 0;
        for (int i = 0; i < (arr2.length); i++){
            sum2 = sum2 + arr2[i];
        }

        int sumTotal = sum1 + sum2;
        return (double)sumTotal / (arr1.length + arr2.length);
    }

    // 매개변수로 받은 배열의 모든 요소가 짝수일 때만 리턴 true
    @Override
    public boolean isEvenArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                return false;
            }
        }
        return true;
    }
}
