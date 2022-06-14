package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		System.out.println("premier charactere : " + chaine.charAt(0));
		
		System.out.println("taille de la chaine : " + chaine.length());
		
		System.out.println("index du premier ; : " + chaine.indexOf(";"));
		
		String nomDeFamille = chaine.substring(0, chaine.indexOf(";"));
		System.out.println("Nom de famille : " + nomDeFamille);
		
		System.out.println("NOM DE FAMILLE : " + nomDeFamille.toUpperCase());
		
		System.out.println("nom de famille : " + nomDeFamille.toLowerCase());
		
		String[] parsedChaine = chaine.split(";");
		
		for (int i = 0; i < parsedChaine.length; i++) {
			System.out.println(parsedChaine[i]);
		}
		
		Salarie salarie1 = new Salarie(parsedChaine[0], parsedChaine[1], Double.parseDouble(parsedChaine[2].replace(" ", "")));
	}

}
