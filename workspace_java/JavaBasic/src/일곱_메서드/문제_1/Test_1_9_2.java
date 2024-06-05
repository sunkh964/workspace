package 일곱_메서드.문제_1;

public class Test_1_9_2 {
    public static void main(String[] args) {
//        test9_name("김형진");
//        test9_age(33);
//        test9_addr("울산");

        test10("김형진", 33, "울산");
    }

    public static void test9_name(String name){

        System.out.println("이름은 " + name + "입니다.");
    }

    public static void test9_age(int age){

        System.out.println("나이는 " + age + "입니다.");
    }

    public static void test9_addr(String addr){

        System.out.println("주소는 " + addr + "입니다.");
    }

    public static void test10(String name, int age, String addr){

        test9_name(name);
        test9_age(age);
        test9_addr(addr);

//        System.out.println("이름은 " + name + "입니다.");
//        System.out.println("나이는 " + age + "입니다.");
//        System.out.println("주소는 " + addr + "입니다.");


    }
}
