package com.example.mobile.worldclock;

public class WorldClockClass {
    String country, noon, hour, min;
    public WorldClockClass(){ }

    public void setCountry(String country){this.country = country;}
    public void setNoon(String noon){this.noon = noon;}
    public void setHour(String hour){this.hour = hour;}
    public void setMin(String min){this.min = min;}

    public String getCountry(){return country;}
    public String getNoon(){return noon;}
    public String getHour(){return hour;}
    public String getMin(){return min;}
}
