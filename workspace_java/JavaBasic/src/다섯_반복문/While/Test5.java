package 다섯_반복문.While;

/*
   - 출력문을 한번만 사용하여 '2 4 6 8 10'을 추력하되, while문을 사용하여라.
    1번 방법
    : 밑에 그대로

    2번 방법
    int i = 2;

    while(i < 11){
       if(i % 2 == 0){
            System.out.print(i + " ");
       }
       i++;
    }
*/

public class Test5 {
    public static void main(String[] args) {

        int i = 2;

        while (i <= 10){
            System.out.println(i);
            i = i + 2;
        }
    }
}
