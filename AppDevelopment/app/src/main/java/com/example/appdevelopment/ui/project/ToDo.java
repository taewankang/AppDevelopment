package com.example.appdevelopment.ui.project;

public class ToDo {
    private int year, month, day, hour, min, meeting; //location은 보낸준 값에서 순서번째를 저장
    private String noon, memo, location;    //오전, 오후
    public ToDo(int year, int month, int day, int hour, int min, String location, String noon, String memo, int meeting){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
        this.location = location;
        this.noon = noon;
        this.memo = memo;
        this.meeting = meeting;
    }

    public void set_year(int year){this.year = year;}
    public void set_month(int month){this.month = month;}
    public void set_day(int day){this.day = day;}
    public void set_location(String location){this.location = location;}
    public void set_hour(int hour){this.hour = hour; }
    public void set_min(int min){this.min = min;}
    public void set_noon(String noon){this.noon = noon;}
    public void set_memo(String memo){this.memo = memo;}
    public void set_meeting(int meeting){this.meeting = meeting;}

    public int get_year(){return year;}
    public int get_month(){return month;}
    public int get_day(){return day;}
    public int get_hour(){return hour;}
    public int get_min(){return min;}
    public String get_location(){return location;}
    public String get_noon(){return noon;}
    public String get_memo(){return memo;}
    public int get_meeting(){return meeting;}
}
