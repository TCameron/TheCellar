/**
 * TheCellar.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */
import java.util.ArrayList;

/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class TheCellar {

	private ArrayList<Rooms> rooms;
	private ArrayList<Halls> halls;
	private ArrayList<Items> items;
	private Player player;
	
	public TheCellar(ArrayList<Rooms> rooms, ArrayList<Halls> halls, ArrayList<Items> items, Player player) {
		this.rooms = rooms;
		this.halls = halls;
		this.items = items;
		this.player = player;
	}
	
	public static void main(String args[]) {
		
		
		
		ArrayList<Rooms> rooms = new ArrayList<Rooms>();
		ArrayList<Halls> halls = new ArrayList<Halls>();
		Halls hall = new Halls("Bobby");
		halls.add(hall);
		
		ArrayList<Items> items = new ArrayList<Items>();
		Items newitem = new Items("Dagger");
		Items newitem2 = new Items("Rope");
		Items newitem3 = new Items("Lantern");
		Items newitem4 = new Items("Oil");
		items.add(newitem);
		items.add(newitem2);
		items.add(newitem3);
		items.add(newitem4);
		
		ArrayList<Magic> magic = new ArrayList<Magic>();
		Magic newmagic = new KillMagic(0, items, "Flame");
		magic.add(newmagic); 
		
		Player player = new Player("Billy Bob", 100, items, 0);
		
		TheCellar cellar = new TheCellar(rooms, halls, items, player);
		
		Rooms room0 = new Rooms(0, items, magic, halls);
		Gamegui newgame = new Gamegui(player, room0);
	}
}
