/**
 * Drop.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class Drop implements ActionListener{

	Player player;
	
	public Drop(Player player) {
		this.player = player;
	}
	
	/**
	 * 
	 * @param None
	 * Builds the dropMenu for the gui
	 */
	public JMenu dropMenu() {
		JMenu menu = new JMenu("Drop");
		ArrayList<Items> items = player.getInv();
		for (Items item: items){
			JMenuItem menuItem = new JMenuItem(item.getName());
			Drop MenuItem = new Drop(player);
			menuItem.addActionListener(MenuItem);
			menu.add(menuItem);
		}
		return menu;
	}

	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Drop");
	}

	
	
}
