package Interface.student;

import java.util.Arrays;

public class MySudentTest {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();

        Student[] students = new Student[5];
        Student s1 = new Student("kim", 80 ,70, 90);
        Student s2 = new Student("lee", 90 ,95, 100);
        Student s3 = new Student("park", 60 ,80, 70);
        Student s4 = new Student("choi", 80 ,85, 100);
        Student s5 = new Student("hong", 40 ,90, 50);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        String result1 = s.getGradeByStudentName(students,"lee");
        System.out.println(result1);

        System.out.println();

        int[] result2 = s.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student stu = s.getHighScordStudent(s1,s2);
        System.out.println(stu.getName());

    }
}
