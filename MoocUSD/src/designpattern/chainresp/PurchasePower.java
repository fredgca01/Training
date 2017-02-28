package designpattern.chainresp;


/**
 * The pattern chains the receiving objects together, and then passes any request messages from object 
 * to object until it reaches an object capable of handling the message. 
 * The number and type of handler objects isn't known a priori, they can be configured dynamically. 
 * The chaining mechanism uses recursive composition to allow an unlimited number of handlers to be linked.
 * Chain of Responsibility simplifies object interconnections. Instead of senders and receivers maintaining 
 * references to all candidate receivers, each sender keeps a single reference to the head of the chain, 
 * and each receiver keeps a single reference to its immediate successor in the chain.
 *
 */
public abstract class PurchasePower {
	protected static final double BASE = 500;
    protected PurchasePower successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request){
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
