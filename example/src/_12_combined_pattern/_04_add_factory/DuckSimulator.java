package _12_combined_pattern._04_add_factory;

import _12_combined_pattern._01_duck.Quackable;
import _12_combined_pattern._02_add_adapter.Goose;
import _12_combined_pattern._02_add_adapter.GooseAdapter;
import _12_combined_pattern._03_add_decorator.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\n오리 시뮬레이션 게임 (+추상 팩토리)");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("오리가 소리 낸 횟수: " +
		                   QuackCounter.getQuacks() +
		                   " 번");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
