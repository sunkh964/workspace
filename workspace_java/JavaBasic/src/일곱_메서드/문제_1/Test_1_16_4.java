package 일곱_메서드.문제_1;

public class Test_1_16_4 {
    public static void main(String[] args) {
//        test16(5);
//        test17(5,2);
//        test18(50,10);
        test19("집가고싶다 ",10);
    }
//    public static void test16(int num){
//        for (int i = 0; i< num +1; i++){
//            System.out.println(i);
//        }
//    }
//
//    public static void test17(int a, int b) {
//        int max = a > b ? a : b;
//        int min = a < b ? a : b;
//
//        for (int i = min + 1; i < max; i++) {
//            System.out.println(i);
//        }
//    }

    public static void test18(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int cnt = 0;

        for (int i = min + 1; i < max; i++){
            if (i % 5 ==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void test19(String s, int num){
        String result = "";
        for (int i = 0; i< num; i++){
            result = result + s;
        }
        System.out.println(result);
    }
}
