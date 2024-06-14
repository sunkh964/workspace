package 상속;


// 우리 병원에는 강아지, 고양이, 송아지 3종류의 동물 관리
// 병원에는 총 10개의 케이지 존재
// 단, 3종류의 동물 수는 항상 변함

class Animal{
    public void bark(){
        System.out.println("동물들이 웁니다");
    }
}

public class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍");
    }
    public void aaa(){

    }
}

class Cat extends Animal{
    public void bark(){
        System.out.println("야옹");
    }
}

class Cow extends Animal{
    public void bark(){
        System.out.println("음메");
    }
}


