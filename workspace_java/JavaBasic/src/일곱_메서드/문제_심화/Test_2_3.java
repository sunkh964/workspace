package 일곱_메서드.문제_심화;

import java.util.Arrays;

public class Test_2_3 {
    public static void main(String[] args) {
//        test2(5);
//        test3(5);
        System.out.println(test4_2(6));

    }

    public static void test2(int a){

        for (int i = 1; i <10; i++){
            System.out.println(a + " * " + i + " = " +(a*i));
        }

        System.out.println();
    }

    public static void test3(int a){


        for (int i = 1; i <101; i++ ){
            if (i % a ==0){
                System.out.println(i);
            }
        }
    }

//4. Math.random() 메소드를 활용하여 1~ 50의 수 중 랜덤한 정수를 리턴하는
// 메소드를 만들고 호출해보자.
    public static int test4(){

    // 0.0 ~ 50.0
        return (int)(Math.random() * 50 +1);

    }

    public static boolean test4_2(int num){
        return num % 2 ==0 ? true : false;
    // return num % 2 ==0;  만 해도 결과 값 출력
    }



}
