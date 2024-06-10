package class_basic.man;

public class ManTest {
    public static void main(String[] args) {

        Man man = new Man("홍길동", 20,"울산");

    // 변경
        man.setName("김철수");
        man.setAge(30);
        man.setAddr("부산");

        System.out.println(man.getName());

        man.printManInfo();


    }

}
