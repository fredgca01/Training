package concurrent;

public class Counter {
	
	protected long count = 0;

    public synchronized long add(long value){
    		this.count = this.count + value;
    		return this.count;
    }
    
    public synchronized long getCount(){
		return this.count;
    }
}
