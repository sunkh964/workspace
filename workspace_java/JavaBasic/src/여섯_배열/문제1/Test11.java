package 여섯_배열.문제1;

public class Test11 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int even = 0;

        for (int e : arr){
            if (e % 2 ==0){
                even++;
            }
        }
        System.out.println(even);


/*        int even = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                even = even +1;
            }
        }
        System.out.println(even);
*/
    }



}
