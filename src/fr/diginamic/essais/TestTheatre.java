package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre t1 = new Theatre("Patate", 100);
		final int gensAInscrireParGroupe = 9;
		final float prixPlacePourGroupe = 5.5f;
		
		while (t1.getCapaciteMax() >= t1.getNombreClientsInscrits() + gensAInscrireParGroupe) {
			t1.inscrire(gensAInscrireParGroupe, prixPlacePourGroupe);
		}
		
		t1.inscrire(gensAInscrireParGroupe, prixPlacePourGroupe);
		
		System.out.printf("quand le theatre est plein, il y a %d personnes, pour une recette de %f", t1.getNombreClientsInscrits(), t1.getRecette());

	}

}
