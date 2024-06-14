package object;

public class String_3 {
    public static void main(String[] args) {

        // String 객체의특이점
        // String 객체는 Imutable(값이 변하지 않는) 객체
        String addr1 = "울산";
        String addr2 = addr1;
        addr1 = "서울";

        System.out.println(addr1); // 서울
        System.out.println(addr2); // 울산
    }
}
