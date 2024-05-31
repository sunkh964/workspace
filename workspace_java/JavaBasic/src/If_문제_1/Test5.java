package If_문제_1;

public class Test5 {
    public static void main(String[] args) {

        int x = 81;

        if (x > 90 && x <= 100){
            System.out.println("학점은 A입니다.");
        }
        else if (x >80 && x <= 90){
            System.out.println("학점은 B입니다.");
        }
        else {
            System.out.println("학점은 C입니다.");
        }

    }
}
/* 깔끔하게 할라면
- else if (x > 80) 만 넣어도 적용이 됨
- 출력문 정리(String 활용)
    String grade;

    if(x > 90 $$ x <= 100){
     grade = "A"}
    else if() {
     grade = "B"
    }
    else{
     grade = "C"
    }
    System.out. println("학점은 " + grade)
*/
