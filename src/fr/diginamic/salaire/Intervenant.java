package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String firstName;
	private String lastName;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Intervenant(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public abstract double getSalaire();
	public abstract String getStatus();
	
	public void afficherDonnees() {
		System.out.printf("le %s nommé %s %s gagne %.1f euros ce mois ci\n", this.getStatus(), this.firstName, this.lastName, this.getSalaire());
	}

}
