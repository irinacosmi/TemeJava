package com.java.training.d02.Teme.Holiday;


public class ImmutableHoliday {
    private final String name;
    private final String date;
    private final String country;
    private final String daysOff;

    public ImmutableHoliday(String name, String date, String country, String daysOff) {
        this.name = name;
        this.date = date;
        this.country = country;
        this.daysOff = daysOff;

         }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public String getDaysOff() {
        return daysOff;
    }

    public void display(){
        System.out.println(getName() + " is a holiday that takes place on " + getDate() + " in " + getCountry() + " " + getDaysOff() + " days off.");
    }
}
