package _12_combined_pattern._04_add_factory;

import _12_combined_pattern._01_duck.DuckCall;
import _12_combined_pattern._01_duck.MallardDuck;
import _12_combined_pattern._01_duck.Quackable;
import _12_combined_pattern._01_duck.RedheadDuck;
import _12_combined_pattern._01_duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	public Quackable createDuckCall() {
		return new DuckCall();
	}

	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
