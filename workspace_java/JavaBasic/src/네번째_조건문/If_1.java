package 네번째_조건문;

/*
  조건문 : 조건이 맞을 때만 코드를 실행
  자바에서 제공하는 조건문 : if, case
  if : 조건이 범위일 때
  case : 값이 정해져 있을 때
  - if(참 또는 거짓을 판별할 수 있는 조건){
        실행코드;
        실행코드...;
  }
*/
public class If_1 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작~");

        int x = 5;
    //소괄호 안의 내용이 참일 때만 실행
    //소괄호 안에는 필요한 만큼 코드 작성 가능
    //중괄호는 실행코드가 한 줄 일 때는 생략 가능
        if(x < 3){
            System.out.println(1);
        }


        System.out.println("프로그램 종료~");

    }
}
