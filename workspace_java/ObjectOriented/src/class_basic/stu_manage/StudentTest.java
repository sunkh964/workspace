package class_basic.stu_manage;

public class StudentTest {
    public static void main(String[] args) {

    // 학생(Student class)을 5명 저장할 수 있는 배열 생성
        Student[] students = new Student[5];

    // 배열에 저장할 학생 객체 생성
        Student s1 = new Student("kim", 20, 80);
        Student s2 = new Student("lee", 21, 50);
        Student s3 = new Student("park", 22, 40);
        Student s4 = new Student("hong", 23, 70);
        Student s5 = new Student("choi", 24, 90);

    // 배열 요소에 학생 저장
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

/*    // 1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
        for (int i = 0; i < students.length; i++){
            students[i].printInfo();
            System.out.println();
        }*/

/*    // for-each 로 풀기
        for (Student s : students){
            s.printInfo();
        }*/

/*    // 2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
        for (int i = 0; i < students.length; i++){
            if (students[i].getScore() >= 80){
                students[i].printInfo();
                System.out.println();
            }
        }*/

    // 3. 이름이 'park'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        for (int i = 0; i< students.length; i++){
            if(students[i].getName().equals("park")){
                students[i].setAge(10);
                students[i].printInfo();
                System.out.println();
            }
        }

        for (Student s : students){
            if (s.getName().equals("park")){
                s.setAge(50);
                s.printInfo();
            }
        }

    }
}
