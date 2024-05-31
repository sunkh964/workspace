package 세번째_연산자;

import java.util.Scanner;

/*
  키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
  단, 점수들은 정수만 입력한다고 가정한다. (nextInt)
  모든 정보를 입력받은 후
  입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력.
 */
public class 연습문제 {
    public static void main(String[] args) {

        // 키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름과 국어점수, 영어점수, 수학점수를 입력해주세요.");
        System.out.println("이름: ");
        String name = sc.next();

        System.out.println("국어 : ");
        int language = sc.nextInt();
        System.out.println("영어 : ");
        int English = sc.nextInt();
        System.out.println("수학 : ");
        int Math = sc.nextInt();

        int Total = language + English + Math;
        double Average = Total/3;

        System.out.println();
        System.out.println("---------- 입력 결과 ----------");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + language);
        System.out.println("영어 : " + English);
        System.out.println("수학 : " + Math);
        System.out.println("총점은 " + Total + "점 이며,");
        System.out.println("평균은 " + Average + "점 입니다.");


    }
}
