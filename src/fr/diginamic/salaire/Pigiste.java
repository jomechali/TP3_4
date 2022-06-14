/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Joseph
 *
 */
public class Pigiste extends Intervenant {

	private int workedDays;
	private double dailyPay;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param workedDays
	 * @param dailyPay
	 */
	public Pigiste(String firstName, String lastName, int workedDays, double dailyPay) {
		super(firstName, lastName);
		this.workedDays = workedDays;
		this.dailyPay = dailyPay;
	}

	@Override
	public double getSalaire() {
		return dailyPay * workedDays;
	}

	/**
	 * @return the workedDays
	 */
	public int getWorkedDays() {
		return workedDays;
	}

	/**
	 * @return the dailyPay
	 */
	public double getDailyPay() {
		return dailyPay;
	}

	/**
	 * @param workedDays the workedDays to set
	 */
	public void setWorkedDays(int workedDays) {
		this.workedDays = workedDays;
	}

	/**
	 * @param dailyPay the dailyPay to set
	 */
	public void setDailyPay(double dailyPay) {
		this.dailyPay = dailyPay;
	}

}
