package _12_combined_pattern._06_add_observer;

public class MallardDuck implements Quackable {
	Observable observable;

	public MallardDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("꽥꽥");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
}
