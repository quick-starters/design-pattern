package _02_observer_pattern._03_change_to_observer_pattern;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//    ForecastDisply statisticsDisplay = new ForecastDisply(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f); // 새로운 기상 측정값
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
