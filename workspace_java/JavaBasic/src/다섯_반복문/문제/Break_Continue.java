package 다섯_반복문.문제;

public class Break_Continue {
    public static void main(String[] args) {

    // 반목문(while, for)에서의 break 역할
    // break 문을 만나면 가장 가까이에 있는 반복문을 벗어남
        for(int i = 1; i < 11; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);

        }

        System.out.println();


    // 반목문(while, for)에서의 continue 역할
    // continue를 만나는 순간 반복문의 끝으로 이동한다.
        for(int i = 1; i < 11; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);


        }

    }
}
