/**
 * Halls.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */
import java.util.Collection;
/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class Halls {
	
	private String name;
	
	/**
	 * Constructor
	 * @param name Name of the hall
	 * @param rooms Which rooms are connected
	 */
	public Halls(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the hall name.
	 * @return
	 */
	public String getName() {
		return name;
	}
}
