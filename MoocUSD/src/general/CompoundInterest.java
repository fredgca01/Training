package general;

import java.text.DecimalFormat;

public class CompoundInterest {
	
	public static void main(String[] args) {
		calculate(260000, 5000, 6, 18,0.85);
		calculate(1000, 1000, 6, 16,0.85);
	}
	
	public static void calculate(double principal, double income, double rate, int years, double taxes) {
		double amount=principal;
		String pattern = "###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		
		for(int x = 1; x <= years; x++) {
			double result = amount * rate/100;
			//Taxes
	        result = result * taxes;
	        
	        amount = amount + result;
	        
	        //adding yearly income
	        amount = amount + income;
	    }
		//Taxe prelevement lib de 7.5%
		System.out.println(decimalFormat.format(amount - amount*0.075));
	}
}
