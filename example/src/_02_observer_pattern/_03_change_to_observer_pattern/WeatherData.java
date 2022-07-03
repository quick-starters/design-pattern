package _02_observer_pattern._03_change_to_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature; // 온도
  private float humidity; // 습도
  private float pressure; // 기압

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  /**
   * 옵저버들한테 상태변화 알려주기
   */
  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  /**
   * 기상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알림
   */
  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  // 기타 WeatherData 메소드
}
