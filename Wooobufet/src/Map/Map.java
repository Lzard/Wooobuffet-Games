/**
 * @author Zimroid
 * @version v0
 */

package Map;

import java.util.ArrayList;

import Util.window;

public class Map {
	
	private int[][] tab;
	private int width;
	private int height;
	private int TILE_SIZE = 32;
	
	/**
	 * @param int x la largeur de la map en case
	 * @param int y la hauteur de la map en case
	 * @param int[][] tab le contenu de chaque case
	 */
	public Map(int x, int y, int[][] tab)
	{
		this.tab = new int[x][y];
		this.width = x;
		this.height = y;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				this.tab[i][j] = tab[i][j];
			}
		}
	}
	
	/**
	 * @param int x la largeur de la map en case
	 * @param int y la hauteur de la map en case
	 * @param ArrayList<Integer> tab le contenu de chaque case (en une ligne, gérer comme les offsets)
	 */
	public Map(int x, int y, ArrayList<Integer> tab)
	{
		int offset;
		this.tab = new int[x][y];
		this.width = x;
		this.height = y;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				offset = i*y+j;
				this.tab[i][j] = tab.get(offset);
			}
		}
	}
	
	/**
	 * @return int la largeur de la map
	 */
	public int getWidth()
	{
		return this.width;
	}
	
	/**
	 * @return int la hauteur de la map
	 */
	public int getHeight()
	{
		return this.height;
	}
	
	/**
	 * @return int la hauteur de la map
	 */
	public int[][] getTab()
	{
		return this.tab;
	}
	
	public ArrayList<Integer> getList()
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int[] i : this.tab)
		{
			for(int j : i)
			{
				res.add(j);
			}
		}
		return res;
	}
	
	/**
	 * Affiche la fenêtre map
	 */
	public void display()
	{
		/*for(int[] i : tab) {
			for(int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		MapWindows fenetre = new MapWindows(this);
		fenetre.setSize(this.TILE_SIZE*this.width, this.TILE_SIZE*this.height);
		//fenetre.setSize(1000, 1000);
		fenetre.setTitle("Map");
		//fenetre.setResizable(false);
		window.centreWindow(fenetre);
		fenetre.setVisible(true);
	}

}
