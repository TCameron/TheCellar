import java.util.ArrayList;

/**
 * WarpMagic.java
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class WarpMagic extends Magic{
	
	private int warpNumber = 0;
	
	/**
	 * Constructor
	 * @param roomNumber The room the magic is contained in.
	 * @param item The magic's weakness.
	 * @param name The name of the magic.
	 * @param warpNumber Where the magic warps the player to.
	 */
	public WarpMagic(int roomNumber, ArrayList<Items> item,
			String name, int warpNumber) {
		super(roomNumber, item, name);
		this.warpNumber = warpNumber;
	}

	public int getRoom() {
		return warpNumber;
	}
	
}
