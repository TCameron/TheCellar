import java.util.Collection;

/**
 * Items.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 * These are the items that are picked up,
 * dropped, etc.
 */
public class Items {
	private String name = "";
	
	/**
	 * Sets the name of the item.
	 * @param name
	 */
	public Items(String name) {
		this.name = name;
	}

	/**
	 * Returns the item's name.
	 * @return
	 */
	public String getName() {
		return name;
	}
}
