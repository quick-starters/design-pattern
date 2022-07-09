package _02_observer_pattern._01_before;

public class WeatherData {

  private float temperature; // 온도
  private float humidity; // 습도
  private float pressure; // 기압

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
    // 이 메서드를 업데이트 해보자!
  }
}
