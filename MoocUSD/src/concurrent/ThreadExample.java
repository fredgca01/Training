package concurrent;

import java.util.Random;

public class ThreadExample {

	  public static void main(String[] args){
	    System.out.println(Thread.currentThread().getName()+"\n");
	    
	    
	    Counter object = new Counter();
	    
	    for(int i=0; i<10; i++){
	      new Thread("" + i){
	        public void run(){
	          try {
				sleep(new Random().nextInt(10));
	          } catch (InterruptedException e) {
	        	  // TODO Auto-generated catch block
	        	  e.printStackTrace();
	          }
	          
	          long data = object.add(1);
	          System.out.println("Thread: " + getName() + " running; count: "+object.getCount()+"; local count: "+data);
	        }
	      }.start();
	    }
	  }
}
