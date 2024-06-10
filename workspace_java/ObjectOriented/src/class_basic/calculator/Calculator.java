package class_basic.calculator;

public class Calculator {

    private int calNum1;
    private int calNum2;

    //calNum1, calNum2 값을 변경하는 메서드
    public void setNumber(int calNum1, int calNum2){
        this.calNum1 = calNum1;
        this.calNum2 = calNum2;
    }


    public int getPlus(){
        return calNum1 + calNum2;
    }

    public int getMinus(){
        return calNum1-calNum2;
    }

    public double getDiv(){
        return (double)calNum1 / calNum2;
    }

    public int getMulti(){
        return calNum1 * calNum2;
    }


}
