package test.Test1;

public class CalTest {
    public static void main(String[] args) {

        // 1)
        Calculate cal = new Calculate();

        // 2)
        cal.setNumber(5,15);

        //3)
        System.out.println(cal.getSum());

        //4)
        System.out.println(cal.getMax());

        //5)
        System.out.println(cal.getAvg());
    }
}
