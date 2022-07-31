package _12_combined_pattern._06_add_observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
