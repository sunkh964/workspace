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

        double avg = 0;
        for (int i = 0; i < list.size(); i++){
            avg = list.get(i).getTotalScore()/2.0 ;
            System.out.println(avg);
        }
        int firstScore = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++){
            firstScore = list.get(i).getTotalScore();
            }
        }

    }

}
