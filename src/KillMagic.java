import java.util.*;

/**
 * KillMagic.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 * This is the KillMagic class. This automatically
 * kills the player if he does not have protection.
 */
public class KillMagic extends Magic{
	
	/**
	 * The constructor for kill magic.
	 * @param room Number Which room the magic is contained.
	 * @param item The item that protects against this magic.
	 * @param name Name of the magic
	 * @param damage How much damage the magic deals (100)
	 */
	public KillMagic(int roomNumber, ArrayList<Items> item,  
			String name) {
		super(roomNumber, item, name);
	}
	
	/**
	 * The magic always deals 100 damage.
	 * @return
	 */
	public double getDamage() {
		return 100;
	}
}
