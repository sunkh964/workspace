package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVo {
    //주문정보(첫번째 페이지)

    private String Kind;
    private int chicNumber;
    private String[] option;
    private String service;

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public int getChicNumber() {
        return chicNumber;
    }

    public void setChicNumber(int chicNumber) {
        this.chicNumber = chicNumber;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "Kind='" + Kind + '\'' +
                ", chicNumber=" + chicNumber +
                ", option=" + Arrays.toString(option) +
                ", service='" + service + '\'' +
                '}';
    }
}
