package 다섯_반복문.For;

public class For_1 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 11){
//            System.out.println(i);
//            i++;
//        }


/* 해석 순서
   for ( 1 ; 2 ; 3){
        System.out. println(4);
    }

    : 1 2 4 3
      2 4 3
      2 4 3
      2
* */

//        for (int i = 1; i < 11; i++){
//            System.out.println(i);
//        }

    // 1~10까지의 합
        int sum = 0;
        for (int i = 1; i<11; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
