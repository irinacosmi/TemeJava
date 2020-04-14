package com.java.training.d02.Teme.Country;

public class ImmutableCountry {
    private String name;
    private int numberCounties;
    private int citizens;
    private String formGovernment;
    private int gdp;

    public ImmutableCountry(String name, int numberCounties, int citizens, String formGovernment, int gdp) {
        this.name = name;
        this.numberCounties = numberCounties;
        this.citizens = citizens;
        this.formGovernment = formGovernment;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public int getNumberCounties() {
        return numberCounties;
    }

    public int getCitizens() {
        return citizens;
    }

    public String getFormGovernment() {
        return formGovernment;
    }

    public int getGdp() {
        return gdp;
    }

    public void display(){
        System.out.println(getName() + " is a " + getFormGovernment() + " and has " + getNumberCounties() + " conties, " + getCitizens() + " inhabitants, and " + getGdp() + " dolars PIB per capita." );
    }
}
