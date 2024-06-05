package 일곱_메서드.문제_1;

public class Test_1_15 {
    public static void main(String[] args) {

    }

    public static void test15(int a, int b){
       if (a % 2 ==0 && b % 2==0){
           System.out.println("둘 다 짝수");
       }
       else if (a % 2 !=0 && b%2 !=0 ) {
           System.out.println("둘 다 홀수");
       }

       else {
           System.out.println("하나만 짝수");
       }
    }
}
