package 여섯_배열.문제2;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
        }

        System.out.println(Arrays.toString(lotto));


    }
}
