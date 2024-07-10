package test.Test1;

public class Calculate {
    int num1 = 4;
    int num2 = 14;

    public void setNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum(){
        return num1 + num2;
    }

    public int getMax(){
        int max = 0;
        if (num1>num2){
            max = num1;
        }
        else {
            max = num2;
        }
        return max;
    }
    // 클래스가 가진 두 정수 사이에 존재하는 정수들의 평균을 리턴(클래스가 가진 두 정수는 범위에서 제외)

    public double getAvg(){
        int[] getNum = new int[num2-num1-1];
        int sum = 0;
        double avg;
            for (int i = 0; i < getNum.length; i++){
                getNum[i] = num1+i +1;
                sum = sum + getNum[i];
            }
            avg = (double)sum / getNum.length;
        return avg;
    }

}
