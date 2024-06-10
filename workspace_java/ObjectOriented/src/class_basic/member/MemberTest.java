package class_basic.member;

public class MemberTest {
    public static void main(String[] args) {
        Member m1 = new Member();

        m1.setMemberInfo("김자바","id@google.com", "1111", 30);

//        m1.name = "나";
//        m1.id = "me@google.com";
//        m1.password = "me1234";
//        m1.age = 30;

        m1.printMemberInfo();

        System.out.println();

        m1.setName("이파이썬");
        m1.printMemberInfo();





    }
}
