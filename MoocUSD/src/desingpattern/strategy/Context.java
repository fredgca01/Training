package desingpattern.strategy;

public class Context {
	private Strategy strategy;
	
	public void setNewCustStrategy() {
	    this.strategy = new StrategyNewcustomer();
	}

	public void setfidelityStrategy() {
	    this.strategy = new ConcreteStrategyFidelity();
	}

	public void setBirthdayStrategy() {
	    this.strategy = new ConcreteStrategyCustBirthday();
	}

	public double executeStrategy(double a, double b) {
	    return strategy.execute(a, b);
	}
}
