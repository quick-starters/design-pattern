package _02_observer_pattern._02_add_station;

public interface Display {
  void update(float temp, float humidity, float pressure);
}
