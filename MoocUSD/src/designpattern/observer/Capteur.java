package designpattern.observer;

public class Capteur extends Observable {
	private boolean detecteVariation;
	
	// Le code de la boucle while en environnement Threadé
    public void run() {
        while(true){
            if(detecteVariation)
                notifierObservateurs();
        }
    }

    
}
