package designpattern.observer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Observable {
	
    private List<Observer> m_observateurs;
	
    public Observable() {
        m_observateurs = new LinkedList<Observer>();
    }

    public void notifierObservateurs() {
       Iterator<Observer> it = m_observateurs.iterator();
        // Notifier tous les observers
       while(it.hasNext()){
           Observer obs = it.next();
           obs.notifier();
       }
    }

    public void ajouterObservateur(Observer observateur) {
        // On ajoute un abonné à la liste en le plaçant en premier (implémenté en pull).
    	// On pourrait placer cet observateur en dernier (implémenté en push, plus commun).
        m_observateurs.add(observateur);
    }

    public void supprimerObservateur(Observer observateur){
        // Enlever un abonné a la liste
        m_observateurs.remove(observateur);
    }

}
