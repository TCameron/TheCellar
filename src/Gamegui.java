
/**
 * Gamegui.java
 * 
 * Version:
 * $Id:$
 * Revisions:
 * $Log:$
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author Andrew Gray, Timothy Cameron
 *
 */
public class Gamegui extends JFrame {
	
	public Gamegui(Player player, Rooms room) {
		
		//Building the Menu Bar of the Gamegui!!!!
		setLayout(new BorderLayout());
		
		JMenuBar menuBar;
		JMenu passthrough;
		JMenuItem menuItem;
		
		Drop dorp = new Drop(player);
		JMenu dropMenu = dorp.dropMenu();
		
		pickUp upPick = new pickUp(room, player);
		JMenu pickUpMenu = upPick.pickUpMenu();
		
		passThrough throughPass = new passThrough(player, room);
		JMenu passThroughMenu = throughPass.passThroughRoom();
		
		menuBar = new JMenuBar();
		
		menuBar.add(pickUpMenu);
		menuBar.add(dropMenu);
		menuBar.add(passThroughMenu);

		add(menuBar, BorderLayout.NORTH);
		
		//Building the Text Field of the Gamegui!!!!
		TextField output = new TextField();
		output.setEditable(false);
		output.setBackground(Color.white);
		add(output, BorderLayout.CENTER);
		
		//Building the Bottom Panel of the Gamegui!!!!
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		TextField lifeLevel = new TextField("Life Level:");
		lifeLevel.setEditable(false);
		panel.add(lifeLevel, BorderLayout.WEST);
		
		JButton amulet = new JButton("Get Amulet!");
		getAmulet amuletButton = new getAmulet();
		amulet.addActionListener(amuletButton);
		panel.add(amulet, BorderLayout.CENTER);
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent click) { 
            	System.exit(0);
           }               
		});
		panel.add(quit, BorderLayout.EAST);
		
		add(panel, BorderLayout.SOUTH);
		
		setTitle("The Cellar");
	    setSize(300, 200);
	    setLocation(100, 100);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Listener for the Get Amulet button.
	 * @author Andrew Gray, Timothy Cameron
	 *
	 */
	class getAmulet implements ActionListener {
		 public void actionPerformed(ActionEvent e) {		   
	        		
		 }
	}
	
}
