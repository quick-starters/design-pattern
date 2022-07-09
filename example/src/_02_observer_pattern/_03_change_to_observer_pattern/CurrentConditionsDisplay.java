package _02_observer_pattern._03_change_to_observer_pattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature; // 온도
  private float humidity; // 습도
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
  }
}
