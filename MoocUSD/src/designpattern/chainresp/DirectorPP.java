package designpattern.chainresp;

public class DirectorPP extends PurchasePower {

	@Override
	protected double getAllowable() {
        return BASE * 20;
    }

	@Override
    protected String getRole() {
        return "Director";
    }

}
