/**
 * passThrough.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 * @author Andrew Gray, Timothy Cameron
 * This class controls the pass through gui menu
 */
public class passThrough implements ActionListener {

	Player player;
	Rooms room;
	
	/**
	 * Constructor
	 * @param player The player
	 * @param room The current room
	 */
	public passThrough(Player player, Rooms room) {
		this.player = player;
		this.room = room;
	}
	
	/**
	 * Builds the passThroughMenu for the gui
	 * @param None
	 */
	public JMenu passThroughRoom() {
		JMenu menu = new JMenu("Pass Through");
		for (Halls hall: room.getHalls()){
			JMenuItem menuItem = new JMenuItem(hall.getName());
			Drop MenuItem = new Drop(player);
			menuItem.addActionListener(MenuItem);
			menu.add(menuItem);
		}
		return menu;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
