package 세번째_연산자;

public class 연산자_2 {
    public static void main(String[] args) {
    // '!' 부정연산자 : 참 또는 거짓의 결과를 반대로 만듦.
        boolean b1 = true;
        System.out.println(b1); // ture
        System.out.println(!b1); // false

        b1 = !b1;
        System.out.println(b1);

    //대입연산자
        int num = 5;
    //num  변수의 값을 1 증가
        num = num +1; // 기존 num에 +1한 값 num = 6
        num += 1; // 위와 같은 의미로 num = 7
        System.out.println(num); // num = 7

        num -= 10; // num = num -10;
        num *= 3; // num = num *3;

    }
}
