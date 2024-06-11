package class_basic.stu_manage;

import com.sun.source.tree.NewClassTree;

import java.util.Scanner;

public class StuManage {

    private Scanner sc; // 키보드 입력을 위해 선언
    private Stu[] students; // 학생 다수를 저장할 배열
    private int idx; // 학생 배열의 요소

    // 생성자
    public StuManage(){
        sc = new Scanner(System.in);
        students = new Stu[3];
        idx = 0;
    }

    // 1) 학생등록 메서드
    public void regStu(){
        if (idx >= 3){
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
        else {
            System.out.println("학생등록을 실행합니다. 학생 정보를 입력하새요. ");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("연락처 : ");
            String tel = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();

            // 입력받은 정보로 학생 객체 생성
            Stu stu = new Stu(name, age, grade, tel);

            // 생성한 학생 객체를 배열에 저장
            students[idx] = stu;
            idx++;
        }

    }

    // 학생정보변경(연락처) 메서드
    public void chaneInfo(){
        System.out.println("정보변경 실행");
    }

    // 3) 학생정보출력 메서드
    public void print(){
        System.out.println("정보 출력");
    }
    // 4) 모든 학생정보출력 메서드
    public void printAll(){
        System.out.println("모든 학생의 정보입니다. 현재 총 학생수는 " + idx + "명입니다." );

        for (int i = 0; i < idx; i++){
            students[i].showInfo();
            System.out.println();
        }
    }
}
