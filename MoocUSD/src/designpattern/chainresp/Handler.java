package designpattern.chainresp;

import java.util.Random;

public class Handler {
	private static Random randomData = new Random();
    private static int next = 1;
    
    private int id = next++;
    private Handler nextHandler;

    public void add(Handler next) {
        if (nextHandler == null)
        	nextHandler = next;
        else
        	nextHandler.add(next);
    }
    public void wrap_around(Handler root) {
        if (nextHandler == null)
        	nextHandler = root;
        else
        	nextHandler.wrap_around(root);
    }
    public void handle(int num) {
        if (randomData.nextInt(4) != 0) {
            System.out.print(id + "-busy  ");
            nextHandler.handle(num);
        }
        else
          System.out.println(id + "-handled-" + num);
    }
}
