package general;

public class CompoundInterest {
	
	public static void main(String[] args) {
		calculate(260000, 5000, 5.7, 18,0.6);
		calculate(1000, 1000, 5, 15,1);
	}
	
	public static void calculate(double principal, double income, double rate, int years, double taxes) {
		double amount=principal;
		for(int x = 1; x <= years; x++) {
			double result = (amount * Math.pow((1+rate/100), 1));
	        
			//Taxes
	        result = (result - amount) * taxes;
	        amount = amount + result;
	        
	        //adding yearly income
	        amount = amount + income;
	    }
		System.out.println(amount);
	}
}
