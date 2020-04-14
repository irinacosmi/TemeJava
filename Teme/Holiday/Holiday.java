package com.java.training.d02.Teme.Holiday;


public class Holiday {
    private  String name;
    private String date;
    private String country;
    private String daysOff;

    public Holiday() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(String daysOff) {
        this.daysOff = daysOff;
    }

    public void display(){
        System.out.println(getName() + " is a holiday that takes place on " + getDate() + " in " + getCountry() + " " + getDaysOff() + " days off.");
    }
}
