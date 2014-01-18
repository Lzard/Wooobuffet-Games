/**
 * @author Zimroid
 * @version v0
 */

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * La fenetre de départ
 */
class StartWindow extends JFrame
{
	
	public StartWindow()
	{
		JPanel jp1 = new JPanel();

		this.add(jp1, BorderLayout.CENTER);

		JButton play = new JButton("Play");
		JButton edit = new JButton("Edit");
		jp1.add(play);
		jp1.add(edit);

		play.addActionListener(new Action("play"));
		edit.addActionListener(new Action("edit"));
	}
}