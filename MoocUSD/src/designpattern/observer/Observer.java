package designpattern.observer;

/*
 *  Prévenir des objets observateurs, enregistrés auprès d'un objet observé, d'un événement.
 *  Un objet doit connaitre les changements d'état d'un autre objet. L'objet doit être informé immédiatement
 */
public interface Observer {
	public void notifier();
}
