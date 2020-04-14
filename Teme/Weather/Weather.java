package com.java.training.d02.Teme.Weather;

public class Weather {
    private String location;
    private int temperature;
    private double humidity;
    private double atmosphericPressure;
    private double wind;

    public Weather() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(double atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public void display(){
        System.out.println("In " + getLocation() + " vom avea " + getTemperature() + " grade C, o umiditate de " + getHumidity() +
                " % si o presiune atmosferica de " + getAtmosphericPressure() + " hPa. Vantul va bate cu " + getWind() + " km/h.");
    }
}
