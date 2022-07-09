package _02_observer_pattern._03_change_to_observer_pattern;

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}
