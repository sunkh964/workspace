package class_basic.car;

public class Car {
// 6. 자동차는 제조사, 차이름, 차량번호, 가격, 소유주의 속성을 가지고 있다.
//    이 속성을 가진 Car 클래스를 선언해 보세요.

    String brand;
    String modelName;
    String carNumber;
    int price;
    String owner;


// 7. 자동차의 속성 하나하나를 각각 변경하는 메소드들을 만들어보세요.
// - 제조사 값을 변경하는 메서드
    public void setBrand(String brand1){
        brand = brand1;
    }

// -  차 이름을 변경하는 메서드
    public void setModelName(String modelName1){
        modelName = modelName1;
    }

    public void setCarNumber(String carNumber1){
        carNumber = carNumber1;
    }

    public void setPrice(int price1){
        price = price1;
    }

    public void setOwner(String owner1){
        owner = owner1;
    }

// 8.자동차의 속성을 출력하는 메소드를 만들고,
// 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인
    public void prinCarInfo(){
        System.out.println("브랜드 : " + brand);
        System.out.println("차량이름 : " + modelName);
        System.out.println("차량번호 : " + carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }

}


