/**
 * @author Zimroid
 * @version v0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Map.Map;

/**
 * Les actions de la fenetre de d�part
 */
class Action implements ActionListener
{
	String s = "";
	
	/**
	 * @param String s le param�tre envoy� par le bouton click�
	 */
	public Action(String s)
	{
		this.s = s;
	}
	
	/**
	 * @param ActionEvent e l'action qui viens de se d�clencher
	 */
    public void actionPerformed(ActionEvent e)
    {
    	if(this.s == "play") {
    		//G�n�ration de l'objet map gr�ce � un fichier
    		
    		ArrayList<Integer> map = new ArrayList<Integer>();
    		try{
    			InputStream ips = new FileInputStream("1.map"); 
    			InputStreamReader ipsr = new InputStreamReader(ips);
    			BufferedReader br = new BufferedReader(ipsr);
    			String ligne;
    			int mapLigne = 0;
    			int mapColone = 0;
    			while ((ligne = br.readLine()) != null) {
    				String[] number = ligne.split(",");
    				for(String n : number) {
    					map.add(Integer.parseInt(n));
    				}
    				mapLigne++;
    				mapColone = number.length;
    				//System.out.println(mapLigne+" "+mapColone);
    			}
    			br.close();
    			Map m = new Map(mapLigne, mapColone, map);
    			m.display();
    		}		
    		catch (Exception ex) {
    			System.out.println(ex.toString());
    		}
    	}
    	else {
    		
    	}
    	
    }               
}