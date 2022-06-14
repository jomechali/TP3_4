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

}
