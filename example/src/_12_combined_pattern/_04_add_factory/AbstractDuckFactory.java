package _12_combined_pattern._04_add_factory;

import _12_combined_pattern._01_duck.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
