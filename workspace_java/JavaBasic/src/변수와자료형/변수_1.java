package 변수와자료형;

public class 변수_1 {
    public static void main(String[] args) {
        // 변수 - 값을 저장할 수 있는 공간
        //변수를 사용하기 위해서는 먼저 변수를 선언해야 함!
        // 변수 선언 문법 : 자료형(data type) 변수명;


        int num; //정수를 저장할 공간 num 선언
        // '=' 우측의 값을 왼쪽에 저정(대입, 할당)
        num = 5;
//        num = 1.5; 오류!!!
        System.out.println(num);
        System.out.println("num");

        System.out.println("num = " + num); //num = 5

        num = 10;
        // 하나의 변수에서는 하나의 값만 저장
        // 가장 최근에 대입한 값만 저장
        System.out.println("num = " + num);

    }
}
