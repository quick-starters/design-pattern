package _12_combined_pattern._03_add_decorator;

import _12_combined_pattern._01_duck.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;

	public QuackCounter (Quackable duck) {
		this.duck = duck;
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}
}
