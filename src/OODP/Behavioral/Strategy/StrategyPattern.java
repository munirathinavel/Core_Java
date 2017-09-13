package OODP.Behavioral.Strategy;

// Strategy
interface Strategy {
	void climb();
}

// Strategy-1
class Walk implements Strategy {
	@Override
	public void climb() {
		System.out.println("Walking fast to climb the hill");
	}
}

// Strategy-2
class RopeCar implements Strategy {
	@Override
	public void climb() {
		System.out.println("Using TopeCar to climb the hill");
	}
}

// Strategy-3
class Bus implements Strategy {
	@Override
	public void climb() {
		System.out.println("Using Bus to climb the hill");
	}
}

// Context
class Trekking {
	Strategy strategy;

	void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	void climbHill() {
		this.strategy.climb();
	}
}

public class StrategyPattern {

	public static void main(String[] args) {
		Trekking vel = new Trekking();

		Strategy bus = new Bus();
		Strategy car = new RopeCar();
		Strategy walk = new Walk();

		vel.setStrategy(walk);

		vel.climbHill();

		Trekking gomathi = new Trekking();
		gomathi.setStrategy(bus);
		gomathi.climbHill();
	}
}
