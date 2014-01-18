/**
 * @author Zimroid
 * @version v0
 */

package Map;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MapWindows extends JFrame
{
	
	public MapWindows(Map map)
	{
		// On appel Tileset qui se chargera de créer correctement la map
		JPanel jp1 = new Tilset(map);

		this.add(jp1, BorderLayout.CENTER);
	}
}