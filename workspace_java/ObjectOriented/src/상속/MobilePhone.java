package 상속;

// 다형성 : 객체의 생성 형태가 다양함


public class MobilePhone {
    String number;

    public void sendMsg(){
        System.out.println("메세지 전송 :)");
    }
}

class SmartPhone extends MobilePhone{
    String os;

    public void palyApp(){
        System.out.println("앱 실행 :)");
    }
}