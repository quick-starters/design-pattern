package _02_observer_pattern._05_change_to_pull;

public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure = 29.92f;
  private float lastPressure;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    lastPressure = currentPressure;
    currentPressure = weatherData.getPressure();
    display();
  }

  @Override
  public void display() {
    System.out.println("이전 기압: " + lastPressure + ", 현재 기압: " + currentPressure);
  }
}
