package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {
        // ArrayList 객체 생성
        // String 데이터를 다수 저장하기 위한 list(통) 생성
        // 기본자료형은 사용못한다 -> Wrapper 클래스 사용
        // ArrayList<String> list1 = new ArrayList<>(); // 데이터를 저장하는 통
        List<String> list1 = new ArrayList<>();


        // 리스트에 데이터 저장하기
        list1.add("java");
        list1.add("c++");
        list1.add("python");
        list1.add("c++");

        // 리스트에 저장된 데이터 읽기, 순번으로 접근
        String result = list1.get(1); //"c++"

        // 리스트에 저장된 데이터 삭제
        list1.remove(0); //"java" 삭제

        // 리스트에 저장된 데이터 수
        System.out.println(list1.size());

        // 리스트에 저장된 모든 데이터 출력
        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }


    }
}
