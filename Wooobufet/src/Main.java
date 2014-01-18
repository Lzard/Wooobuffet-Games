/**
 * @author auteur	classe	Nom de l'auteur de la classe.
 * @version version	classe	Version de la classe.
 * @deprecated description	classe, constructeur, méthode, champ	Marquer l'entité comme obsolète (ancienne version), décrire pourquoi et par quoi la remplacer.
Si l'entité marquée comme obsolète par cet attribut est utilisée, le compilateur donne un avertissement.
 * @see référence	classe, constructeur, méthode, champ	Ajouter un lien dans la section "Voir aussi".
 * @param description de l'id	constructeur et méthode	Décrire un paramètre de méthode.
 * @return description	méthode	Décrire la valeur retournée par une méthode.
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
