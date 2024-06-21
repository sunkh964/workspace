package com.green.DataPractice.vo;

public class DeliveryVo {
    // 배달정보 (두번째 페이지)

    private String name;
    private String number;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "DeliveryVo{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
