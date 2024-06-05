package 일곱_메서드;

// 매개변수(parameter) : 메소드 정의 부분 소괄호안에서 정의된 변수


public class 메서드_3 {
    public static void main(String[] args) {
        tellYorName("자바");
        tellYorName("홍");
    }

// 매개변수의 자료형 일치 필요!!! (tellYourName(5); - 실행 x

    public static void tellYorName(String name){
        System.out.println("제 이름은 " + name);


    }
}
