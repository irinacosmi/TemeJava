package com.java.training.d02.Teme.City;

public class ImmutableCity {
    private String county;
    private String country;
    private String cityName;
    private int inhabitants;

    public ImmutableCity(String county, String country, String cityName, int inhabitants) {
        this.county = county;
        this.country = country;
        this.cityName = cityName;
        this.inhabitants = inhabitants;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void displayCity(){
        System.out.println(getCityName() + " is a city in " + getCountry() + ", " + getCounty() + " and has " + getInhabitants() + " citizens.");
    }
}
