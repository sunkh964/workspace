package 일곱_메서드.문제_2;

public class Test_2_8_2 {
    public static void main(String[] args) {

//        System.out.println(test8(50,70,80));
        System.out.println(test9(10));
    }

    public static double test8(int a, int b, int c){
        return (a + b+ c) /3.0;
    }

    public static int test9(int a){
        int sum = 0;

        for (int i = 1; i <= a; i++){
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
}
