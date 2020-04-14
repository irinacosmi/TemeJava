package com.java.training.d02.Teme.CoronaVirus;

    public class ImmutableCoronaVirus {
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
    private final String country;

    private final String city;

    private final int numberOfIllnesses;

    private final int numberOfHeals;

    public static int numberOfCities = 0;

    public ImmutableCoronaVirus(String country, String city, int numberOfIllnesses, int numberOfHeals) {
        this.country = country;
        this.city = city;
        this.numberOfIllnesses = numberOfIllnesses;
        this.numberOfHeals = numberOfHeals;
        ImmutableCoronaVirus.numberOfCities ++;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getNumberOfIllnesses() {
        return numberOfIllnesses;
    }

    public int getNumberOfHeals() {
        return numberOfHeals;
    }

        public void display(){
            System.out.println(country + "\t " + city + "\t " + numberOfIllnesses + "\t " + numberOfHeals);

        }

    public static void getNumbers(){
        System.out.println("Number of Cities is: " + ImmutableCoronaVirus.numberOfCities);
    }
}
