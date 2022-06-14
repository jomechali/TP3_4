package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteMax;
	private int nombreClientsInscrits;
	private float recette;
	
	/**
	 * @param nom
	 * @param capaciteMax
	 * @param nombreClientsInscrits
	 * @param recette
	 */
	public Theatre(String nom, int capaciteMax, int nombreClientsInscrits, float recette) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.nombreClientsInscrits = nombreClientsInscrits;
		this.recette = recette;
	}
	
	/**
	 * @param nom
	 * @param capaciteMax
	 */
	public Theatre(String nom, int capaciteMax) {
		this(nom, capaciteMax, 0, 0.0f);
	}

	public void inscrire(int nombreNouveauxClients, float prixPlaces) {
		if (nombreNouveauxClients > (capaciteMax - nombreClientsInscrits)) {
			System.out.println("il n'y a pas assez de place");
			return;
		}
		
		nombreClientsInscrits += nombreNouveauxClients;
		recette += nombreNouveauxClients * prixPlaces;
	}

	public String getNom() {
		return nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public int getNombreClientsInscrits() {
		return nombreClientsInscrits;
	}

	public float getRecette() {
		return recette;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
