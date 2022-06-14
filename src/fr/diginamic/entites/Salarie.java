package fr.diginamic.entites;

public class Salarie {

	private String firstName;
	private String lastName;
	private double wage;
	/**
	 * @param firstName
	 * @param lastName
	 * @param wage
	 */
	public Salarie(String firstName, String lastName, double wage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.wage = wage;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getWage() {
		return wage;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
}
