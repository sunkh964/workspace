package collection.list.test_3;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {

        // 자바반에 소속될 학생 3명 생성
        Student s1 = new Student("김자바",20,80);
        Student s2 = new Student("이자바",22,75);
        Student s3 = new Student("박자바",23,70);

        //자바반에 저장할 학생 List
        List<Student> stuList1 = new ArrayList<>();
        stuList1.add(s1);
        stuList1.add(s2);
        stuList1.add(s3);

        // 자바반
        StudyClass javaClass = new StudyClass("자바반", "강사_자바",stuList1);


        //캐드반에 저장될 학생 3명 생성
        Student s4 = new Student("김캐드",22,85);
        Student s5 = new Student("이캐드",23,75);
        Student s6 = new Student("박캐드",24,90);

        //캐드반 학생들이 저장될 list 생성 및 해당 list에 캐드반 학생 저장
        List<Student> stuList2 = new ArrayList<>();
        stuList2.add(s4);
        stuList2.add(s5);
        stuList2.add(s6);

        // 캐드반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
        StudyClass cadClass = new StudyClass("캐드반", "강사_캐드",stuList2);


        //영상반에 저장될 학생 3명 생성
        Student s7 = new Student("김영상",25,90);
        Student s8 = new Student("이영상",22,88);
        Student s9 = new Student("박영상",26,76);

        //영상반 학생들이 저장될 list 생성 및 해당 list에 캐드반 학생 저장
        List<Student> stuList3 = new ArrayList<>();
        stuList3.add(s7);
        stuList3.add(s8);
        stuList3.add(s9);

        // 영상반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
        StudyClass mediaClass = new StudyClass("영상반", "강사_영상",stuList3);


        // 교실을 여러개 저장할 수 있는 List 생성

        List<StudyClass> classList = new ArrayList<>();
        classList.add(javaClass);
        classList.add(cadClass);
        classList.add(mediaClass);

        School school = new School(classList);

        //--------------문제--------------

        //학교 안의 모든 학생의 정보 출력
        school.getClassList();

        for (int i = 0; i< school.getClassList().size(); i++){
            for (int j = 0; j < school.getClassList().get(i).getStuList().size(); j++){

            }
        }




    }
}
