package 다섯_반복문.While;

public class Test13 {
    public static void main(String[] args) {

        int i = 1;
        int cnt = 0;

        while (i < 101){
            if (i % 5 == 0){
                System.out.print(i + " ");
                cnt++;
            }
            i++;
        }
        System.out.println();
        System.out.println("5의 배수의 개수 : " + cnt);

    }
}
