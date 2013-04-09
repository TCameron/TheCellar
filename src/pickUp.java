/**
 * pickUp.java
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
 *
 */
public class pickUp implements ActionListener {

	Rooms room;
	Player player;
	
	public pickUp(Rooms room, Player player) {

		this.room = room;
		this.player = player;
	}
	
	/**
	 * 
	 * @param None
	 * Builds the pickUpMenu for the gui
	 */
	public JMenu pickUpMenu() {
		JMenu menu = new JMenu("Pick Up");
		ArrayList<Items> items = room.getItems();
		for (Items item: items){
			JMenuItem menuItem = new JMenuItem(item.getName());
			pickUp MenuItem = new pickUp(room, player);
			menuItem.addActionListener(MenuItem);
			menu.add(menuItem);
		}
		return menu;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}


}
