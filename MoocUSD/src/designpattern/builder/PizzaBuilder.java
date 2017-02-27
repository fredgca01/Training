package designpattern.builder;

/**
 * Builder
 * 
 *  Séparer la construction d'un objet complexe de sa représentation.
 *  Permettre d'obtenir des représentations différentes avec le même procédé de construction
 *   Le système doit instancier des objets complexes. Ces objets complexes peuvent avoir des représentations différentes. 
 *
 */
public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() { 
		return pizza; 
	}
	public void createNewPizzaProduct() { 
		pizza = new Pizza(); 
	}

	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
