package _12_combined_pattern._05_add_composite;

import _12_combined_pattern._01_duck.Quackable;
import _12_combined_pattern._02_add_adapter.Goose;
import _12_combined_pattern._02_add_adapter.GooseAdapter;
import _12_combined_pattern._03_add_decorator.QuackCounter;
import _12_combined_pattern._04_add_factory.AbstractDuckFactory;
import _12_combined_pattern._04_add_factory.CountingDuckFactory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Composite - Flocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
		simulate(flockOfDucks);

		System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
		simulate(flockOfMallards);

		System.out.println("\n오리가 소리 낸 횟수: " +
		                   QuackCounter.getQuacks() +
		                   " 번");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
