package member;

public class MemberTest {
    public static void main(String[] args) {

        Member mem = new Member();

        mem.setInfo("자바", "java", "abcd1234", 20);

        System.out.println(mem.showInfo());
    }
}
