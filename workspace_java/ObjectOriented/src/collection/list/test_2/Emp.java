package collection.list.test_2;

import java.security.PublicKey;

public class Emp {
    private int empNo;
    private String name;
    private String dept;
    private String tel;
    private int money;

    public Emp(int empNo, String name, String dept, String tel, int money) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
        this.money = money;

    }

    public int getEmpNo(){
        return empNo;
    }

    //사원의 연락처 마지막 4자리 값 리턴
    public String getPw(){
        return tel.substring( 5);
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
