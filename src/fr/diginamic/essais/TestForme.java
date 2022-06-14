package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Forme[] shapesToTestFormes = new Forme[3];
		shapesToTestFormes[0] = new Cercle(5.2);
		shapesToTestFormes[1] = new Rectangle(15, 20);
		shapesToTestFormes[2] = new Carre(10);
		
		for (int i = 0; i < shapesToTestFormes.length; i++) {
			AffichageForme.afficherForme(shapesToTestFormes[i]);
		}

	}

}
