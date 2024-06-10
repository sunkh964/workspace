package class_basic.car;

public class CarTest {
    public static void main(String[] args) {
// 8.자동차의 속성을 출력하는 메소드를 만들고,
// 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인
        Car c1 = new Car();

    //c1의 변수를 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

    //c1 변수의 값 변경
        c1.brand = "현대";
        c1.price = 100;

    //c1 변수 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println();

        Car c2 = new Car();
        c2.prinCarInfo();

        c2.setBrand("KIA");
        c2.setModelName("잠와ㅠ");
        c2.setCarNumber("1234");
        c2.setPrice(200);
        c2.setOwner("c2");
        c2.prinCarInfo();

    }

}
