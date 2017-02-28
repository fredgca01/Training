package designpattern;

import java.util.Random;

import designpattern.builder.HawaiianPizzaBuilder;
import designpattern.builder.Pizza;
import designpattern.builder.PizzaBuilder;
import designpattern.builder.SpicyPizzaBuilder;
import designpattern.builder.Waiter;
import designpattern.chainresp.DirectorPP;
import designpattern.chainresp.ManagerPP;
import designpattern.chainresp.PresidentPP;
import designpattern.chainresp.PurchaseRequest;
import designpattern.factory.Logger;
import designpattern.factory.SysoLoggerCreator;
import designpattern.observer.Cabine;
import designpattern.observer.Capteur;
import designpattern.observer.Moteur;
import designpattern.singleton.Government;
import designpattern.singleton.Government2;
import designpattern.state.DeadState;
import designpattern.state.GameContext;
import designpattern.state.HealthyState;
import designpattern.state.SurvivalState;
import designpattern.strategy.Sales;

public class Mainclass {

	public static void main(String[] args) {
		testObserver();
	}
	
	public static void testObserver() {
		Cabine instanceCabine = new Cabine();
        Moteur instanceMoteur = new Moteur();
        Capteur capteurEtage = new Capteur();
        capteurEtage.ajouterObservateur(instanceCabine);
        capteurEtage.ajouterObservateur(instanceMoteur);

        // On simule manuellement une variation (normalement c'est le thread qui s'en charge)
        capteurEtage.notifierObservateurs();
        // La cabine et le moteur ont reçu une notification sur leur méthode notifier()
        
        capteurEtage.supprimerObservateur(instanceMoteur);
        System.out.println("Suppression du moteur dans les abonnes");
        capteurEtage.notifierObservateurs();
	}
	
	public static void testState() {
		GameContext context = new GameContext();

		context.setState(new HealthyState());
		context.gameAction();
		System.out.println("*****");

		context.setState(new SurvivalState());
		context.gameAction();
		System.out.println("*****");

		context.setState(new DeadState());
		context.gameAction();
		System.out.println("*****");
	}
	
	
	public static void testChainOfResp() {
		ManagerPP manager = new ManagerPP();
        DirectorPP director = new DirectorPP();
        PresidentPP president = new PresidentPP();
        manager.setSuccessor(director);
        director.setSuccessor(president);

        Double amount = 750.0;
        manager.processRequest(new PurchaseRequest(amount, "General"));
        amount = 7500.0;
        manager.processRequest(new PurchaseRequest(amount, "General"));
        amount = 75000.0;
        manager.processRequest(new PurchaseRequest(amount, "General"));

	}
	
	public static void testBuilder() {
		Waiter waiter = new Waiter();
	    PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
	    PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

	    waiter.setPizzaBuilder( hawaiian_pizzabuilder );
	    waiter.constructPizza();

	    Pizza pizza = waiter.getPizza();
	    pizza.printRecipe();
	    
	    waiter.setPizzaBuilder( spicy_pizzabuilder );
	    waiter.constructPizza();

	    pizza = waiter.getPizza();
	    pizza.printRecipe();
	}
	
	public static void testStrategy() {
		int priceA = 12;
		int fidelity = 3;
		Sales deal = new Sales();
		deal.setBirthdayPlan();
		deal.doTheDeal(priceA, fidelity);
		deal.setFidelityPlan();;
		deal.doTheDeal(priceA, fidelity);
		deal.setPricingPlan();
		deal.doTheDeal(priceA, fidelity);
		
	}
	
	/**
	 * Define an interface for creating an object, but let subclasses decide which class to instantiate. 
	 * Factory Method lets a class defer instantiation to subclasses.
	 */
	public static void testFactory(){
		//for the purposes of this example, create an SysoLoggerCreator directly, 
		//but this would normally be passed to constructor for use.
		SysoLoggerCreator logFactory = new SysoLoggerCreator();
		Logger log = logFactory.createLogger();
		log.log("Test de factory");
	}
	
	/**
	 * Ensure a class has only one instance, and provide a global point of access to it.
	 */
	public static void testSingleton() {

		 for(int i=0; i<10; i++){
		      new Thread("" + i){
		        public void run(){
		          try {
					sleep(new Random().nextInt(10));
		          } catch (InterruptedException e) {
		        	  // TODO Auto-generated catch block
		        	  e.printStackTrace();
		          }
		          
		          Government.election().addMinister("min "+new Random().nextInt(10));
		          System.out.println("Thread: " + getName() + " running; count: "+Government.election().getGovernment());
		        }
		      }.start();
		    }
		 
		 // using SingletonHolder pattern
		 for(int i=0; i<10; i++){
		      new Thread("" + i){
		        public void run(){
		          try {
					sleep(new Random().nextInt(10));
		          } catch (InterruptedException e) {
		        	  // TODO Auto-generated catch block
		        	  e.printStackTrace();
		          }
		          
		          Government2.election().addMinister("min "+new Random().nextInt(10));
		          System.out.println("Thread: " + getName() + " running; count: "+Government2.election().getGovernment());
		        }
		      }.start();
		    }
	}

}
