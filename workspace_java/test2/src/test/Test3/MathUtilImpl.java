package test.Test3;

public class MathUtilImpl implements MathUtil {

    @Override
    public boolean isEven(int a, int b, int c) {
        int sum = a + b + c;
        if (sum % 2 ==0 && sum % 5 ==0){
            return true;
        }
        return false;
    }

    @Override
    public int getSumFromOne(int num) {
        int sum = 0;
        for(int i = 1; i < num+1; i++){
            sum = sum + i;
        }
        return sum;
    }

    @Override
    public int getArraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
