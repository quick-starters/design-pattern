package _12_combined_pattern._06_add_observer;

public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("삑삑");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
}
