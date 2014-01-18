/**
 * @author Zimroid
 * @version v0
 */

package Map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Tilset extends JPanel {
        
	private BufferedImage image;
	private Map map;
	private int widthMap;
	private int widthTilset = 0;
	private int TILE_SIZE = 32;

    public Tilset(Map map) {
    	this.map = map;
    	this.widthMap = map.getWidth();
		try {                
			image = ImageIO.read(new File("tile.png"));
			this.widthTilset = image.getWidth()/this.TILE_SIZE;
		} catch (IOException ex) {
		
		}
    }
        
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xInImg;
		int yInImg;
		int xPos = 0;
		int yPos = 0;
		Boolean premiereLigne = true;
		//g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters      
		/*g.drawImage(image.getSubimage(0, 0, 32, 32), 0, 0, null);
		g.drawImage(image.getSubimage(64, 0, 32, 32), 32, 0, null);
		g.drawImage(image.getSubimage(288, 224, 32, 32), 0, 0, null);*/
		
		for(int tile : map.getList())
		{
			xInImg = (tile % this.widthTilset)*this.TILE_SIZE;
			yInImg = (tile / this.widthTilset)*this.TILE_SIZE;
			if(!premiereLigne) {
				xPos = (xPos + this.TILE_SIZE)%(this.widthMap * this.TILE_SIZE);
				if(xPos == 0) {
					yPos = yPos + this.TILE_SIZE;
				}
			}
			premiereLigne = false;
			//if(tile == 15)
			//System.out.println("xInImg:"+xInImg+" yInImg:"+yInImg+" xPos:"+xPos+" yPos:"+yPos);
			g.drawImage(image.getSubimage(xInImg, yInImg, this.TILE_SIZE, this.TILE_SIZE), xPos, yPos, null);
		}
	}
}
