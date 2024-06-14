package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test_1_1_4 {
    public static void main(String[] args) {

/*        // ---------- 1번 -----------
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/

/*        // --------- 2번------------
        List<Integer> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 5개 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        list2.add(a);
        list2.add(b);
        list2.add(c);
        list2.add(d);
        list2.add(e);

        int sum = 0;
        for (int i = 0; i<list2.size(); i++){
            sum = sum + list2.get(i);
        }
        System.out.println(sum);*/

/*        // --------- 3번------------
        List<String> list3 = new ArrayList<>();

        list3.add("안녕");
        list3.add("홍길동");
        list3.add("홍홍홍");

        for (int i = 0; i < list3.size(); i++){
            if(list3.get(i).equals("홍길동")){
                System.out.println("해당 이름이 존재합니다.");
            }
        }*/

        // --------- 4번------------
        List<Integer> list4 = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            int a = (int) (Math.random() * 100 + 1);
            list4.add(a);
        }

        for (int e : list4){
                System.out.print(e + " ");
        }
        System.out.println();


        int cnt = 0;
        for (int e : list4){
            if (e % 2 ==0 ){
                cnt++;
                System.out.println(e);
            }
        }
        System.out.println(" 짝수의 개수 : " + cnt);
    }
}
