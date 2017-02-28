package designpattern.chainresp;

public class PresidentPP extends PurchasePower {

	@Override
	protected double getAllowable() {
        return BASE * 10000;
    }

	@Override
    protected String getRole() {
        return "President";
    }
}
