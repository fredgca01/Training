package designpattern.observer;

public class Moteur implements Observer {

	@Override
	public void notifier() {
		System.out.println("Moteur a recu la notif");
        // Verification que l'étage soit dans les bornes autorisées.
	}
}
