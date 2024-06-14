package Static;

// static : 멤버 변수, 메서드에서 사용가능
// 공용변수, 공용메서드를 의미한다.

public class Cnt {
    static int num = 0;


    public Cnt(){
        num++;
        System.out.println(num);
    }
}
