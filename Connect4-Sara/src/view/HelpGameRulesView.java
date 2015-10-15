/**
 * Connect-Four
 * Submitted for the Degree of B.Sc. in Computer Science, 2013/2014
 * University of Strathclyde
 * Department of Computer and Information Sciences
 * @author Sara Torabi
 *
 */
package view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * This class is to create the Game Rules option in the help menu.  
 * 
 */
public class HelpGameRulesView extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private  final Image image;

	public HelpGameRulesView() {
		image = loadImage("connect4.JPG");
		setLayout(null);
	}
	
	private Image loadImage(String filename) {
		URL url = this.getClass().getResource(filename);
		if(url == null) { System.out.println(filename);}
		return new ImageIcon(url).getImage();
	}

	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}
