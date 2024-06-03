package 문자열비교;

import java.util.Scanner;

public class Test3_If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();

        System.out.print(" 연산자 : ");
        String operator = sc.next();

        if (operator.equals("*")){
            int results = num1 * num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + results);
        }
        else if (operator.equals("+")) {
            int results = num1 + num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + results);
        }
        else if (operator.equals("-")) {
            int results = num1 - num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + results);
        }
        else if (operator.equals("/")) {
            double results = (double)num1 / num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + results);
        }

        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }
    }
}
