package designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 	Restreindre le nombre d'instances d'une classe à une et une seule. Fournir une méthode pour accéder à cette instance unique.
 *  La classe ne doit avoir qu'une seule instance. Cela peut être le cas d'une ressource système par exemple. 
 *  La classe empêche d'autres classes de l'instancier. Elle possède la seule instance d'elle-même et fournit 
 *  la seule méthode permettant d'accéder à cette instance.  
 *
 */
public class Government {
	private static Government instance=null;
	private List<String> ministers = new ArrayList<String>();
	
	private Government() {}
	
	public synchronized static Government election() {
		if (instance==null) {
			instance = new Government();
		}
		return instance;
	}
	
	public synchronized void addMinister(String name) {
		ministers.add(name);
	}
	
	public synchronized List getGovernment() {
		return ministers;
	}
}
