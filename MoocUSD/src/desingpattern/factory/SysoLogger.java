package desingpattern.factory;

//concrete implementation of the Logger (Product)
public class SysoLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("log via syso: "+message);
	}
}
