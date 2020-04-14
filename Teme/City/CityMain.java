package com.java.training.d02.Teme.City;

public class CityMain {
    public static void main(String[] args) {
        City city = new City();
        city.setCountry("Romania");
        city.setCounty("Timis");
        city.setCityName("Timisoara");
        city.setInhabitants(468000);

        City city1 = new City();
        city1.setCountry("UK");
        city1.setCounty("Greater London");
        city1.setCityName("London");
        city1.setInhabitants(8900000);


        ImmutableCity immutableCity = new ImmutableCity("Germany", "Bayern", "Munchen", 13000000);

        city.displayCity();
        city1.displayCity();
        immutableCity.displayCity();
    }
}
