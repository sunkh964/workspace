package 세번째_연산자;

public class 연산자_1 {
    public static void main(String[] args) {
        //산술 연산자 : +, -, *, /, %(나머지)
        // % mod 연산자
        System.out.println(10 / 4); //2
        System.out.println(10 % 4); //2
        System.out.println(10 % 3); //1

        System.out.println(+10);
        System.out.println(-10);

        //비교 연산자
        // == 같다 , != 같지 않다
        // > , >= , < , <=

        //논리 연산자(맞다(참), 틀리다(거짓))
        //x가 5보다 크고 10이하다
        // && 그리고, || 그러나
        int x = 7;
        boolean r1 = x > 5 && x <= 10;
        System.out.println("r1 = " + r1);

    }
}
