package com.java.training.d02.Teme.City;

public class City {

    private String county;
    private String country;
    private String cityName;
    private int inhabitants;

    public City() {
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void displayCity(){
        System.out.println(getCityName() + " is a city in " + getCountry() + ", " + getCounty() + " and has " + getInhabitants() + " citizens.");
    }
}
