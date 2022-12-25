package main.java.weatherApp;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setWeatherConditions(80, 65, 30.4f);
        weatherData.setWeatherConditions(82, 70, 29.2f);
        weatherData.setWeatherConditions(78, 90, 29.2f);
    }
}
