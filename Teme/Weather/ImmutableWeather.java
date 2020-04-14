package com.java.training.d02.Teme.Weather;

public class ImmutableWeather {
    private final String location;
    private final int temperature;
    private final double humidity;
    private final double atmosphericPressure;
    private final double wind;

    public ImmutableWeather(String location, int temperature, double humidity, double atmosphericPressure, double wind) {
        this.location = location;
        this.temperature = temperature;
        this.humidity = humidity;
        this.atmosphericPressure = atmosphericPressure;
        this.wind = wind;
    }

    public String getLocation() {
        return location;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public double getWind() {
        return wind;
    }

    public void display(){
        System.out.println("In " + getLocation() + " vom avea " + getTemperature() + " grade C, o umiditate de " + getHumidity() +
                " % si o presiune atmosferica de " + getAtmosphericPressure() + " hPa. Vantul va bate cu " + getWind() + " km/h.");
    }
}
