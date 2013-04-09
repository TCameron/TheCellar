import java.util.*;

/**
 * Magic.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 * This is the main class for the types of magic.
 */
public abstract class Magic{
	private String name;
	private ArrayList<Items> item = null;
	private int roomNumber;
	
	/**
	 * Constructor for magic
	 * @param roomNumber The room where the magic is contained.
	 * @param item The magic's weakness.
	 * @param name The name of the magic.
	 */
	public Magic(int roomNumber, ArrayList<Items> item, 
			String name) {	
		this.roomNumber = roomNumber;
		this.name = name;
		this.item = item;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Items> getWeakness() {
		return item;
	}
	
	public int getRoom() {
		return roomNumber;
	}
}
