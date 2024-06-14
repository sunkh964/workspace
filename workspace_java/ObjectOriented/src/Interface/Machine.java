package Interface;

// 인터페이스는 메서드의 이름만 존재
// 멤버변수 X, 생성자 X
// 생성자가 없기 때문에 인터페이스는 객체 생성 불가
// 인터페이스는 클래스에 얹혀 살아야 함
// 클래스에 인터페이스를 적용하는 문법(클래스 선언시 적용)
// 'public class 클래스명 implements 인터페이스명'
// 위의 코드를 해석하면
// '인터페이스를 구현한 클래스를 생성하겠다'
// 인터페이스 안의 추상메서드는 public을 생략하면 자동으로 public이 붙음
// 인터페이스를 구현한 클래스이 생성자로 인터페이스 객체 생성

public interface Machine {

    public void takeCoffee(); // 추상메서드
    public void takeMilk();
}
