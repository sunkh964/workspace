package 일곱_메서드.문제_1;

import java.util.Scanner;

public class Test_1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        String addr = sc.next();

        test10(name, age, addr);

    }

    public static void test9_name(String name) {

        System.out.println("이름은 " + name + "입니다.");
    }

    public static void test9_age(int age) {

        System.out.println("나이는 " + age + "입니다.");
    }

    public static void test9_addr(String addr) {

        System.out.println("주소는 " + addr + "입니다.");
    }

    public static void test10(String name, int age, String addr) {

        test9_name(name);
        test9_age(age);
        test9_addr(addr);
    }
}
