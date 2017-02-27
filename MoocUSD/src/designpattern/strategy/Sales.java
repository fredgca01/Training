package designpattern.strategy;

public class Sales {
	Context promotioncalculator = new Context();
	
	public void doTheDeal(double price, double clientsince) {
		double totalPrice = promotioncalculator.executeStrategy(price, clientsince);
		System.out.println(totalPrice);
	}
	
	public void setPricingPlan() {
		promotioncalculator.setNewCustStrategy();
	}
	
	public void setFidelityPlan() {
		promotioncalculator.setfidelityStrategy();
	}
	
	public void setBirthdayPlan() {
		promotioncalculator.setBirthdayStrategy();
	}
}
