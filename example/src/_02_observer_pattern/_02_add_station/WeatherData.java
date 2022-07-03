package _02_observer_pattern._02_add_station;

public class WeatherData {

  private float temperature; // 온도
  private float humidity; // 습도
  private float pressure; // 기압

  private final Display currentConditionsDisplay;
  private final Display statisticsDisplay;
  private final Display forecastDisplay;

  public WeatherData() {
    this.currentConditionsDisplay = new CurrentConditionsDisplay();
    this.statisticsDisplay = new StatisticsDisplay();
    this.forecastDisplay = new ForecastDisplay();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  /**
   * 기상 관측값이 갱신될 때마다 이 메서드가 호출됩니다.
   */
  public void measurementsChanged() {
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    // 최신 측정값 전달하면서 각 디스플레이 갱신
    currentConditionsDisplay.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure);
    forecastDisplay.update(temp, humidity, pressure);
  }
}
