/**
 * @author auteur	classe	Nom de l'auteur de la classe.
 * @version version	classe	Version de la classe.
 * @deprecated description	classe, constructeur, m�thode, champ	Marquer l'entit� comme obsol�te (ancienne version), d�crire pourquoi et par quoi la remplacer.
Si l'entit� marqu�e comme obsol�te par cet attribut est utilis�e, le compilateur donne un avertissement.
 * @see r�f�rence	classe, constructeur, m�thode, champ	Ajouter un lien dans la section "Voir aussi".
 * @param description de l'id	constructeur et m�thode	D�crire un param�tre de m�thode.
 * @return description	m�thode	D�crire la valeur retourn�e par une m�thode.
 * @exception
 */


import javax.swing.JFrame;

import Util.window;

public class Main {

	/**
	 * Lance le jeu
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame fenetre = new StartWindow();
		fenetre.setSize(100, 100);
		fenetre.setTitle("Wooobufet");
		fenetre.setResizable(false);
		fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
		window.centreWindow(fenetre);
		fenetre.setVisible(true);
	}

}
