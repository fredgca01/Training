package designpattern.state;

/*
 * Changer le comportement d'un objet selon son état interne.
 * 
 */
public interface PlayerState {
	void action(Player p);
}
