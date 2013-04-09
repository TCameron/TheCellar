/**
 * Rooms.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */
import java.util.ArrayList;

/**
 * @author Andrew Gray, Timothy Cameron
 * These are the rooms that the player passes through.
 * They contain items and magic.
 */
public class Rooms {
	
	int roomNumber = 0;
	ArrayList<Items> items;
	ArrayList<Magic> magic;
	ArrayList<Halls> halls;
	
	/**
	 * Constructor
	 * @param roomNumber The room's number
	 * @param items What items the room holds
	 * @param magic What magics are in the room
	 * @param halls Which halls are connected to it
	 */
	public Rooms(int roomNumber, ArrayList<Items> items, ArrayList<Magic> magic, 
			ArrayList<Halls> halls) {
		
		this.roomNumber = roomNumber;
		this.items = items;
		this.magic = magic;
		this.halls = halls;
		
	}
	
	/**
	 * Returns the room's number
	 * @return
	 */
	public int getNumber() {
		return roomNumber;
	}
	
	/**
	 * Returns the list of magic
	 * @return
	 */
	public ArrayList<Magic> getMagic() {
		return magic;
	}
	
	/**
	 * Returns the list of items
	 * @return
	 */
	public ArrayList<Items> getItems() {
		return items;
	}
	
	/**
	 * Returns true if the room has the amulet
	 * @return
	 */
	public boolean hasAmulet() {
		if(items.contains("amulet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * Returns the connecting halls.
	 * @return
	 */
	public ArrayList<Halls> getHalls() {
		return halls;
	}
}
