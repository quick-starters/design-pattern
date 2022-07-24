package _12_combined_pattern._06_add_observer;

import java.util.Iterator;
import java.util.*;

public class Flock implements Quackable {
	List<Quackable> ducks = new ArrayList<Quackable>();

	public void add(Quackable duck) {
		ducks.add(duck);
	}

	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}

	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	public void notifyObservers() { }
}
