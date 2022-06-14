package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficherForme(Forme shape) {
		System.out.printf("%s \tperimetre = %.2f \tsurface = %.2f\n", shape.getClass(), shape.calculerPerimetre(), shape.calculerSurface());
	}
}
