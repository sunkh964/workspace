package com.green.DataPractice.vo;

import java.util.Arrays;

public class ScoreVo {
    private String name;
    private String grade;
    private String[] tel;
    private String gender;
    private int korean;
    private int english;
    private int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String[] getTel() {
        return tel;
    }

    public void setTel(String[] tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "ScoreVo{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", tel=" + Arrays.toString(tel) +
                ", gender='" + gender + '\'' +
                ", korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }
}
