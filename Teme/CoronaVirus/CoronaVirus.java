package com.java.training.d02.Teme.CoronaVirus;

public class CoronaVirus {
    private static final String COUNTRY;
    private static final String CITY;
    private static final String ILLNESSES;
    private static final String HEALS;

    static {
        COUNTRY = "Country";
        CITY = "City";
        ILLNESSES ="NrOfIll";
        HEALS = "NrOfHls";


        System.out.println(COUNTRY + "\t "+ CITY + "\t " +ILLNESSES + "\t " + HEALS);
    }
    private String country;

    private String city;

    private int numberOfIllnesses;

    private int numberOfHeals;

    public static int numberOfCities = 0;


    public CoronaVirus() {
        CoronaVirus.numberOfCities ++;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfIllnesses() {
        return numberOfIllnesses;
    }

    public void setNumberOfIllnesses(int numberOfIllnesses) {
        this.numberOfIllnesses = numberOfIllnesses;
    }

    public int getNumberOfHeals() {
        return numberOfHeals;
    }

    public void setNumberOfHeals(int numberOfHeals) {
        this.numberOfHeals = numberOfHeals;
    }

    public void displayCoronaVirus(){

        System.out.println(getCountry()+ "\t " + getCity() + "\t " + getNumberOfIllnesses() + "\t " + getNumberOfHeals());

      }

    public static void getNumbers(){

        System.out.println("Number of Cities is: " + CoronaVirus.numberOfCities);
    }


}
