package _12_combined_pattern._03_add_decorator;

import _12_combined_pattern._01_duck.DuckCall;
import _12_combined_pattern._01_duck.MallardDuck;
import _12_combined_pattern._01_duck.Quackable;
import _12_combined_pattern._01_duck.RedheadDuck;
import _12_combined_pattern._01_duck.RubberDuck;
import _12_combined_pattern._02_add_adapter.Goose;
import _12_combined_pattern._02_add_adapter.GooseAdapter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\n오리 시뮬레이션 게임 (+데코레이터)");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("오리가 소리 낸 횟수: " +
				QuackCounter.getQuacks() + " 번");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
