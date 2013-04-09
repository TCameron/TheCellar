import java.util.*;

/**
 * Player.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

/**
 * @author Andrew Gray, Timothy Cameron
 * This is the player that the person controls in game.
 */
public class Player {
	
	private ArrayList<Items> inventory;
	private double hitPoints = 100.0;
	private String name;
	private int room;

	/**
	 * Constructor
	 * @param name The players name
	 * @param hitPoints The amount of HP left
	 * @param inventory The player's current inventory
	 */
	public Player(String name, double hitPoints, ArrayList<Items> inventory, int room) {
		 this.name = name;
		 this.hitPoints = hitPoints;
		 this.inventory = inventory;
		 this.room = room;
	}
	
	/**
	 * Returns name of player
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the players current HP
	 * @return
	 */
	public double getHP() {
		return hitPoints;
	}
	
	/**
	 * Returns the player's current inventory
	 * @return
	 */
	public ArrayList<Items> getInv() {
		return inventory;
	}
	
	/**
	 * Returns true if the player has more than 0 HP
	 * @return
	 */
	public boolean isAlive() {
		if(hitPoints > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Deals damage to the player
	 * @param damage Amount of damage to be dealt
	 */
	public void takeDamage(int damage) {
		hitPoints -= damage;
	}
	
	/**
	 * Returns name and HP. Used for debugging.
	 */
	public String toString() {
		String S = name + " has " + hitPoints + " hitpoints.";
		return S;
	}
	
	/**
	 * Gets the current room number.
	 * @return
	 */
	public int getRoom() {
		return room;
	}
	
	/**
	 * Moves the player to the room in the parameter.
	 * @param room Room to move to
	 */
	public void move(int room) {
		
	}
	
	/**
	 * Pick up an item from the room.
	 * @param item Item to be picked up
	 */
	public void pickUp(Items item) {
		inventory.add(item);
		System.out.println(item + " was added to your inventory");
	}
		
	/**
	 * Drops an item.
	 * @param inventory Item to be dropped
	 */
	public void drop(ArrayList<Items> inventory) {
		inventory.remove(inventory);
		System.out.println(inventory + " was removed from your inventory");
	}
}
