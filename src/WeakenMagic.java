import java.util.ArrayList;

/**
 * WeakenMagic.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class WeakenMagic extends Magic {
	private double damage = 0;
	
	/**
	 * Constructor
	 * @param roomNumber Which room the magic is located in.
	 * @param item The magic's weakness.
	 * @param name The magic's name.
	 * @param damage How much damage the magic does.
	 */
	public WeakenMagic(int roomNumber, ArrayList<Items> item, 
			String name, double damage) {
		super(roomNumber, item, name);
		this.damage = damage;
		
	}
	
	/**
	 * Returns the amount of damage it deals.
	 * @return
	 */
	public double getDamage() {
		return damage;
	}

}
