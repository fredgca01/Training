package language;


//Create a class CreditCard that represents a credit card account.
//You need to construct a new credit card with a 0.0 balance. 

//The constructor will have this header:
//public CreditCard()
//
//CreditCard will have these methods:
//public void purchase(double amount)
//public void payment(double amount)
//public double getBalance()

//As a starting point, implement:
//the constructor
//instance variable, balance, which is a double.

/**
A credit card has a balance that can be changed by
purchases and payments.
*/
public class CreditCard {
	
	// private instance variable goes here
	private double balance;
	
	/**
	   Constructs a credit card with a zero balance.
	*/
	public CreditCard() {
	     // TODO: set the balance to 0
		balance=0.0;
	}
	
	/**
	   Returns the credit card balance
	*/
	public double getBalance() {
	    return balance;
	} 
	
	public void purchase(double amount){
		if (amount>balance){
			System.out.println("ERROR");
		}
		else {
			balance=balance-amount;
		}
	}
	
	public void payment(double amount){
		if(amount<=0){
			System.out.println("ERROR");
		}
		else {
			balance=balance+amount;
		}
	}
}



