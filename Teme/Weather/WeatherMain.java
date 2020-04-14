package com.java.training.d02.Teme.Weather;

public class WeatherMain {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setLocation("Timisoara");
        weather.setTemperature(5);
        weather.setHumidity(58.2);
        weather.setAtmosphericPressure(1024);
        weather.setWind(10);


        ImmutableWeather immutableWeather = new ImmutableWeather("Madrid", 14, 40, 768.81, 5.7);
        ImmutableWeather immutableWeather1 = new ImmutableWeather("Seul", 16, 56, 1124, 10.2);

        weather.display();
        immutableWeather.display();
        immutableWeather1.display();
    }
}
