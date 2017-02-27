package desingpattern.strategy;

public class ConcreteStrategyCustBirthday implements Strategy {

	@Override
	public double execute(double a, double b) {
		return a-(a*0.1);
	}

}
