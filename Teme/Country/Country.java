package com.java.training.d02.Teme.Country;

public class Country {
    private String name;
    private int numberCounties;
    private int citizens;
    private String formGovernment;
    private int gdp;


    Country(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCounties() {
        return numberCounties;
    }

    public void setNumberCounties(int numberCounties) {
        this.numberCounties = numberCounties;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    public String getFormGovernment() {
        return formGovernment;
    }

    public void setFormGovernment(String formGovernment) {
        this.formGovernment = formGovernment;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public void display(){
        System.out.println(getName() + " is a " + getFormGovernment() + " and has " + getNumberCounties() + " conties, " + getCitizens() + " inhabitants, and " + getGdp() + " dolars PIB per capita." );
    }
}
