/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Joseph
 *
 */
public class Salarie extends Intervenant {

	private double monthlyWage;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param monthlyWage
	 */
	public Salarie(String firstName, String lastName, double monthlyWage) {
		super(firstName, lastName);
		this.monthlyWage = monthlyWage;
	}

	@Override
	public double getSalaire() {
		return monthlyWage;
	}

	/**
	 * @return the monthlyWage
	 */
	public double getMonthlyWage() {
		return monthlyWage;
	}

	/**
	 * @param monthlyWage the monthlyWage to set
	 */
	public void setMonthlyWage(double monthlyWage) {
		this.monthlyWage = monthlyWage;
	}

}
