package 다섯_반복문.While;

public class Test9 {
    public static void main(String[] args) {

/*    // 1~5까지의 합 구하기
        int i = 1 ;
        int sum = 0;

        while (i < 6){
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
*/

        int i = 1;
        int sum = 0;
        while (i < 11){
            sum = sum + i;  // sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
