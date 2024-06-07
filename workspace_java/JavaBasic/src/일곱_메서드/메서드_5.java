package 일곱_메서드;

public class 메서드_5 {
    public static void main(String[] args) {
      int result = getSum(10,20);
        System.out.println(result);

        System.out.println(getSum(20, 40));

        System.out.println(getSum2(20,50));
    }

    // 매개변수로 전달된 두 정수의 합을 리턴하는 메서드
    public static int getSum(int a, int b){
        return a + b;

    }

    // 매개변수로 전달된 두 정수의 합을 실수 형태로 리턴하는 메서드

    public static double getSum2(int a, int b){
// ★'return' 키워드는 항상 메서드의 마지막에 딱 한번만 실행 가능!!★
        return a + (double)b;
    }
}
