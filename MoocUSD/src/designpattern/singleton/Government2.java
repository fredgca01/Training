package designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * the JVM does not load the SingletonSampleHolder at startup because there is no static reference 
 * of this class anywhere in the code, the instance is not created until the first call of the 
 * getInstance() method.
 *
 */
public class Government2 {
	private List<String> ministers = new ArrayList<String>();
	
	private Government2() {}
	
	public static Government2 election() {
		return Government2Holder.INSTANCE;
	}
	
	public synchronized void addMinister(String name) {
		ministers.add(name);
	}
	
	public synchronized List getGovernment() {
		return ministers;
	}
	
	private static class Government2Holder {
		private static final Government2 INSTANCE = new Government2();
	}
	 
	 
}
