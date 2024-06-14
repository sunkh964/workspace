package collection.list.test_1;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        Member mem1 = new Member("aa", "1111", "java",10);
        Member mem2 = new Member("java", "2222", "python",20);
        Member mem3 = new Member("cc", "3333", "c++",30);

        list.add(mem1);
        list.add(mem2);
        list.add(mem3);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i).getAge();
        }
        System.out.println("7번. 회원 나이 합 : "+sum);
        System.out.println();

        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId().equals("java")){
                index = i;
            }
        }
        list.remove(index);
        System.out.println(list);





    }
}
