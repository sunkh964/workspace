package class_basic.calculator;

import class_basic.car.Phone;
import class_basic.song.Song;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.print("정수 1 입력 : ");
        int number1 = sc.nextInt();
        System.out.print("정수 2 입력 : ");
        int number2 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String oper = sc.next();

        // cal 객체의 calNum1과 calNum2를 키보드로 입력받은 값으로 변경
        cal.setNumber(number1, number2);

        if(oper.equals("+")){
            System.out.println(number1 + " + " + number2 +" = " + cal.getPlus());
        }
        else if (oper.equals("-")) {
            System.out.println(number1 + " - " + number2 +" = " + cal.getMinus());
        }
        else if (oper.equals("*")) {
            System.out.println(number1 + " * " + number2 +" = " + cal.getMulti());
        }
        else if (oper.equals("/")) {
            System.out.println(number1 + " / " + number2 +" = " + cal.getDiv());
        }
        else {
            System.out.println("연산자를 잘못입력했습니다.");
        }
    }
}
