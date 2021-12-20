package com.example.dormitoryapp.kezekshilik.ui.keshigip.recyclerview;

public class LateStudent {

    private String name;
    private String group;
    private String lateMinute;

    public LateStudent(String name, String group, String lateMinute) {

        this.name = name;
        this.group = group;
        this.lateMinute = lateMinute;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getlateMinute() {
        return this.lateMinute;
    }

    public void setlateMinute(String lateMinute) {
        this.lateMinute = lateMinute;
    }

}