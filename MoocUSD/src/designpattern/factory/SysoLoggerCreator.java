package designpattern.factory;

//ConcreteCreator
public class SysoLoggerCreator extends LoggerCreator {

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		SysoLogger logger = new SysoLogger();
		return logger;
	}

}
