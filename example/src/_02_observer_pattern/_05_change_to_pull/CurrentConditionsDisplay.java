package _02_observer_pattern._05_change_to_pull;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature; // 온도
  private float humidity; // 습도
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
  }
}
