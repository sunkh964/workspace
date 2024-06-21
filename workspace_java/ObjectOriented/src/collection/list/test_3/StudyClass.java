package collection.list.test_3;

import class_basic.song.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyClass {

    private String className;
    private String teacher;
    private List<Student> StuList;

    public List<Student> getStuList(){
        return StuList;
    }

    public StudyClass(String className, String teacher, List<Student> stuList){
        this.className = className;
        this.teacher = teacher;
        this.StuList = stuList;
    }


//  1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    public void printStuAll(){
        for (Student stu : StuList){
            System.out.println(toString());
        }
    }


//  2) 해당 반의 평균 성적을 리턴하는 기능
//  3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능



}
