package 세번째_연산자;

import java.util.Scanner;

public class 키보드연산_3 {
    public static void main(String[] args) {

    // 키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름과 나이를 입력해주세요~");
        System.out.println("이름: ");
        String name = sc.next();
        System.out.println("나이 : ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name);
        System.out.println("당신의 나이는 " + age + "로 확인되었습니다.");

    }
}
