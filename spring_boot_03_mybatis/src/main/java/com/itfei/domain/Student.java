package com.itfei.domain;

public class Student {
    private int stu_id;
    private String stu_name;
    private String stu_gender;
    private int stu_age;
    private String stu_phone;

    public Student() {
    }

    public Student(int stu_id, String stu_name, String stu_gender, int stu_age, String stu_phone) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_gender = stu_gender;
        this.stu_age = stu_age;
        this.stu_phone = stu_phone;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(String stu_gender) {
        this.stu_gender = stu_gender;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_address() {
        return stu_phone;
    }

    public void setStu_address(String stu_phone) {
        this.stu_phone = stu_phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_gender='" + stu_gender + '\'' +
                ", stu_age=" + stu_age +
                ", stu_phone='" + stu_phone + '\'' +
                '}';
    }
}
