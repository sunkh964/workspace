package 일곱_메서드.문제_2;

public class Test_2_5_3 {
    public static void main(String[] args) {

//        System.out.println(test5(70));
//        System.out.println(test6(8));
        System.out.println(test7(8));

    }

//    public static String test5(int a){
//
//        if (a >= 90){
//            return "A";
//        }
//        else if (a >= 70){
//            return "B";
//        }
//        else {
//            return "C";
//        }
//    }

    public static String test6(int a){

    // 정수 -> 문자열
        String bb = String.valueOf(10);
    // 문자열 -> 정수
        int aa = Integer.parseInt("10");

        return a + "" ;
    }

    public static double test7(double a){
        return a * a;
    }
}
