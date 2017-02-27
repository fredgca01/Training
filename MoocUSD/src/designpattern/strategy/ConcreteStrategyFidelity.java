package designpattern.strategy;

public class ConcreteStrategyFidelity implements Strategy {

	@Override
	public double execute(double a, double b) {
		return a- (a*b);
	}

}
