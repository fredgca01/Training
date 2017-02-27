package desingpattern.strategy;


/**
 *  Définir une famille d'algorithmes interchangeables. Permettre de les changer indépendamment de la partie cliente. 
 *  Un objet doit pouvoir faire varier une partie de son algorithme. Cela peut être une liste triée. A chaque insertion, 
 *  la liste place le nouvel élément à l'emplacement correspondant au tri. Le tri peut être alphabétique, inverse, les majuscules 
 *  avant les minuscules, les minuscules avant, etc... La partie de l'algorithme qui varie (le tri) est la stratégie. 
 *  Toutes les stratégies présentent la même interface. La classe utilisant la stratégie (la liste) délègue la partie 
 *  de traitement concernée à la stratégie. 
 */
public interface Strategy {
	public double execute(double a, double b);
}
