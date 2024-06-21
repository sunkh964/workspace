package collection.list.test_1;

import class_basic.song.Song;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student stu1 = new Student("kim",80,80);
        Student stu2 = new Student("lee",70,70);
        Student stu3 = new Student("park",90,90);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("----2번 -----");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getTotalScore() >= 150){
                System.out.println(list.get(i));
            }
        }
        System.out.println();
        System.out.println("----3번 -----");

        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i).getTotalScore() ;
        }
        System.out.println((double)sum/list.size());

        System.out.println();
        System.out.println("----4번 -----");

        int index = 0; //총점이 1등인 학생의 index
        int max = 0;  // 가장 높은 총점
        for (int i = 0; i < list.size(); i++){
            if (max < list.get(i).getTotalScore()){
                max = list.get(i).getTotalScore();
                index = i;
            }
        }
        System.out.println(list.get(index));

    }

}
